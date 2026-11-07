package wi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class g extends CameraCaptureSession.CaptureCallback {
    public final k f57871a;

    public g(k kVar) {
        this.f57871a = kVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i7;
        Object valueOf;
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        k kVar = this.f57871a;
        o oVar = kVar.f57930j;
        if (cameraCaptureSession == kVar.A) {
            if (kVar.Q) {
                Object tag = captureRequest.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == kVar.U) {
                    kVar.R++;
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                    if (!kVar.P ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (kVar.P && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 && z11) {
                        oVar.b("torch result confirmed: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + kVar.R + ", retries=" + kVar.S);
                        kVar.Q = false;
                    } else {
                        int i11 = kVar.R;
                        if (i11 == 3 && (i10 = kVar.S) == 0) {
                            kVar.S = i10 + 1;
                            kVar.R = 0;
                            oVar.b("torch result not applied; rebuilding request: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2);
                            kVar.f();
                        } else if (i11 >= 6) {
                            oVar.b("torch result failed: enabled=" + kVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + kVar.S);
                            kVar.Q = false;
                        }
                    }
                }
            }
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && l10.longValue() > kVar.X0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (kVar.W0 == 0) {
                    kVar.W0 = l10.longValue();
                    kVar.Y0 = 1L;
                } else {
                    long longValue = l10.longValue() - kVar.X0;
                    kVar.f57907a1++;
                    kVar.f57910b1 += longValue;
                    double d = longValue;
                    kVar.f57913c1 = (d * d) + kVar.f57913c1;
                    long j3 = kVar.f57915d1;
                    if (j3 == 0 || longValue < j3) {
                        kVar.f57915d1 = longValue;
                    }
                    kVar.f57918e1 = Math.max(kVar.f57918e1, longValue);
                    if (longValue > 50000000) {
                        kVar.f57921f1++;
                    }
                    if (longValue > 100000000) {
                        kVar.f57924g1++;
                    }
                    kVar.Y0++;
                }
                long j10 = kVar.Z0;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    kVar.f57926h1++;
                    kVar.f57929i1 += j11;
                    kVar.f57932j1 = Math.max(kVar.f57932j1, j11);
                }
                kVar.Z0 = elapsedRealtimeNanos;
                kVar.X0 = l10.longValue();
                long longValue2 = l10.longValue() - kVar.W0;
                if (longValue2 >= 3000000000L) {
                    float f10 = (((float) (kVar.Y0 - 1)) * 1.0E9f) / ((float) longValue2);
                    p0 p0Var = kVar.J;
                    if (p0Var == null) {
                        i7 = 0;
                    } else {
                        i7 = p0Var.f58031a;
                    }
                    StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                    sb2.append(f10);
                    sb2.append(", requestedFps=");
                    sb2.append(kVar.h.f58031a);
                    sb2.append(", activeFps=");
                    if (i7 == 0) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Integer.valueOf(i7);
                    }
                    sb2.append(valueOf);
                    sb2.append(", targetMet=");
                    if (i7 != 0 && f10 < i7 * 0.85f) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    sb2.append(z9);
                    sb2.append(", fpsRange=");
                    sb2.append(kVar.K);
                    sb2.append(", sensorIntervalMs={avg=");
                    sb2.append(k.i(kVar.f57910b1, kVar.f57907a1));
                    sb2.append(", min=");
                    sb2.append(((float) kVar.f57915d1) / 1000000.0f);
                    sb2.append(", max=");
                    sb2.append(((float) kVar.f57918e1) / 1000000.0f);
                    sb2.append(", jitter=");
                    sb2.append(k.V(kVar.f57913c1, kVar.f57910b1, kVar.f57907a1));
                    sb2.append("}, sensorGaps={over50ms=");
                    sb2.append(kVar.f57921f1);
                    sb2.append(", over100ms=");
                    sb2.append(kVar.f57924g1);
                    sb2.append("}, callbackIntervalMs={avg=");
                    sb2.append(k.i(kVar.f57929i1, kVar.f57926h1));
                    sb2.append(", max=");
                    sb2.append(((float) kVar.f57932j1) / 1000000.0f);
                    sb2.append("}");
                    oVar.b(sb2.toString());
                    kVar.O();
                    kVar.W0 = l10.longValue();
                    kVar.X0 = l10.longValue();
                    kVar.Y0 = 1L;
                    kVar.Z0 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
