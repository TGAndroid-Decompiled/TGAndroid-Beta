package wi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class g extends CameraCaptureSession.CaptureCallback {
    public final j f57836a;

    public g(j jVar) {
        this.f57836a = jVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i3;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        j jVar = this.f57836a;
        n nVar = jVar.f57884j;
        if (cameraCaptureSession == jVar.A) {
            if (jVar.Q) {
                Object tag = captureRequest.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == jVar.U) {
                    jVar.R++;
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                    if (!jVar.P ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (jVar.P && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z11 && z12) {
                        nVar.b("torch result confirmed: enabled=" + jVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + jVar.R + ", retries=" + jVar.S);
                        jVar.Q = false;
                    } else {
                        int i11 = jVar.R;
                        if (i11 == 3 && (i10 = jVar.S) == 0) {
                            jVar.S = i10 + 1;
                            jVar.R = 0;
                            nVar.b("torch result not applied; rebuilding request: enabled=" + jVar.P + ", resultMode=" + num + ", flashState=" + num2);
                            jVar.g();
                        } else if (i11 >= 6) {
                            nVar.b("torch result failed: enabled=" + jVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + jVar.S);
                            jVar.Q = false;
                        }
                    }
                }
            }
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && l10.longValue() > jVar.Z0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (jVar.Y0 == 0) {
                    jVar.Y0 = l10.longValue();
                    jVar.f57861a1 = 1L;
                } else {
                    long longValue = l10.longValue() - jVar.Z0;
                    jVar.f57867c1++;
                    jVar.f57869d1 += longValue;
                    double d = longValue;
                    jVar.f57872e1 = (d * d) + jVar.f57872e1;
                    long j10 = jVar.f57875f1;
                    if (j10 == 0 || longValue < j10) {
                        jVar.f57875f1 = longValue;
                    }
                    jVar.f57878g1 = Math.max(jVar.f57878g1, longValue);
                    if (longValue > 50000000) {
                        jVar.f57880h1++;
                    }
                    if (longValue > 100000000) {
                        jVar.f57883i1++;
                    }
                    jVar.f57861a1++;
                }
                long j11 = jVar.f57864b1;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    jVar.f57886j1++;
                    jVar.k1 += j12;
                    jVar.f57891l1 = Math.max(jVar.f57891l1, j12);
                }
                jVar.f57864b1 = elapsedRealtimeNanos;
                jVar.Z0 = l10.longValue();
                long longValue2 = l10.longValue() - jVar.Y0;
                if (longValue2 >= 3000000000L) {
                    float f10 = (((float) (jVar.f57861a1 - 1)) * 1.0E9f) / ((float) longValue2);
                    o0 o0Var = jVar.J;
                    if (o0Var == null) {
                        i3 = 0;
                    } else {
                        i3 = o0Var.f57986a;
                    }
                    StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                    sb2.append(f10);
                    sb2.append(", requestedFps=");
                    sb2.append(jVar.h.f57986a);
                    sb2.append(", activeFps=");
                    if (i3 == 0) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Integer.valueOf(i3);
                    }
                    sb2.append(valueOf);
                    sb2.append(", targetMet=");
                    if (i3 != 0 && f10 < i3 * 0.85f) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    sb2.append(z10);
                    sb2.append(", fpsRange=");
                    sb2.append(jVar.K);
                    sb2.append(", sensorIntervalMs={avg=");
                    sb2.append(j.j(jVar.f57869d1, jVar.f57867c1));
                    sb2.append(", min=");
                    sb2.append(((float) jVar.f57875f1) / 1000000.0f);
                    sb2.append(", max=");
                    sb2.append(((float) jVar.f57878g1) / 1000000.0f);
                    sb2.append(", jitter=");
                    sb2.append(j.W(jVar.f57872e1, jVar.f57869d1, jVar.f57867c1));
                    sb2.append("}, sensorGaps={over50ms=");
                    sb2.append(jVar.f57880h1);
                    sb2.append(", over100ms=");
                    sb2.append(jVar.f57883i1);
                    sb2.append("}, callbackIntervalMs={avg=");
                    sb2.append(j.j(jVar.k1, jVar.f57886j1));
                    sb2.append(", max=");
                    sb2.append(((float) jVar.f57891l1) / 1000000.0f);
                    sb2.append("}");
                    nVar.b(sb2.toString());
                    jVar.O();
                    jVar.Y0 = l10.longValue();
                    jVar.Z0 = l10.longValue();
                    jVar.f57861a1 = 1L;
                    jVar.f57864b1 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
