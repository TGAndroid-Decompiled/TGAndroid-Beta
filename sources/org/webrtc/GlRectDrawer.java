package org.webrtc;

import org.webrtc.GlGenericDrawer;

public class GlRectDrawer extends GlGenericDrawer {
    private static final String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    private static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        @Override
        public void onNewShader(GlShader glShader) {
        }

        @Override
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
        }

        private ShaderCallbacks() {
        }
    }

    public GlRectDrawer() {
        super("void main() {\n  gl_FragColor = sample(tc);\n}\n", new ShaderCallbacks());
    }
}
