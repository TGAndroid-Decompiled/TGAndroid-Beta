package rf;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import lh.b7;
import org.telegram.messenger.AndroidUtilities;

public final class j {

    public g f47000a;

    public float f47001b;

    public boolean f47002c;
    public float d;

    public float f47003e;

    public long f47004f;

    public ValueAnimator f47005g;
    public Rect h;

    public Rect f47006i;

    public Rect f47007j;

    public float f47008k;

    public float f47009l;

    public float f47010m;

    public h[] f47011n;

    public final boolean a(int i10, int i11, int i12) {
        h hVar;
        Rect rect = this.f47006i;
        Rect rect2 = this.h;
        h[] hVarArr = this.f47011n;
        if (i12 != 0) {
            if (i12 == 1 && (hVar = hVarArr[0]) != null && hVar.f46994a != 4) {
                if (rect2.contains(i10, i11) && hVarArr[0].f46994a != 1) {
                    h hVar2 = new h(this, 1);
                    hVarArr[1] = hVar2;
                    hVar2.f46996c = this.f47008k;
                    hVar2.f46995b = i10;
                    hVar2.a();
                    ValueAnimator valueAnimator = this.f47005g;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        return true;
                    }
                } else if (rect.contains(i10, i11) && hVarArr[0].f46994a != 2) {
                    h hVar3 = new h(this, 2);
                    hVarArr[1] = hVar3;
                    hVar3.d = this.f47009l;
                    hVar3.f46995b = i10;
                    hVar3.a();
                    ValueAnimator valueAnimator2 = this.f47005g;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                }
                return true;
            }
            return false;
        }
        if (rect2.contains(i10, i11)) {
            h hVar4 = hVarArr[0];
            if (hVar4 != null) {
                hVarArr[1] = hVar4;
            }
            h hVar5 = new h(this, 1);
            hVarArr[0] = hVar5;
            hVar5.f46996c = this.f47008k;
            hVar5.f46995b = i10;
            hVar5.a();
            ValueAnimator valueAnimator3 = this.f47005g;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                return true;
            }
        } else if (rect.contains(i10, i11)) {
            h hVar6 = hVarArr[0];
            if (hVar6 != null) {
                hVarArr[1] = hVar6;
            }
            h hVar7 = new h(this, 2);
            hVarArr[0] = hVar7;
            hVar7.d = this.f47009l;
            hVar7.f46995b = i10;
            hVar7.a();
            ValueAnimator valueAnimator4 = this.f47005g;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
                return true;
            }
        } else {
            if (!this.f47007j.contains(i10, i11)) {
                if (i11 < rect2.bottom && i11 > rect2.top) {
                    this.f47002c = true;
                    this.d = i10;
                    this.f47003e = i11;
                    this.f47004f = System.currentTimeMillis();
                    ValueAnimator valueAnimator5 = this.f47005g;
                    if (valueAnimator5 != null) {
                        if (valueAnimator5.isRunning()) {
                            this.f47000a.a(this.f47008k, this.f47009l, true);
                        }
                        this.f47005g.cancel();
                        return true;
                    }
                }
                return false;
            }
            h hVar8 = new h(this, 4);
            hVarArr[0] = hVar8;
            hVar8.d = this.f47009l;
            hVar8.f46996c = this.f47008k;
            hVar8.f46995b = i10;
            hVar8.a();
            ValueAnimator valueAnimator6 = this.f47005g;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
                return true;
            }
        }
        return true;
    }

    public final boolean b(int i10, int i11) {
        h hVar;
        boolean z10;
        if (this.f47002c || (hVar = this.f47011n[i11]) == null) {
            return false;
        }
        int i12 = hVar.f46994a;
        float f10 = hVar.f46996c;
        float f11 = hVar.d;
        int i13 = hVar.f46995b;
        if (i12 == 1) {
            float f12 = f10 - ((i13 - i10) / this.f47001b);
            this.f47008k = f12;
            if (f12 < 0.0f) {
                this.f47008k = 0.0f;
            }
            float f13 = this.f47009l;
            float f14 = f13 - this.f47008k;
            float f15 = this.f47010m;
            if (f14 < f15) {
                this.f47008k = f13 - f15;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            float f16 = f11 - ((i13 - i10) / this.f47001b);
            this.f47009l = f16;
            if (f16 > 1.0f) {
                this.f47009l = 1.0f;
            }
            float f17 = this.f47009l;
            float f18 = this.f47008k;
            float f19 = f17 - f18;
            float f20 = this.f47010m;
            if (f19 < f20) {
                this.f47009l = f18 + f20;
            }
            z10 = true;
        }
        if (i12 == 4) {
            float f21 = (i13 - i10) / this.f47001b;
            float f22 = f10 - f21;
            this.f47008k = f22;
            this.f47009l = f11 - f21;
            if (f22 < 0.0f) {
                this.f47008k = 0.0f;
                this.f47009l = f11 - f10;
            }
            if (this.f47009l > 1.0f) {
                this.f47009l = 1.0f;
                this.f47008k = 1.0f - (f11 - f10);
            }
            z10 = true;
        }
        if (z10) {
            this.f47000a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i10, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f10;
        float f11;
        h[] hVarArr = this.f47011n;
        if (i10 != 0) {
            h hVar = hVarArr[1];
            if (hVar != null && (valueAnimator = hVar.f46997e) != null) {
                valueAnimator.cancel();
            }
            hVarArr[1] = null;
            return false;
        }
        if (!this.f47002c) {
            h hVar2 = hVarArr[0];
            if (hVar2 != null && (valueAnimator2 = hVar2.f46997e) != null) {
                valueAnimator2.cancel();
            }
            hVarArr[0] = null;
            h hVar3 = hVarArr[1];
            if (hVar3 != null) {
                hVarArr[0] = hVar3;
                hVarArr[1] = null;
            }
            return false;
        }
        this.f47002c = false;
        float x8 = this.d - motionEvent.getX();
        float y10 = this.f47003e - motionEvent.getY();
        if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f47004f < 300) {
            if (Math.sqrt((y10 * y10) + (x8 * x8)) < AndroidUtilities.dp(10.0f)) {
                float f12 = (this.d - g.f46934g1) / this.f47001b;
                float f13 = this.f47009l;
                float f14 = this.f47008k;
                float f15 = f13 - f14;
                float f16 = f15 / 2.0f;
                float f17 = f12 - f16;
                float f18 = f12 + f16;
                if (f17 < 0.0f) {
                    f10 = f15;
                    f11 = 0.0f;
                } else if (f18 > 1.0f) {
                    f11 = 1.0f - f15;
                    f10 = 1.0f;
                } else {
                    f10 = f18;
                    f11 = f17;
                }
                this.f47005g = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f47000a.a(f11, f10, true);
                this.f47005g.addUpdateListener(new b7(this, f14, f11, f13, f10, 1));
                this.f47005g.setInterpolator(g.f46951y1);
                this.f47005g.start();
                return true;
            }
        }
        return true;
    }
}
