package xh;

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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.ya0;
public final class b4 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final a4 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final eo f45266a;
    public org.telegram.ui.Cells.a0 f45267b;
    public int f45268c;
    public final int[] d;
    public final int[] e;
    public final RectF f45269f;
    public final RectF h;
    public final Paint f45270n;
    public boolean f45271r;
    public final org.telegram.ui.Components.d6 f45272s;
    public final org.telegram.ui.Components.n6 v;
    public boolean f45273w;
    public final u2.k0 f45274x;
    public float f45275y;

    public b4(eo eoVar) {
        super(eoVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f45269f = new RectF();
        this.h = new RectF();
        this.f45270n = new Paint();
        new Paint();
        this.f45272s = new org.telegram.ui.Components.d6(this, 0L, 420L, wr.h);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.v = n6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.f45266a = eoVar;
        n6Var.setCallback(this);
        n6Var.o(false, true, false);
        n6Var.t(AndroidUtilities.dp(40.0f));
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.r(-1);
        n6Var.f25425b = 17;
        this.H = new a4(this, 0);
        this.f45274x = new u2.k0(21, this, eoVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.f45267b;
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
            eo eoVar = this.f45266a;
            v5 y3 = v5.y(eoVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (y3.e && y3.q(false, false, null).amount < E) {
                u5 u5Var = v5.y(eoVar.getCurrentAccount(), false).B;
                if (u5Var != null) {
                    u5Var.a();
                }
                long a2 = eoVar.a();
                if (a2 >= 0) {
                    str = UserObject.getForcedFirstName(eoVar.getMessagesController().getUser(Long.valueOf(a2)));
                } else {
                    TLRPC.Chat chat = eoVar.getMessagesController().getChat(Long.valueOf(-a2));
                    if (chat == null) {
                        str = "";
                    } else {
                        str = chat.title;
                    }
                }
                new o7(eoVar.getParentActivity(), eoVar.getResourceProvider(), E, 5, str, new ya0(this, y3, messageObject, E, 5), 0L).show();
            }
        }
    }

    public final void b(float f7, a4 a4Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f45275y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new qg.o(this, 10));
        this.E.addListener(new bi.j3(this, f7, a4Var, 3));
        this.E.setInterpolator(wr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.q("", true, true);
        this.f45271r = false;
        invalidate();
        b(0.0f, new a4(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.f45267b != null && !this.I) {
            MessageObject messageObject = getMessageObject();
            yg.q0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
            if (messageObject != null && reactionsLayoutInBubble != null) {
                eo eoVar = this.f45266a;
                v5 y3 = v5.y(eoVar.getCurrentAccount(), false);
                while (true) {
                    arrayList = this.J;
                    if (arrayList.size() <= 4) {
                        break;
                    }
                    ((hj0) arrayList.remove(0)).C(true);
                }
                Random random = Utilities.fastRandom;
                int[] iArr = this.K;
                hj0 hj0Var = new hj0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
                hj0Var.f23672v0 = this;
                hj0Var.J(true);
                hj0Var.K(0);
                hj0Var.start();
                arrayList.add(hj0Var);
                invalidate();
                yg.n0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.q();
                }
                if (z10) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                    v5.y(eoVar.getCurrentAccount(), false).d0(messageObject, this.f45266a, 1L, true, false, null);
                }
                org.telegram.ui.Components.n6 n6Var = this.v;
                n6Var.b();
                n6Var.q("+" + y3.E(messageObject), true, true);
                this.f45271r = true;
                a4 a4Var = this.H;
                AndroidUtilities.cancelRunOnUIThread(a4Var);
                AndroidUtilities.runOnUIThread(a4Var, 1500L);
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.F;
                if (j3 < 100) {
                    this.G += 0.5f;
                    return;
                }
                this.G = Utilities.clamp(1.0f - (((float) (j3 - 100)) / 200.0f), 1.0f, 0.0f) * this.G;
                int measuredWidth = getMeasuredWidth();
                int[] iArr2 = this.e;
                if (measuredWidth == 0 && eoVar.getLayoutContainer() != null) {
                    eoVar.getLayoutContainer().getLocationInWindow(iArr2);
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
        throw new UnsupportedOperationException("Method not decompiled: xh.b4.dispatchDraw(android.graphics.Canvas):void");
    }

    public yg.q0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.f45267b;
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
        yg.q0 reactionsLayoutInBubble;
        if (this.f45267b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        u2.k0 k0Var = this.f45274x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.f45273w = true;
                yg.n0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(k0Var);
                AndroidUtilities.runOnUIThread(k0Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            yg.n0 l10 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l10 != null) {
                l10.Y.c(false);
            }
            this.f45273w = false;
            AndroidUtilities.cancelRunOnUIThread(k0Var);
        }
        return this.f45273w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        int id2;
        org.telegram.ui.Cells.a0 a0Var2 = this.f45267b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t1) this.f45267b).setInvalidateListener(null);
            this.f45267b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.f45267b).setInvalidateListener(null);
            this.f45267b.invalidate();
        }
        this.f45267b = a0Var;
        if (getMessageObject() == null) {
            id2 = 0;
        } else {
            id2 = getMessageObject().getId();
        }
        this.f45268c = id2;
        org.telegram.ui.Cells.a0 a0Var3 = this.f45267b;
        if (a0Var3 instanceof org.telegram.ui.Cells.t1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.t1) this.f45267b).setInvalidateListener(new a4(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.f45267b).setInvalidateListener(new a4(this, 1));
        }
        invalidate();
    }
}
