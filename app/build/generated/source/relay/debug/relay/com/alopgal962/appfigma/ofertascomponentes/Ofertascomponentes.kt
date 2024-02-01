package com.alopgal962.appfigma.ofertascomponentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.alopgal962.appfigma.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'ofertascomponentes'.
 * Generated code; do not edit directly
 *
 * @param onOfertascomponentesTapped Para buscar componentes
 */
@Composable
fun Ofertascomponentes(
    modifier: Modifier = Modifier,
    onOfertascomponentesTapped: () -> Unit = {}
) {
    TopLevel(
        onOfertascomponentesTapped = onOfertascomponentesTapped,
        modifier = modifier
    ) {
        Imagencomponente(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 18.0.dp
                )
            )
        )
        Textocomponente(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -40.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 146, heightDp = 118)
@Composable
private fun OfertascomponentesPreview() {
    MaterialTheme {
        RelayContainer {
            Ofertascomponentes(
                onOfertascomponentesTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Imagencomponente(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.ofertascomponentes_imagencomponente),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(146.0.dp).requiredHeight(82.0.dp)
    )
}

@Composable
fun Textocomponente(modifier: Modifier = Modifier) {
    RelayText(
        content = "Componentes",
        fontSize = 16.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(18.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TopLevel(
    onOfertascomponentesTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.background(Color.Transparent).drawWithContent(
            onDraw = {
                drawRect(
                    brush = Brush.linearGradient(
                        0.4f to Color(
                            alpha = 255,
                            red = 58,
                            green = 75,
                            blue = 135
                        ),
                        Float.POSITIVE_INFINITY to Color(
                            alpha = 255,
                            red = 105,
                            green = 133,
                            blue = 231
                        ),
                        start = Offset(
                            0.98f,
                            0.02f
                        ),
                        end = Offset(
                            0.03f,
                            Float.POSITIVE_INFINITY
                        )
                    )
                )
                drawContent()
            }
        ).tappable(onTap = onOfertascomponentesTapped).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
