package org.webrtc;

import android.opengl.EGLContext;

public interface EglBase14 extends EglBase {

    public interface Context extends EglBase.Context {
        EGLContext getRawContext();
    }
}
