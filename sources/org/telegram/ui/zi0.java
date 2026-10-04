package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public class zi0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final ki0 F;
    public final ri0 G;
    public final ki0 H;
    public long I;
    public org.telegram.ui.Components.o5 J;
    public final si0 K;
    public final ji0 L;
    public final vi0 M;
    public final ArrayList N;
    public int O;
    public final a0.i P;
    public org.telegram.ui.Cells.u1 Q;
    public int R;
    public org.telegram.ui.Components.rf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.ee V;
    public org.telegram.ui.Components.wg W;
    public mi0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f43792a;
    public final li0 f43793a0;
    public final org.telegram.ui.ActionBar.d6 f43794b;
    public boolean f43795b0;
    public final int f43796c;
    public float f43797c0;
    public ib0 d;
    public FrameLayout f43798d0;
    public i0.b f43799e;
    public ni0 f43800e0;
    public Bitmap f43801f;
    public boolean f43802f0;
    public boolean f43803g0;
    public BitmapShader h;
    public boolean f43804h0;
    public final vh.f f43805i0;
    public final fh.b f43806j0;
    public final ah.c f43807k0;
    public RectF f43808l0;
    public boolean m0;
    public Paint f43809n;
    public boolean f43810n0;
    public final int[] f43811o0;
    public boolean f43812p0;
    public boolean f43813q0;
    public Matrix f43814r;
    public org.telegram.ui.Cells.u1 f43815r0;
    public boolean f43816s;
    public float f43817s0;
    public float f43818t0;
    public final Rect f43819u0;
    public boolean v;
    public ValueAnimator f43820v0;
    public boolean f43821w;
    public boolean f43822w0;
    public boolean f43823x;
    public org.telegram.ui.Cells.u1 f43824x0;
    public boolean f43825y;
    public org.telegram.ui.Components.e11 f43826y0;
    public Paint f43827z0;

    public zi0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, R.style.TransparentDialog);
        ib0 ib0Var;
        int i10 = UserConfig.selectedAccount;
        this.f43796c = i10;
        this.f43799e = i0.b.f11524e;
        this.N = new ArrayList();
        this.P = new a0.i();
        this.T = new Paint(1);
        this.f43811o0 = new int[2];
        this.f43813q0 = false;
        this.f43819u0 = new Rect();
        this.f43792a = context;
        this.f43794b = d6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            ib0Var = new ib0(launchActivity, true);
        } else {
            ib0Var = null;
        }
        this.d = ib0Var;
        ki0 ki0Var = new ki0(this, context, 1);
        this.F = ki0Var;
        this.f43805i0 = vh.f.d(1, ki0Var, ki0Var);
        ki0Var.setOnClickListener(new View.OnClickListener(this) {
            public final zi0 f37081b;

            {
                this.f37081b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37081b.onBackPressed();
                        return;
                    default:
                        this.f37081b.onBackPressed();
                        return;
                }
            }
        });
        ki0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                zi0 zi0Var = zi0.this;
                if (!zi0Var.f43812p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(zi0Var.S);
                    AndroidUtilities.runOnUIThread(new fi0(zi0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        fh.b bVar = new fh.b();
        this.f43806j0 = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f43807k0 = cVar;
        cVar.f459f = new hh.k(ki0Var);
        cVar.f460g = ki0Var;
        ri0 ri0Var = new ri0(this, context, d6Var);
        this.G = ri0Var;
        ri0Var.setClipToPadding(false);
        ki0Var.addView(ri0Var, w7.z5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f45596a;
        r0.a0.j(ki0Var, gVar);
        si0 si0Var = new si0(this, context, d6Var);
        this.K = si0Var;
        si0Var.setOnClickListener(new View.OnClickListener(this) {
            public final zi0 f37081b;

            {
                this.f37081b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37081b.onBackPressed();
                        return;
                    default:
                        this.f37081b.onBackPressed();
                        return;
                }
            }
        });
        si0Var.setOnItemClickListener(new i(this, 17));
        si0Var.setOnScrollListener(new i3(this, 20));
        si0Var.setItemAnimator(new ji.n(null, si0Var, d6Var));
        vi0 vi0Var = new vi0(this);
        this.M = vi0Var;
        vi0Var.O = new wi0(this);
        si0Var.setLayoutManager(vi0Var);
        si0Var.i(new Object());
        ji0 ji0Var = new ji0(this, context, d6Var);
        this.L = ji0Var;
        si0Var.setAdapter(ji0Var);
        si0Var.setVerticalScrollBarEnabled(false);
        si0Var.setOverScrollMode(2);
        ri0Var.addView(si0Var, w7.z5.c(-2.0f, -1));
        ki0 ki0Var2 = new ki0(this, context, 0);
        this.H = ki0Var2;
        ki0Var.addView(ki0Var2, w7.z5.c(-1.0f, -1));
        this.f43793a0 = new li0(this, ki0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f43796c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        ib0 ib0Var = this.d;
        if (ib0Var != null) {
            ib0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.n2 n2Var) {
        zg.x xVar;
        if (this.f43800e0 == null && n2Var != null) {
            int i10 = this.f43796c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f43792a);
            this.f43798d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f43798d0.setClipToPadding(false);
            this.f43798d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? sk0Var = new org.telegram.ui.Components.sk0(5, this.f43796c, getContext(), null, this.f43794b);
            this.f43800e0 = sk0Var;
            sk0Var.setClipChildren(false);
            this.f43800e0.setClipToPadding(false);
            this.f43800e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f43800e0.setDelegate(new pi0(this, n2Var));
            this.f43800e0.setTop(false);
            this.f43800e0.setClipChildren(false);
            this.f43800e0.setClipToPadding(false);
            this.f43800e0.setVisibility(0);
            this.f43800e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f43800e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f43800e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f43798d0, w7.z5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f43798d0.addView(this.f43800e0, w7.z5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f43800e0.setScaleY(0.4f);
            this.f43800e0.setScaleX(0.4f);
            this.f43800e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            ni0 ni0Var = this.f43800e0;
            if (ni0Var != null && !ni0Var.f30770f1) {
                ni0Var.f30770f1 = true;
                ni0Var.f30772g1 = true;
                zg.b0 b0Var = ni0Var.f30796x0;
                if (b0Var != null && (xVar = b0Var.f53327m) != null && !xVar.K1) {
                    xVar.K1 = true;
                    xVar.L1 = true;
                    z51 z51Var = xVar.f35315h0;
                    if (z51Var != null) {
                        z51Var.invalidate();
                    }
                    p51 p51Var = xVar.f35317i0;
                    if (p51Var != null) {
                        p51Var.invalidate();
                    }
                }
            }
            new ci.i4(this.F, false, new t3(this, 11));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f43796c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f43813q0) {
            return;
        }
        this.f43813q0 = true;
        mi0 mi0Var = this.X;
        if (mi0Var != null) {
            mi0Var.invalidate();
        }
        org.telegram.ui.Components.wg wgVar = this.W;
        if (wgVar != null) {
            wgVar.invalidate();
        }
        e(new ei0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        ni0 ni0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f43820v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.n1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        float f7 = 0.0f;
        if (!z10 && (ni0Var = this.f43800e0) != null && this.f43802f0) {
            ni0Var.e();
            if (this.f43800e0.getReactionsWindow() != null && this.f43800e0.getReactionsWindow().f53317a != null) {
                this.f43800e0.getReactionsWindow().f53317a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f43800e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f43821w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f43823x = true;
        this.f43825y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f43820v0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(9, this, z11));
        this.f43820v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f43820v0.setInterpolator(org.telegram.ui.Components.tr.h);
        this.f43820v0.setDuration(350L);
        this.f43820v0.start();
    }

    public final void f(MessageObject messageObject) {
        MessageObject.GroupedMessages l4 = l(messageObject);
        if (l4 != null) {
            l4.calculate();
            ArrayList<MessageObject> arrayList = l4.messages;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                MessageObject messageObject2 = arrayList.get(i10);
                i10++;
                g(messageObject2);
            }
            return;
        }
        g(messageObject);
    }

    public final void g(MessageObject messageObject) {
        org.telegram.ui.Cells.u1 u1Var;
        si0 si0Var = this.K;
        if (si0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < si0Var.getChildCount()) {
                View childAt = si0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject() == messageObject) {
                        break;
                    }
                }
                i11++;
            } else {
                u1Var = null;
                break;
            }
        }
        org.telegram.ui.Cells.u1 u1Var2 = u1Var;
        int i12 = -1;
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == messageObject) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (u1Var2 == null) {
            si0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        si0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f43816s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f43813q0) {
            return;
        }
        this.f43813q0 = true;
        vh.f.f(false);
        vh.f fVar = this.f43805i0;
        if (fVar != null) {
            fVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f43813q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f43826y0 != null && this.f43827z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f43826y0.f25879c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f43827z0);
            this.f43826y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f43810n0 && this.f43800e0 != null) {
            if (this.f43808l0 != null) {
                this.f43810n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f43810n0 = true;
                    return message.effect;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    public final MessageObject.GroupedMessages l(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.P.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void n(boolean z10) {
        vi0 vi0Var;
        int i10;
        si0 si0Var = this.K;
        if (si0Var != null && si0Var.getAdapter() != null && (vi0Var = this.M) != null) {
            int h = si0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            vi0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f43822w0 = z10;
        }
    }

    public final void o(long j3) {
        int i10;
        MessageObject messageObject;
        TLRPC.TL_availableEffect effect;
        this.I = j3;
        boolean i11 = this.P.i();
        ArrayList arrayList = this.N;
        if (!i11 && arrayList.size() >= 10) {
            i10 = arrayList.size() % 10;
        } else {
            i10 = 0;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            messageObject = (MessageObject) arrayList.get(i10);
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.f43800e0 != null && (effect = MessagesController.getInstance(this.f43796c).getEffect(j3)) != null) {
            this.f43800e0.setSelectedReactionAnimated(zg.o0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f43795b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f43795b0 = false;
            return;
        }
        ni0 ni0Var = this.f43800e0;
        if (ni0Var != null && ni0Var.getReactionsWindow() != null) {
            if (!this.f43800e0.getReactionsWindow().C) {
                this.f43800e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f43810n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ki0 ki0Var = this.F;
        setContentView(ki0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        ki0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(ki0Var, !org.telegram.ui.ActionBar.i6.I.q());
    }

    public final void p(org.telegram.ui.Components.b80 b80Var) {
        int i10 = org.telegram.ui.ActionBar.i6.E8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f43794b;
        b80Var.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(i10, d6Var)));
        b80Var.Q(this.f43807k0, eh.b.k(d6Var), false);
        ViewGroup viewGroup = b80Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, w7.z5.c(-2.0f, -2));
    }

    public final void q(ArrayList arrayList) {
        a0.i iVar;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = arrayList.size();
            iVar = this.P;
            if (i13 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i13);
            if (messageObject.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) iVar.f(messageObject.getGroupIdForUse());
                if (groupedMessages == null) {
                    groupedMessages = new MessageObject.GroupedMessages();
                    groupedMessages.reversed = false;
                    long groupId = messageObject.getGroupId();
                    groupedMessages.groupId = groupId;
                    iVar.k(groupedMessages, groupId);
                }
                if (groupedMessages.getPosition(messageObject) == null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < groupedMessages.messages.size()) {
                            if (groupedMessages.messages.get(i14).getId() == messageObject.getId()) {
                                break;
                            }
                            i14++;
                        } else {
                            groupedMessages.messages.add(messageObject);
                            break;
                        }
                    }
                }
            } else if (messageObject.getGroupIdForUse() != 0) {
                messageObject.messageOwner.grouped_id = 0L;
                messageObject.localSentGroupId = 0L;
            }
            i13++;
        }
        for (int i15 = 0; i15 < iVar.m(); i15++) {
            ((MessageObject.GroupedMessages) iVar.n(i15)).calculate();
        }
        ArrayList arrayList2 = this.N;
        arrayList2.addAll(arrayList);
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            int i17 = this.O;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i16);
            if (getContext() == null) {
                i10 = i16;
                i11 = 0;
            } else {
                if (this.f43824x0 == null) {
                    this.f43824x0 = new org.telegram.ui.Cells.u1(getContext(), this.f43796c, true, null, this.f43794b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f43824x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId());
                ai.l4 l4Var = u1Var.S0;
                l4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f23297m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f23368r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f23462xe = 0;
                    i11 = 0;
                    for (int i18 = 0; i18 < groupedMessages2.messages.size(); i18++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i18);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            u1Var.V3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += u1Var.J8;
                        }
                    }
                    i10 = i16;
                } else {
                    i10 = i16;
                    u1Var.V3(messageObject2, groupedMessages2, false, false, false, false);
                    l4Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    u1Var.n4();
                    i11 = u1Var.J8;
                }
            }
            this.O = Math.max(i17, i11);
            i16 = i10 + 1;
        }
        si0 si0Var = this.K;
        si0Var.getAdapter().l();
        int h = si0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.wg r(org.telegram.ui.Components.wg wgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = wgVar;
        int[] iArr = this.f43811o0;
        wgVar.getLocationOnScreen(iArr);
        mi0 mi0Var = new mi0(this, getContext(), wgVar.f32534b, this.f43794b, wgVar, z10);
        this.X = mi0Var;
        mi0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.wg wgVar2 = this.W;
        mi0 mi0Var2 = this.X;
        mi0Var2.E = wgVar2.E;
        mi0Var2.f32544h0 = wgVar2.f32544h0;
        mi0Var2.f32537c0.q(wgVar2.f32537c0.f29244g, false, true);
        mi0Var2.f32538d0 = wgVar2.f32538d0;
        mi0Var2.setEmoji(wgVar2.f32541f.f29226f[0]);
        mi0Var2.i(wgVar2.f32550s, wgVar2.f32549r, true);
        mi0Var2.P.d(wgVar2.P.f25934c, true);
        mi0Var2.f32552x.d(wgVar2.f32552x.f25934c, true);
        int i10 = wgVar2.I;
        int i11 = wgVar2.J;
        mi0Var2.I = i10;
        mi0Var2.J = i11;
        float f7 = wgVar2.M;
        float f10 = wgVar2.N;
        mi0Var2.M = f7;
        mi0Var2.N = f10;
        this.X.P.d(wgVar.P.f25934c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(wgVar.getWidth(), wgVar.getHeight()));
        org.telegram.ui.Components.wg wgVar3 = this.W;
        wgVar.getHeight();
        this.Y = wgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.wg wgVar4 = this.W;
        wgVar.getHeight();
        iArr[0] = org.telegram.messenger.ok.D(6.0f, width - wgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        org.telegram.ui.Components.e11 e11Var = null;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 > 0) {
            e11Var = new org.telegram.ui.Components.e11(yh.x7.d1(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f43826y0 = e11Var;
        if (this.f43827z0 == null) {
            Paint paint = new Paint(1);
            this.f43827z0 = paint;
            paint.setColor(1073741824);
        }
        this.K.invalidate();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i11 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i11);
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                    if (i10 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    messageMedia.spoiler = z10;
                }
                i11++;
            } else {
                this.L.l();
                return;
            }
        }
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        vh.f.f(true);
        super.show();
        final float alpha = this.W.getAlpha();
        org.telegram.ui.Components.wg wgVar = this.W;
        if (wgVar != null) {
            wgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.sm0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                zi0 zi0Var = zi0.this;
                fh.b bVar = zi0Var.f43806j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.wg wgVar2 = zi0Var.W;
                if (wgVar2 != null) {
                    wgVar2.setAlpha(alpha);
                }
                zi0Var.f43801f = bitmap;
                Paint paint = new Paint(1);
                zi0Var.f43809n = paint;
                Bitmap bitmap3 = zi0Var.f43801f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                zi0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                zi0Var.f43814r = new Matrix();
                bVar.a(bitmap2);
                gh.d.c(bVar, zi0Var.F);
                ViewGroup viewGroup = zi0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        ki0 ki0Var = this.H;
        if (ki0Var != null) {
            ki0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f43802f0) {
            return;
        }
        this.f43803g0 = false;
        this.f43802f0 = true;
        this.f43800e0.p(null, null, true);
        this.f43800e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.tr.h).start();
        this.f43800e0.r(false);
    }

    public void m(long j3) {
    }
}
