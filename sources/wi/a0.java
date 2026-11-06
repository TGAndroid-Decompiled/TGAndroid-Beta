package wi;

import android.opengl.GLES20;
public final class a0 extends y {
    public final int f57798f;
    public final int f57799g;
    public final int h;

    public a0() {
        super("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D hTexture;\nuniform vec2 sampleStepX;\nuniform vec2 sampleStepY;\nuniform float historyWeight;\nvoid main() {\n    vec3 current = texture2D(sTexture, vTextureCoord).rgb * 0.25;\n    current += (texture2D(sTexture, vTextureCoord + sampleStepX).rgb\n            + texture2D(sTexture, vTextureCoord - sampleStepX).rgb\n            + texture2D(sTexture, vTextureCoord + sampleStepY).rgb\n            + texture2D(sTexture, vTextureCoord - sampleStepY).rgb) * 0.125;\n    current += (texture2D(sTexture, vTextureCoord + sampleStepX + sampleStepY).rgb\n            + texture2D(sTexture, vTextureCoord + sampleStepX - sampleStepY).rgb\n            + texture2D(sTexture, vTextureCoord - sampleStepX + sampleStepY).rgb\n            + texture2D(sTexture, vTextureCoord - sampleStepX - sampleStepY).rgb) * 0.0625;\n    vec3 history = texture2D(hTexture, vScreenTextureCoord).rgb;\n    float difference = dot(abs(current - history), vec3(0.333333));\n    float motion = smoothstep(0.035, 0.18, difference);\n    float weight = mix(historyWeight, historyWeight * 0.65, motion);\n    gl_FragColor = vec4(mix(current, history, weight), 1.0);\n}\n", 0);
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f2947a, "hTexture");
        this.f57798f = GLES20.glGetUniformLocation(this.f2947a, "sampleStepX");
        this.f57799g = GLES20.glGetUniformLocation(this.f2947a, "sampleStepY");
        this.h = GLES20.glGetUniformLocation(this.f2947a, "historyWeight");
        GLES20.glUseProgram(this.f2947a);
        GLES20.glUniform1i(glGetUniformLocation, 1);
    }
}
