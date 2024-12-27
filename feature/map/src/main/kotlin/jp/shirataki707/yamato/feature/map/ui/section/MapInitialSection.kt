package jp.shirataki707.yamato.feature.map.ui.section

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import jp.shirataki707.yamato.core.ui.common.CommonErrorContent
import jp.shirataki707.yamato.core.ui.common.ParcelableResult

@Composable
internal fun MapInitialSection(
    sectionState: MapInitialSectionState,
) {
    if (sectionState.mapResources is ParcelableResult.Failure) {
        CommonErrorContent(
            onReloadButtonClick = sectionState.initialLoadIfNeeded,
            modifier = Modifier.fillMaxSize(),
        )
    }
}