package wf;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import qh.u5;
public final class j {
    public g f49590a;
    public float f49591b;
    public boolean f49592c;
    public float d;
    public float f49593e;
    public long f49594f;
    public ValueAnimator f49595g;
    public Rect h;
    public Rect f49596i;
    public Rect f49597j;
    public float f49598k;
    public float f49599l;
    public float f49600m;
    public h[] f49601n;

    public final boolean a(int i10, int i11, int i12) {
        h hVar;
        Rect rect = this.f49596i;
        Rect rect2 = this.h;
        h[] hVarArr = this.f49601n;
        if (i12 == 0) {
            if (rect2.contains(i10, i11)) {
                h hVar2 = hVarArr[0];
                if (hVar2 != null) {
                    hVarArr[1] = hVar2;
                }
                h hVar3 = new h(this, 1);
                hVarArr[0] = hVar3;
                hVar3.f49586c = this.f49598k;
                hVar3.f49585b = i10;
                hVar3.a();
                ValueAnimator valueAnimator = this.f49595g;
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
                hVar5.d = this.f49599l;
                hVar5.f49585b = i10;
                hVar5.a();
                ValueAnimator valueAnimator2 = this.f49595g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f49597j.contains(i10, i11)) {
                h hVar6 = new h(this, 4);
                hVarArr[0] = hVar6;
                hVar6.d = this.f49599l;
                hVar6.f49586c = this.f49598k;
                hVar6.f49585b = i10;
                hVar6.a();
                ValueAnimator valueAnimator3 = this.f49595g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i11 < rect2.bottom && i11 > rect2.top) {
                    this.f49592c = true;
                    this.d = i10;
                    this.f49593e = i11;
                    this.f49594f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f49595g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f49590a.a(this.f49598k, this.f49599l, true);
                        }
                        this.f49595g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i12 == 1 && (hVar = hVarArr[0]) != null && hVar.f49584a != 4) {
            if (rect2.contains(i10, i11) && hVarArr[0].f49584a != 1) {
                h hVar7 = new h(this, 1);
                hVarArr[1] = hVar7;
                hVar7.f49586c = this.f49598k;
                hVar7.f49585b = i10;
                hVar7.a();
                ValueAnimator valueAnimator5 = this.f49595g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i10, i11) && hVarArr[0].f49584a != 2) {
                h hVar8 = new h(this, 2);
                hVarArr[1] = hVar8;
                hVar8.d = this.f49599l;
                hVar8.f49585b = i10;
                hVar8.a();
                ValueAnimator valueAnimator6 = this.f49595g;
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
        boolean z4;
        if (this.f49592c || (hVar = this.f49601n[i11]) == null) {
            return false;
        }
        int i12 = hVar.f49584a;
        float f10 = hVar.f49586c;
        float f11 = hVar.d;
        int i13 = hVar.f49585b;
        if (i12 == 1) {
            float f12 = f10 - ((i13 - i10) / this.f49591b);
            this.f49598k = f12;
            if (f12 < 0.0f) {
                this.f49598k = 0.0f;
            }
            float f13 = this.f49599l;
            float f14 = this.f49600m;
            if (f13 - this.f49598k < f14) {
                this.f49598k = f13 - f14;
            }
            z4 = true;
        } else {
            z4 = false;
        }
        if (i12 == 2) {
            float f15 = f11 - ((i13 - i10) / this.f49591b);
            this.f49599l = f15;
            if (f15 > 1.0f) {
                this.f49599l = 1.0f;
            }
            float f16 = this.f49599l;
            float f17 = this.f49598k;
            float f18 = this.f49600m;
            if (f16 - f17 < f18) {
                this.f49599l = f17 + f18;
            }
            z4 = true;
        }
        if (i12 == 4) {
            float f19 = (i13 - i10) / this.f49591b;
            float f20 = f10 - f19;
            this.f49598k = f20;
            this.f49599l = f11 - f19;
            if (f20 < 0.0f) {
                this.f49598k = 0.0f;
                this.f49599l = f11 - f10;
            }
            if (this.f49599l > 1.0f) {
                this.f49599l = 1.0f;
                this.f49598k = 1.0f - (f11 - f10);
            }
            z4 = true;
        }
        if (z4) {
            this.f49590a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i10, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f10;
        float f11;
        h[] hVarArr = this.f49601n;
        if (i10 == 0) {
            if (this.f49592c) {
                this.f49592c = false;
                float x10 = this.d - motionEvent.getX();
                float y10 = this.f49593e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f49594f < 300) {
                    if (Math.sqrt((y10 * y10) + (x10 * x10)) < AndroidUtilities.dp(10.0f)) {
                        float f12 = (this.d - g.f49523h1) / this.f49591b;
                        float f13 = this.f49599l;
                        float f14 = this.f49598k;
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
                        this.f49595g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f49590a.a(f11, f10, true);
                        this.f49595g.addUpdateListener(new u5(this, f14, f11, f13, f10, 1));
                        this.f49595g.setInterpolator(g.f49540z1);
                        this.f49595g.start();
                        return true;
                    }
                }
                return true;
            }
            h hVar = hVarArr[0];
            if (hVar != null && (valueAnimator2 = hVar.f49587e) != null) {
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
        if (hVar3 != null && (valueAnimator = hVar3.f49587e) != null) {
            valueAnimator.cancel();
        }
        hVarArr[1] = null;
        return false;
    }
}
