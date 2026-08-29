package tf;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import nh.r6;
import org.telegram.messenger.AndroidUtilities;
public final class j {
    public g f48300a;
    public float f48301b;
    public boolean f48302c;
    public float d;
    public float f48303e;
    public long f48304f;
    public ValueAnimator f48305g;
    public Rect h;
    public Rect f48306i;
    public Rect f48307j;
    public float f48308k;
    public float f48309l;
    public float f48310m;
    public h[] f48311n;

    public final boolean a(int i10, int i11, int i12) {
        h hVar;
        Rect rect = this.f48306i;
        Rect rect2 = this.h;
        h[] hVarArr = this.f48311n;
        if (i12 == 0) {
            if (rect2.contains(i10, i11)) {
                h hVar2 = hVarArr[0];
                if (hVar2 != null) {
                    hVarArr[1] = hVar2;
                }
                h hVar3 = new h(this, 1);
                hVarArr[0] = hVar3;
                hVar3.f48296c = this.f48308k;
                hVar3.f48295b = i10;
                hVar3.a();
                ValueAnimator valueAnimator = this.f48305g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return true;
                }
            } else if (rect.contains(i10, i11)) {
                h hVar4 = hVarArr[0];
                if (hVar4 != null) {
                    hVarArr[1] = hVar4;
                }
                h hVar5 = new h(this, 2);
                hVarArr[0] = hVar5;
                hVar5.d = this.f48309l;
                hVar5.f48295b = i10;
                hVar5.a();
                ValueAnimator valueAnimator2 = this.f48305g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f48307j.contains(i10, i11)) {
                h hVar6 = new h(this, 4);
                hVarArr[0] = hVar6;
                hVar6.d = this.f48309l;
                hVar6.f48296c = this.f48308k;
                hVar6.f48295b = i10;
                hVar6.a();
                ValueAnimator valueAnimator3 = this.f48305g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i11 < rect2.bottom && i11 > rect2.top) {
                    this.f48302c = true;
                    this.d = i10;
                    this.f48303e = i11;
                    this.f48304f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f48305g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f48300a.a(this.f48308k, this.f48309l, true);
                        }
                        this.f48305g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i12 == 1 && (hVar = hVarArr[0]) != null && hVar.f48294a != 4) {
            if (rect2.contains(i10, i11) && hVarArr[0].f48294a != 1) {
                h hVar7 = new h(this, 1);
                hVarArr[1] = hVar7;
                hVar7.f48296c = this.f48308k;
                hVar7.f48295b = i10;
                hVar7.a();
                ValueAnimator valueAnimator5 = this.f48305g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i10, i11) && hVarArr[0].f48294a != 2) {
                h hVar8 = new h(this, 2);
                hVarArr[1] = hVar8;
                hVar8.d = this.f48309l;
                hVar8.f48295b = i10;
                hVar8.a();
                ValueAnimator valueAnimator6 = this.f48305g;
                if (valueAnimator6 != null) {
                    valueAnimator6.cancel();
                }
            }
            return true;
        }
        return false;
    }

    public final boolean b(int i10, int i11) {
        h hVar;
        boolean z10;
        if (this.f48302c || (hVar = this.f48311n[i11]) == null) {
            return false;
        }
        int i12 = hVar.f48294a;
        float f9 = hVar.f48296c;
        float f10 = hVar.d;
        int i13 = hVar.f48295b;
        if (i12 == 1) {
            float f11 = f9 - ((i13 - i10) / this.f48301b);
            this.f48308k = f11;
            if (f11 < 0.0f) {
                this.f48308k = 0.0f;
            }
            float f12 = this.f48309l;
            float f13 = this.f48310m;
            if (f12 - this.f48308k < f13) {
                this.f48308k = f12 - f13;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            float f14 = f10 - ((i13 - i10) / this.f48301b);
            this.f48309l = f14;
            if (f14 > 1.0f) {
                this.f48309l = 1.0f;
            }
            float f15 = this.f48309l;
            float f16 = this.f48308k;
            float f17 = this.f48310m;
            if (f15 - f16 < f17) {
                this.f48309l = f16 + f17;
            }
            z10 = true;
        }
        if (i12 == 4) {
            float f18 = (i13 - i10) / this.f48301b;
            float f19 = f9 - f18;
            this.f48308k = f19;
            this.f48309l = f10 - f18;
            if (f19 < 0.0f) {
                this.f48308k = 0.0f;
                this.f48309l = f10 - f9;
            }
            if (this.f48309l > 1.0f) {
                this.f48309l = 1.0f;
                this.f48308k = 1.0f - (f10 - f9);
            }
            z10 = true;
        }
        if (z10) {
            this.f48300a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i10, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f9;
        float f10;
        h[] hVarArr = this.f48311n;
        if (i10 == 0) {
            if (this.f48302c) {
                this.f48302c = false;
                float x4 = this.d - motionEvent.getX();
                float y8 = this.f48303e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f48304f < 300) {
                    if (Math.sqrt((y8 * y8) + (x4 * x4)) < AndroidUtilities.dp(10.0f)) {
                        float f11 = (this.d - g.f48234g1) / this.f48301b;
                        float f12 = this.f48309l;
                        float f13 = this.f48308k;
                        float f14 = f12 - f13;
                        float f15 = f14 / 2.0f;
                        float f16 = f11 - f15;
                        float f17 = f11 + f15;
                        if (f16 < 0.0f) {
                            f9 = f14;
                            f10 = 0.0f;
                        } else if (f17 > 1.0f) {
                            f10 = 1.0f - f14;
                            f9 = 1.0f;
                        } else {
                            f9 = f17;
                            f10 = f16;
                        }
                        this.f48305g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f48300a.a(f10, f9, true);
                        this.f48305g.addUpdateListener(new r6(this, f13, f10, f12, f9, 1));
                        this.f48305g.setInterpolator(g.f48251y1);
                        this.f48305g.start();
                        return true;
                    }
                }
                return true;
            }
            h hVar = hVarArr[0];
            if (hVar != null && (valueAnimator2 = hVar.f48297e) != null) {
                valueAnimator2.cancel();
            }
            hVarArr[0] = null;
            h hVar2 = hVarArr[1];
            if (hVar2 != null) {
                hVarArr[0] = hVar2;
                hVarArr[1] = null;
            }
            return false;
        }
        h hVar3 = hVarArr[1];
        if (hVar3 != null && (valueAnimator = hVar3.f48297e) != null) {
            valueAnimator.cancel();
        }
        hVarArr[1] = null;
        return false;
    }
}
