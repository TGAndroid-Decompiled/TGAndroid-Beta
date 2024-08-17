package org.webrtc;

import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase;

public interface EglBase10 extends EglBase {

    public interface Context extends EglBase.Context {
        EGLContext getRawContext();
    }
}
