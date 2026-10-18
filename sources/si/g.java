package si;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class g extends CameraCaptureSession.CaptureCallback {
    public final j f46595a;

    public g(j jVar) {
        this.f46595a = jVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        j jVar = this.f46595a;
        n nVar = jVar.f46642j;
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
                        int i12 = jVar.R;
                        if (i12 == 3 && (i11 = jVar.S) == 0) {
                            jVar.S = i11 + 1;
                            jVar.R = 0;
                            nVar.b("torch result not applied; rebuilding request: enabled=" + jVar.P + ", resultMode=" + num + ", flashState=" + num2);
                            jVar.g();
                        } else if (i12 >= 6) {
                            nVar.b("torch result failed: enabled=" + jVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + jVar.S);
                            jVar.Q = false;
                        }
                    }
                }
            }
            Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l4 != null && l4.longValue() > jVar.Y0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (jVar.X0 == 0) {
                    jVar.X0 = l4.longValue();
                    jVar.Z0 = 1L;
                } else {
                    long longValue = l4.longValue() - jVar.Y0;
                    jVar.f46623b1++;
                    jVar.f46626c1 += longValue;
                    double d = longValue;
                    jVar.f46628d1 = (d * d) + jVar.f46628d1;
                    long j10 = jVar.f46630e1;
                    if (j10 == 0 || longValue < j10) {
                        jVar.f46630e1 = longValue;
                    }
                    jVar.f46633f1 = Math.max(jVar.f46633f1, longValue);
                    if (longValue > 50000000) {
                        jVar.f46636g1++;
                    }
                    if (longValue > 100000000) {
                        jVar.f46638h1++;
                    }
                    jVar.Z0++;
                }
                long j11 = jVar.f46620a1;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    jVar.f46641i1++;
                    jVar.f46644j1 += j12;
                    jVar.f46647k1 = Math.max(jVar.f46647k1, j12);
                }
                jVar.f46620a1 = elapsedRealtimeNanos;
                jVar.Y0 = l4.longValue();
                long longValue2 = l4.longValue() - jVar.X0;
                if (longValue2 >= 3000000000L) {
                    float f7 = (((float) (jVar.Z0 - 1)) * 1.0E9f) / ((float) longValue2);
                    n0 n0Var = jVar.J;
                    if (n0Var == null) {
                        i10 = 0;
                    } else {
                        i10 = n0Var.f46733a;
                    }
                    StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                    sb2.append(f7);
                    sb2.append(", requestedFps=");
                    sb2.append(jVar.h.f46733a);
                    sb2.append(", activeFps=");
                    if (i10 == 0) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Integer.valueOf(i10);
                    }
                    sb2.append(valueOf);
                    sb2.append(", targetMet=");
                    if (i10 != 0 && f7 < i10 * 0.85f) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    sb2.append(z10);
                    sb2.append(", fpsRange=");
                    sb2.append(jVar.K);
                    sb2.append(", sensorIntervalMs={avg=");
                    sb2.append(j.j(jVar.f46626c1, jVar.f46623b1));
                    sb2.append(", min=");
                    sb2.append(((float) jVar.f46630e1) / 1000000.0f);
                    sb2.append(", max=");
                    sb2.append(((float) jVar.f46633f1) / 1000000.0f);
                    sb2.append(", jitter=");
                    sb2.append(j.W(jVar.f46628d1, jVar.f46626c1, jVar.f46623b1));
                    sb2.append("}, sensorGaps={over50ms=");
                    sb2.append(jVar.f46636g1);
                    sb2.append(", over100ms=");
                    sb2.append(jVar.f46638h1);
                    sb2.append("}, callbackIntervalMs={avg=");
                    sb2.append(j.j(jVar.f46644j1, jVar.f46641i1));
                    sb2.append(", max=");
                    sb2.append(((float) jVar.f46647k1) / 1000000.0f);
                    sb2.append("}");
                    nVar.b(sb2.toString());
                    jVar.O();
                    jVar.X0 = l4.longValue();
                    jVar.Y0 = l4.longValue();
                    jVar.Z0 = 1L;
                    jVar.f46620a1 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
