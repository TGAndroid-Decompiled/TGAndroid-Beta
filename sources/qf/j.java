package qf;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import kh.c7;
import org.telegram.messenger.AndroidUtilities;
public final class j {
    public g f46241a;
    public float f46242b;
    public boolean f46243c;
    public float d;
    public float f46244e;
    public long f46245f;
    public ValueAnimator f46246g;
    public Rect h;
    public Rect f46247i;
    public Rect f46248j;
    public float f46249k;
    public float f46250l;
    public float f46251m;
    public h[] f46252n;

    public final boolean a(int i9, int i10, int i11) {
        h hVar;
        Rect rect = this.f46247i;
        Rect rect2 = this.h;
        h[] hVarArr = this.f46252n;
        if (i11 == 0) {
            if (rect2.contains(i9, i10)) {
                h hVar2 = hVarArr[0];
                if (hVar2 != null) {
                    hVarArr[1] = hVar2;
                }
                h hVar3 = new h(this, 1);
                hVarArr[0] = hVar3;
                hVar3.f46237c = this.f46249k;
                hVar3.f46236b = i9;
                hVar3.a();
                ValueAnimator valueAnimator = this.f46246g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return true;
                }
            } else if (rect.contains(i9, i10)) {
                h hVar4 = hVarArr[0];
                if (hVar4 != null) {
                    hVarArr[1] = hVar4;
                }
                h hVar5 = new h(this, 2);
                hVarArr[0] = hVar5;
                hVar5.d = this.f46250l;
                hVar5.f46236b = i9;
                hVar5.a();
                ValueAnimator valueAnimator2 = this.f46246g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f46248j.contains(i9, i10)) {
                h hVar6 = new h(this, 4);
                hVarArr[0] = hVar6;
                hVar6.d = this.f46250l;
                hVar6.f46237c = this.f46249k;
                hVar6.f46236b = i9;
                hVar6.a();
                ValueAnimator valueAnimator3 = this.f46246g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i10 < rect2.bottom && i10 > rect2.top) {
                    this.f46243c = true;
                    this.d = i9;
                    this.f46244e = i10;
                    this.f46245f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f46246g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f46241a.a(this.f46249k, this.f46250l, true);
                        }
                        this.f46246g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i11 == 1 && (hVar = hVarArr[0]) != null && hVar.f46235a != 4) {
            if (rect2.contains(i9, i10) && hVarArr[0].f46235a != 1) {
                h hVar7 = new h(this, 1);
                hVarArr[1] = hVar7;
                hVar7.f46237c = this.f46249k;
                hVar7.f46236b = i9;
                hVar7.a();
                ValueAnimator valueAnimator5 = this.f46246g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i9, i10) && hVarArr[0].f46235a != 2) {
                h hVar8 = new h(this, 2);
                hVarArr[1] = hVar8;
                hVar8.d = this.f46250l;
                hVar8.f46236b = i9;
                hVar8.a();
                ValueAnimator valueAnimator6 = this.f46246g;
                if (valueAnimator6 != null) {
                    valueAnimator6.cancel();
                }
            }
            return true;
        }
        return false;
    }

    public final boolean b(int i9, int i10) {
        h hVar;
        boolean z10;
        if (this.f46243c || (hVar = this.f46252n[i10]) == null) {
            return false;
        }
        int i11 = hVar.f46235a;
        float f10 = hVar.f46237c;
        float f11 = hVar.d;
        int i12 = hVar.f46236b;
        if (i11 == 1) {
            float f12 = f10 - ((i12 - i9) / this.f46242b);
            this.f46249k = f12;
            if (f12 < 0.0f) {
                this.f46249k = 0.0f;
            }
            float f13 = this.f46250l;
            float f14 = this.f46251m;
            if (f13 - this.f46249k < f14) {
                this.f46249k = f13 - f14;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            float f15 = f11 - ((i12 - i9) / this.f46242b);
            this.f46250l = f15;
            if (f15 > 1.0f) {
                this.f46250l = 1.0f;
            }
            float f16 = this.f46250l;
            float f17 = this.f46249k;
            float f18 = this.f46251m;
            if (f16 - f17 < f18) {
                this.f46250l = f17 + f18;
            }
            z10 = true;
        }
        if (i11 == 4) {
            float f19 = (i12 - i9) / this.f46242b;
            float f20 = f10 - f19;
            this.f46249k = f20;
            this.f46250l = f11 - f19;
            if (f20 < 0.0f) {
                this.f46249k = 0.0f;
                this.f46250l = f11 - f10;
            }
            if (this.f46250l > 1.0f) {
                this.f46250l = 1.0f;
                this.f46249k = 1.0f - (f11 - f10);
            }
            z10 = true;
        }
        if (z10) {
            this.f46241a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i9, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f10;
        float f11;
        h[] hVarArr = this.f46252n;
        if (i9 == 0) {
            if (this.f46243c) {
                this.f46243c = false;
                float x10 = this.d - motionEvent.getX();
                float y10 = this.f46244e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f46245f < 300) {
                    if (Math.sqrt((y10 * y10) + (x10 * x10)) < AndroidUtilities.dp(10.0f)) {
                        float f12 = (this.d - g.f46175g1) / this.f46242b;
                        float f13 = this.f46250l;
                        float f14 = this.f46249k;
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
                        this.f46246g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f46241a.a(f11, f10, true);
                        this.f46246g.addUpdateListener(new c7(this, f14, f11, f13, f10, 1));
                        this.f46246g.setInterpolator(g.f46192y1);
                        this.f46246g.start();
                        return true;
                    }
                }
                return true;
            }
            h hVar = hVarArr[0];
            if (hVar != null && (valueAnimator2 = hVar.f46238e) != null) {
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
        if (hVar3 != null && (valueAnimator = hVar3.f46238e) != null) {
            valueAnimator.cancel();
        }
        hVarArr[1] = null;
        return false;
    }
}
