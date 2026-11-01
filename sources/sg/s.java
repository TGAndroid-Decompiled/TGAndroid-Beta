package sg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.dd;
import org.telegram.messenger.ej;
import org.telegram.messenger.fj;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.gk;
import org.telegram.ui.un;
import org.telegram.ui.vj;
public final class s extends FrameLayout {
    public final int[] D;
    public final un f48476a;
    public q f48477b;
    public List f48478c;
    public boolean d;
    public kj e;
    public final int f48479f;
    public final int h;
    public float f48480n;
    public float f48481r;
    public float f48482s;
    public long f48483w;
    public boolean f48484x;
    public boolean f48485y;

    public s(un unVar, Context context) {
        super(context);
        this.f48478c = Collections.EMPTY_LIST;
        this.f48479f = 22;
        this.h = 24;
        this.D = new int[2];
        setVisibility(8);
        this.f48476a = unVar;
        setClipToPadding(false);
        setClipChildren(false);
        unVar.f42303z0.j(new cu0(this, 21));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new p(this, 1));
            return;
        }
        this.f48485y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new qh.e0(this, 8));
        duration.addListener(new r(this, 0));
        duration.start();
    }

    public final kj b() {
        fj P8;
        ArrayList arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f48478c.isEmpty()) {
            int i10 = 0;
            kj kjVar = (kj) this.f48478c.get(0);
            if (kjVar.d1() != 0 && (P8 = this.f48476a.P8(kjVar.d1())) != null && (arrayList = P8.d) != null) {
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kj kjVar2 = (kj) obj;
                    TLRPC.Message message = kjVar2.f16690k;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return kjVar2;
                    }
                }
            }
            return kjVar;
        }
        return null;
    }

    public final void c(boolean z10) {
        int height;
        int height2;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        if (this.d && this.e != null && this.f48477b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.f48483w);
            this.f48483w = System.currentTimeMillis();
            float f7 = this.f48480n;
            float f10 = this.f48481r;
            if (f7 != f10) {
                float f11 = ((float) min) / 220.0f;
                if (f10 > f7) {
                    this.f48480n = Math.min(f7 + f11, f10);
                } else if (f10 < f7) {
                    this.f48480n = Math.max(f7 - f11, f10);
                }
                org.telegram.messenger.i0.g3(new p(this, 0));
            }
            un unVar = this.f48476a;
            vj vjVar = unVar.f42303z0;
            int[] iArr = this.D;
            vjVar.getLocationInWindow(iArr);
            boolean z13 = true;
            getLocationInWindow(iArr);
            float f12 = (iArr[1] - iArr[1]) - unVar.f42077ga;
            boolean z14 = false;
            for (int i12 = 0; i12 < vjVar.getChildCount(); i12++) {
                View childAt = vjVar.getChildAt(i12);
                if (childAt instanceof q1) {
                    q1 q1Var = (q1) childAt;
                    kj messageObject = q1Var.getMessageObject();
                    if (messageObject.f1() == this.e.f1()) {
                        boolean P3 = messageObject.P3();
                        q qVar = this.f48477b;
                        if (qVar != null) {
                            qVar.setMirrorX(P3);
                            q qVar2 = this.f48477b;
                            int L = org.telegram.messenger.i0.L(4.0f);
                            boolean z15 = dd.X;
                            int i13 = this.h;
                            if (!z15 && !P3) {
                                i11 = i13;
                            } else {
                                i11 = 0;
                            }
                            int i14 = L + i11;
                            float f13 = this.f48479f;
                            int L2 = org.telegram.messenger.i0.L(f13);
                            int L3 = org.telegram.messenger.i0.L(4.0f);
                            if (!dd.X && !P3) {
                                i13 = 0;
                            }
                            qVar2.setPadding(i14, L2, L3 + i13, org.telegram.messenger.i0.L(f13));
                        }
                        if (getHeight() != 0) {
                            height = getHeight();
                        } else {
                            height = vjVar.getHeight();
                        }
                        if (q1Var.getCurrentMessagesGroup() != null) {
                            ej ejVar = q1Var.getCurrentMessagesGroup().f15744m;
                            height2 = ejVar.d - ejVar.f15572b;
                        } else {
                            height2 = q1Var.getHeight();
                        }
                        float y3 = (q1Var.getY() + f12) - org.telegram.messenger.i0.L(74.0f);
                        float L4 = org.telegram.messenger.i0.L(14.0f);
                        float L5 = height - org.telegram.messenger.i0.L(218.0f);
                        gk gkVar = unVar.f42129l2;
                        if (gkVar != null && gkVar.getVisibility() == 0) {
                            L4 += gkVar.getHeight();
                        }
                        float f14 = height2;
                        if (y3 > L4 - (f14 / 2.0f) && y3 < L5) {
                            this.f48481r = 0.0f;
                            z11 = false;
                            z12 = true;
                        } else {
                            if (y3 >= (L4 - f14) - org.telegram.messenger.i0.L(92.0f) && y3 <= L5) {
                                this.f48482s = org.telegram.messenger.i0.L(56.0f) + height2;
                                this.f48481r = 1.0f;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        if (!z10) {
                            this.f48480n = this.f48481r;
                        }
                        float interpolation = (gr.f26523f.getInterpolation(this.f48480n) * this.f48482s) + y3;
                        q qVar3 = this.f48477b;
                        if (qVar3 != null) {
                            if (z11 != qVar3.N) {
                                qVar3.setFlippedVertically(z11);
                                org.telegram.messenger.i0.g3(new p(this, 0));
                            }
                            if (z12 != this.f48477b.isEnabled()) {
                                this.f48477b.setEnabled(z12);
                                this.f48477b.invalidate();
                                if (z12) {
                                    this.f48477b.setVisibility(0);
                                    if (!this.f48485y) {
                                        this.f48485y = true;
                                        this.f48477b.p(this.e, unVar.f42185p8, true);
                                    }
                                }
                            }
                            this.f48477b.setTranslationY(w7.u.a(interpolation, L4, L5));
                            this.f48477b.setTranslationX(q1Var.P1(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f48477b.getLayoutParams();
                            int d = i0.a.d(32.0f, q1Var.getBackgroundDrawableLeft(), 0);
                            int d10 = i0.a.d(32.0f, q1Var.getWidth() - q1Var.getBackgroundDrawableRight(), (int) q1Var.P1(true));
                            int L6 = org.telegram.messenger.i0.L(40.0f) * 8;
                            if ((getWidth() - d10) - d < L6) {
                                if (P3) {
                                    d = Math.min(d, getWidth() - L6);
                                    d10 = 0;
                                } else {
                                    d10 = Math.min(d10, getWidth() - L6);
                                    d = 0;
                                }
                            }
                            if (P3) {
                                i10 = 5;
                            } else {
                                i10 = 3;
                            }
                            if (i10 != layoutParams.gravity) {
                                layoutParams.gravity = i10;
                                z14 = true;
                            }
                            if (d != layoutParams.leftMargin) {
                                layoutParams.leftMargin = d;
                                z14 = true;
                            }
                            if (d10 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = d10;
                            } else {
                                z13 = z14;
                            }
                            if (z13) {
                                this.f48477b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            q qVar4 = this.f48477b;
            if (qVar4 != null && qVar4.isEnabled()) {
                this.f48477b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.f48484x) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f48484x = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.kj> r10) {
        throw new UnsupportedOperationException("Method not decompiled: sg.s.setSelectedMessages(java.util.List):void");
    }
}
