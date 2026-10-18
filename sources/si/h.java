package si;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class h extends CameraCaptureSession.CaptureCallback {
    public final k f46648a;

    public h(k kVar) {
        this.f46648a = kVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        k kVar = this.f46648a;
        o oVar = kVar.f46700j;
        if (cameraCaptureSession == kVar.A) {
            if (kVar.Q) {
                Object tag = captureRequest.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == kVar.U) {
                    kVar.R++;
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                    if (!kVar.P ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (kVar.P && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z11 && z12) {
                        oVar.b("torch result confirmed: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + kVar.R + ", retries=" + kVar.S);
                        kVar.Q = false;
                    } else {
                        int i12 = kVar.R;
                        if (i12 == 3 && (i11 = kVar.S) == 0) {
                            kVar.S = i11 + 1;
                            kVar.R = 0;
                            oVar.b("torch result not applied; rebuilding request: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2);
                            kVar.g();
                        } else if (i12 >= 6) {
                            oVar.b("torch result failed: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + kVar.S);
                            kVar.Q = false;
                        }
                    }
                }
            }
            Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l4 != null && l4.longValue() > kVar.Y0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (kVar.X0 == 0) {
                    kVar.X0 = l4.longValue();
                    kVar.Z0 = 1L;
                } else {
                    long longValue = l4.longValue() - kVar.Y0;
                    kVar.f46681b1++;
                    kVar.f46684c1 += longValue;
                    double d = longValue;
                    kVar.f46686d1 = (d * d) + kVar.f46686d1;
                    long j10 = kVar.f46688e1;
                    if (j10 == 0 || longValue < j10) {
                        kVar.f46688e1 = longValue;
                    }
                    kVar.f46691f1 = Math.max(kVar.f46691f1, longValue);
                    if (longValue > 50000000) {
                        kVar.f46694g1++;
                    }
                    if (longValue > 100000000) {
                        kVar.f46696h1++;
                    }
                    kVar.Z0++;
                }
                long j11 = kVar.f46678a1;
                if (j11 != 0) {
                    long j12 = elapsedRealtimeNanos - j11;
                    kVar.f46699i1++;
                    kVar.f46702j1 += j12;
                    kVar.f46705k1 = Math.max(kVar.f46705k1, j12);
                }
                kVar.f46678a1 = elapsedRealtimeNanos;
                kVar.Y0 = l4.longValue();
                long longValue2 = l4.longValue() - kVar.X0;
                if (longValue2 >= 3000000000L) {
                    float f7 = (((float) (kVar.Z0 - 1)) * 1.0E9f) / ((float) longValue2);
                    n0 n0Var = kVar.J;
                    if (n0Var == null) {
                        i10 = 0;
                    } else {
                        i10 = n0Var.f46779a;
                    }
                    StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                    sb2.append(f7);
                    sb2.append(", requestedFps=");
                    sb2.append(kVar.h.f46779a);
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
                    sb2.append(kVar.K);
                    sb2.append(", sensorIntervalMs={avg=");
                    sb2.append(k.j(kVar.f46684c1, kVar.f46681b1));
                    sb2.append(", min=");
                    sb2.append(((float) kVar.f46688e1) / 1000000.0f);
                    sb2.append(", max=");
                    sb2.append(((float) kVar.f46691f1) / 1000000.0f);
                    sb2.append(", jitter=");
                    sb2.append(k.W(kVar.f46686d1, kVar.f46684c1, kVar.f46681b1));
                    sb2.append("}, sensorGaps={over50ms=");
                    sb2.append(kVar.f46694g1);
                    sb2.append(", over100ms=");
                    sb2.append(kVar.f46696h1);
                    sb2.append("}, callbackIntervalMs={avg=");
                    sb2.append(k.j(kVar.f46702j1, kVar.f46699i1));
                    sb2.append(", max=");
                    sb2.append(((float) kVar.f46705k1) / 1000000.0f);
                    sb2.append("}");
                    oVar.b(sb2.toString());
                    kVar.O();
                    kVar.X0 = l4.longValue();
                    kVar.Y0 = l4.longValue();
                    kVar.Z0 = 1L;
                    kVar.f46678a1 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
