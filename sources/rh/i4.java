package rh;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k40;
import org.telegram.ui.un;
public final class i4 extends View {
    public float D;
    public ValueAnimator E;
    public long F;
    public float G;
    public final h4 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final un f47099a;
    public org.telegram.ui.Cells.z f47100b;
    public int f47101c;
    public final int[] d;
    public final int[] e;
    public final RectF f47102f;
    public final RectF h;
    public final Paint f47103n;
    public boolean f47104r;
    public final org.telegram.ui.Components.t5 f47105s;
    public final org.telegram.ui.Components.e6 f47106w;
    public boolean f47107x;
    public final n f47108y;

    public i4(un unVar) {
        super(unVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f47102f = new RectF();
        this.h = new RectF();
        this.f47103n = new Paint();
        new Paint();
        this.f47105s = new org.telegram.ui.Components.t5(this, 0L, 420L, gr.h);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, false, false);
        this.f47106w = e6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{2131624217, 2131624218, 2131624219, 2131624220, 2131624221};
        this.f47099a = unVar;
        e6Var.setCallback(this);
        e6Var.r(false, true);
        e6Var.w(org.telegram.messenger.i0.L(40.0f));
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.s(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(3.5f), 0);
        e6Var.M = org.telegram.messenger.i0.f16172q.x;
        e6Var.u(-1);
        e6Var.f25744b = 17;
        this.H = new h4(this, 0);
        this.f47108y = new n(12, this, unVar);
    }

    private kj getMessageObject() {
        org.telegram.ui.Cells.z zVar = this.f47100b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).getPrimaryMessageObject();
        }
        if (zVar instanceof org.telegram.ui.Cells.s0) {
            return ((org.telegram.ui.Cells.s0) zVar).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            kj messageObject = getMessageObject();
            un unVar = this.f47099a;
            e6 y3 = e6.y(unVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (y3.e && y3.q(null, false, false).amount < E) {
                c6 c6Var = e6.y(unVar.getCurrentAccount(), false).B;
                if (c6Var != null) {
                    c6Var.a();
                }
                long a2 = unVar.a();
                if (a2 >= 0) {
                    str = i20.k(unVar.getMessagesController().Z1(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat L0 = unVar.getMessagesController().L0(Long.valueOf(-a2));
                    if (L0 == null) {
                        str = "";
                    } else {
                        str = L0.title;
                    }
                }
                new x7(unVar.getParentActivity(), unVar.getResourceProvider(), E, 5, str, new ag.a3(this, y3, messageObject, E, 18), 0L).show();
            }
        }
    }

    public final void b(float f7, h4 h4Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 5));
        this.E.addListener(new k40(this, f7, h4Var, 2));
        this.E.setInterpolator(gr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        org.telegram.messenger.i0.r(this.H);
        this.f47106w.t("", true, true);
        this.f47104r = false;
        invalidate();
        b(0.0f, new h4(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f47100b != null && !this.I) {
            kj messageObject = getMessageObject();
            sg.p0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                un unVar = this.f47099a;
                e6 y3 = e6.y(unVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((ci0) arrayList.remove(0)).C(true);
                }
                d5.a aVar = Utilities.f14521c;
                int[] iArr = this.K;
                ci0 ci0Var = new ci0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.i0.L(70.0f), org.telegram.messenger.i0.L(70.0f));
                ci0Var.R(this);
                ci0Var.J(true);
                ci0Var.K(0);
                ci0Var.start();
                arrayList.add(ci0Var);
                invalidate();
                sg.m0 k10 = reactionsLayoutInBubble.k("stars");
                if (k10 != null) {
                    k10.p();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    e6.y(unVar.getCurrentAccount(), false).b0(messageObject, this.f47099a, 1L, true, false, null);
                }
                org.telegram.ui.Components.e6 e6Var = this.f47106w;
                e6Var.a();
                e6Var.t("+" + y3.E(messageObject), true, true);
                this.f47104r = true;
                h4 h4Var = this.H;
                org.telegram.messenger.i0.r(h4Var);
                org.telegram.messenger.i0.h3(h4Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.F;
                if (j10 < 100) {
                    this.G += 0.5f;
                    return;
                }
                this.G = Utilities.i(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * this.G;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.e;
                if (measuredWidth == 0 && unVar.getLayoutContainer() != null) {
                    unVar.getLayoutContainer().getLocationInWindow(iArr2);
                } else {
                    getLocationInWindow(iArr2);
                }
                LaunchActivity.b0(iArr2[0] + f7, iArr2[1] + f10, Utilities.i(this.G, 0.9f, 0.3f));
                this.G = 0.0f;
                this.F = currentTimeMillis;
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: rh.i4.dispatchDraw(android.graphics.Canvas):void");
    }

    public sg.p0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.f47100b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).N;
        }
        if (zVar instanceof org.telegram.ui.Cells.s0) {
            return ((org.telegram.ui.Cells.s0) zVar).E0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sg.p0 reactionsLayoutInBubble;
        if (this.f47100b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        n nVar = this.f47108y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f47107x = true;
                sg.m0 k10 = reactionsLayoutInBubble.k("stars");
                if (k10 != null) {
                    k10.X.c(true);
                }
                org.telegram.messenger.i0.r(nVar);
                org.telegram.messenger.i0.h3(nVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            sg.m0 k11 = reactionsLayoutInBubble.k("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (k11 != null) {
                k11.X.c(false);
            }
            this.f47107x = false;
            org.telegram.messenger.i0.r(nVar);
        }
        return this.f47107x;
    }

    public void setMessageCell(org.telegram.ui.Cells.z zVar) {
        int f12;
        org.telegram.ui.Cells.z zVar2 = this.f47100b;
        if (zVar2 == zVar) {
            return;
        }
        if (zVar2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.q1) this.f47100b).setInvalidateListener(null);
            this.f47100b.invalidate();
        } else if (zVar2 instanceof org.telegram.ui.Cells.s0) {
            ((org.telegram.ui.Cells.s0) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.s0) this.f47100b).setInvalidateListener(null);
            this.f47100b.invalidate();
        }
        this.f47100b = zVar;
        if (getMessageObject() == null) {
            f12 = 0;
        } else {
            f12 = getMessageObject().f1();
        }
        this.f47101c = f12;
        org.telegram.ui.Cells.z zVar3 = this.f47100b;
        if (zVar3 instanceof org.telegram.ui.Cells.q1) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.q1) this.f47100b).setInvalidateListener(new h4(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.s0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.s0) this.f47100b).setInvalidateListener(new h4(this, 1));
        }
        invalidate();
    }
}
