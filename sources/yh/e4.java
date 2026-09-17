package yh;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
public final class e4 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final d4 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final bo f47131a;
    public org.telegram.ui.Cells.a0 f47132b;
    public int f47133c;
    public final int[] d;
    public final int[] e;
    public final RectF f47134f;
    public final RectF h;
    public final Paint f47135n;
    public boolean f47136r;
    public final org.telegram.ui.Components.c6 f47137s;
    public final org.telegram.ui.Components.m6 v;
    public boolean f47138w;
    public final uh.i f47139x;
    public float f47140y;

    public e4(bo boVar) {
        super(boVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f47134f = new RectF();
        this.h = new RectF();
        this.f47135n = new Paint();
        new Paint();
        this.f47137s = new org.telegram.ui.Components.c6(this, 0L, 420L, qr.h);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, false, false, false);
        this.v = m6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f47131a = boVar;
        m6Var.setCallback(this);
        m6Var.o(false, true, false);
        m6Var.t(AndroidUtilities.dp(40.0f));
        m6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        m6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        m6Var.G = AndroidUtilities.displaySize.x;
        m6Var.r(-1);
        m6Var.f26067b = 17;
        this.H = new d4(this, 0);
        this.f47139x = new uh.i(20, this, boVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f47132b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).getPrimaryMessageObject();
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            MessageObject messageObject = getMessageObject();
            bo boVar = this.f47131a;
            v5 y3 = v5.y(boVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (y3.e && y3.q(false, false, null).amount < E) {
                u5 u5Var = v5.y(boVar.getCurrentAccount(), false).B;
                if (u5Var != null) {
                    u5Var.a();
                }
                long a2 = boVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(boVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = boVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new n7(boVar.getParentActivity(), boVar.getResourceProvider(), E, 5, str, new k21(this, y3, messageObject, E, 9), 0L).show();
            }
        }
    }

    public final void b(float f7, d4 d4Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f47140y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 24));
        this.E.addListener(new ai.t2(this, f7, d4Var, 4));
        this.E.setInterpolator(qr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.q("", true, true);
        this.f47136r = false;
        invalidate();
        b(0.0f, new d4(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f47132b != null && !this.I) {
            MessageObject messageObject = getMessageObject();
            zg.q0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                bo boVar = this.f47131a;
                v5 y3 = v5.y(boVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((yi0) arrayList.remove(0)).C(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.K;
                yi0 yi0Var = new yi0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                yi0Var.f30245v0 = this;
                yi0Var.J(true);
                yi0Var.K(0);
                yi0Var.start();
                arrayList.add(yi0Var);
                invalidate();
                zg.n0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.q();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    v5.y(boVar.getCurrentAccount(), false).d0(messageObject, this.f47131a, 1L, true, false, null);
                }
                org.telegram.ui.Components.m6 m6Var = this.v;
                m6Var.b();
                m6Var.q("+" + y3.E(messageObject), true, true);
                this.f47136r = true;
                d4 d4Var = this.H;
                AndroidUtilities.cancelRunOnUIThread(d4Var);
                AndroidUtilities.runOnUIThread(d4Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.F;
                if (j3 < 100) {
                    this.G += 0.5f;
                    return;
                }
                this.G = Utilities.clamp(1.0f - (((float) (j3 - 100)) / 200.0f), 1.0f, 0.0f) * this.G;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.e;
                if (measuredWidth == 0 && boVar.getLayoutContainer() != null) {
                    boVar.getLayoutContainer().getLocationInWindow(iArr2);
                } else {
                    getLocationInWindow(iArr2);
                }
                LaunchActivity.b0(iArr2[0] + f7, iArr2[1] + f10, Utilities.clamp(this.G, 0.9f, 0.3f));
                this.G = 0.0f;
                this.F = currentTimeMillis;
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: yh.e4.dispatchDraw(android.graphics.Canvas):void");
    }

    public zg.q0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f47132b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).N;
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).C0;
        }
        return null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zg.q0 reactionsLayoutInBubble;
        if (this.f47132b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        uh.i iVar = this.f47139x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f47138w = true;
                zg.n0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(iVar);
                AndroidUtilities.runOnUIThread(iVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            zg.n0 l10 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l10 != null) {
                l10.Y.c(false);
            }
            this.f47138w = false;
            AndroidUtilities.cancelRunOnUIThread(iVar);
        }
        return this.f47138w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f47132b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t1) this.f47132b).setInvalidateListener(null);
            this.f47132b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.f47132b).setInvalidateListener(null);
            this.f47132b.invalidate();
        }
        this.f47132b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f47133c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f47132b;
        if (a0Var3 instanceof org.telegram.ui.Cells.t1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.t1) this.f47132b).setInvalidateListener(new d4(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.f47132b).setInvalidateListener(new d4(this, 1));
        }
        invalidate();
    }
}
