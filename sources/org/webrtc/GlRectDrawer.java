package org.webrtc;

import org.webrtc.GlGenericDrawer;
public class GlRectDrawer extends GlGenericDrawer {
    private static final String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    public GlRectDrawer() {
        super("void main() {\n  gl_FragColor = sample(tc);\n}\n", new ShaderCallbacks(0));
    }

    @Override
    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super.drawOes(i, fArr, i2, i3, i4, i5, i6, i7);
    }

    @Override
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super.drawRgb(i, fArr, i2, i3, i4, i5, i6, i7);
    }

    @Override
    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super.drawYuv(iArr, fArr, i, i2, i3, i4, i5, i6);
    }

    @Override
    public void release() {
        super.release();
    }

    private static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        public ShaderCallbacks(int i) {
            this();
        }

        private ShaderCallbacks() {
        }

        @Override
        public void onNewShader(GlShader glShader) {
        }

        @Override
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
        }
    }
}
