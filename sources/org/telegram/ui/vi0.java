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
public class vi0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final gi0 F;
    public final ni0 G;
    public final gi0 H;
    public long I;
    public org.telegram.ui.Components.o5 J;
    public final oi0 K;
    public final fi0 L;
    public final ri0 M;
    public final ArrayList N;
    public int O;
    public final a0.i P;
    public org.telegram.ui.Cells.u1 Q;
    public int R;
    public org.telegram.ui.Components.qf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.de V;
    public org.telegram.ui.Components.vg W;
    public ii0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f38726a;
    public final hi0 f38727a0;
    public final org.telegram.ui.ActionBar.d6 f38728b;
    public boolean f38729b0;
    public final int f38730c;
    public float f38731c0;
    public eb0 d;
    public FrameLayout f38732d0;
    public i0.b e;
    public ji0 f38733e0;
    public Bitmap f38734f;
    public boolean f38735f0;
    public boolean f38736g0;
    public BitmapShader h;
    public boolean f38737h0;
    public final vh.f f38738i0;
    public final fh.b f38739j0;
    public final ah.c f38740k0;
    public RectF f38741l0;
    public boolean m0;
    public Paint f38742n;
    public boolean f38743n0;
    public final int[] f38744o0;
    public boolean f38745p0;
    public boolean f38746q0;
    public Matrix f38747r;
    public org.telegram.ui.Cells.u1 f38748r0;
    public boolean f38749s;
    public float f38750s0;
    public float f38751t0;
    public final Rect f38752u0;
    public boolean v;
    public ValueAnimator f38753v0;
    public boolean f38754w;
    public boolean f38755w0;
    public boolean f38756x;
    public org.telegram.ui.Cells.u1 f38757x0;
    public boolean f38758y;
    public org.telegram.ui.Components.t01 f38759y0;
    public Paint f38760z0;

    public vi0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, R.style.TransparentDialog);
        eb0 eb0Var;
        int i10 = UserConfig.selectedAccount;
        this.f38730c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.i();
        this.T = new Paint(1);
        this.f38744o0 = new int[2];
        this.f38746q0 = false;
        this.f38752u0 = new Rect();
        this.f38726a = context;
        this.f38728b = d6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            eb0Var = new eb0(launchActivity, true);
        } else {
            eb0Var = null;
        }
        this.d = eb0Var;
        gi0 gi0Var = new gi0(this, context, 1);
        this.F = gi0Var;
        this.f38738i0 = vh.f.d(1, gi0Var, gi0Var);
        gi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final vi0 f33130b;

            {
                this.f33130b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33130b.onBackPressed();
                        return;
                    default:
                        this.f33130b.onBackPressed();
                        return;
                }
            }
        });
        gi0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                vi0 vi0Var = vi0.this;
                if (!vi0Var.f38745p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(vi0Var.S);
                    AndroidUtilities.runOnUIThread(new bi0(vi0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        fh.b bVar = new fh.b();
        this.f38739j0 = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f38740k0 = cVar;
        cVar.f425f = new hh.k(gi0Var);
        cVar.f426g = gi0Var;
        ni0 ni0Var = new ni0(this, context, d6Var);
        this.G = ni0Var;
        ni0Var.setClipToPadding(false);
        gi0Var.addView(ni0Var, w7.y5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f42128a;
        r0.a0.j(gi0Var, gVar);
        oi0 oi0Var = new oi0(this, context, d6Var);
        this.K = oi0Var;
        oi0Var.setOnClickListener(new View.OnClickListener(this) {
            public final vi0 f33130b;

            {
                this.f33130b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33130b.onBackPressed();
                        return;
                    default:
                        this.f33130b.onBackPressed();
                        return;
                }
            }
        });
        oi0Var.setOnItemClickListener(new i(this, 17));
        oi0Var.setOnScrollListener(new i3(this, 19));
        oi0Var.setItemAnimator(new ji.n(null, oi0Var, d6Var));
        ri0 ri0Var = new ri0(this);
        this.M = ri0Var;
        ri0Var.O = new si0(this);
        oi0Var.setLayoutManager(ri0Var);
        oi0Var.i(new Object());
        fi0 fi0Var = new fi0(this, context, d6Var);
        this.L = fi0Var;
        oi0Var.setAdapter(fi0Var);
        oi0Var.setVerticalScrollBarEnabled(false);
        oi0Var.setOverScrollMode(2);
        ni0Var.addView(oi0Var, w7.y5.c(-2.0f, -1));
        gi0 gi0Var2 = new gi0(this, context, 0);
        this.H = gi0Var2;
        gi0Var.addView(gi0Var2, w7.y5.c(-1.0f, -1));
        this.f38727a0 = new hi0(this, gi0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f38730c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        eb0 eb0Var = this.d;
        if (eb0Var != null) {
            eb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.m2 m2Var) {
        zg.x xVar;
        if (this.f38733e0 == null && m2Var != null) {
            int i10 = this.f38730c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f38726a);
            this.f38732d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f38732d0.setClipToPadding(false);
            this.f38732d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? qk0Var = new org.telegram.ui.Components.qk0(5, this.f38730c, getContext(), null, this.f38728b);
            this.f38733e0 = qk0Var;
            qk0Var.setClipChildren(false);
            this.f38733e0.setClipToPadding(false);
            this.f38733e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f38733e0.setDelegate(new li0(this, m2Var));
            this.f38733e0.setTop(false);
            this.f38733e0.setClipChildren(false);
            this.f38733e0.setClipToPadding(false);
            this.f38733e0.setVisibility(0);
            this.f38733e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f38733e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f38733e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f38732d0, w7.y5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38732d0.addView(this.f38733e0, w7.y5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f38733e0.setScaleY(0.4f);
            this.f38733e0.setScaleX(0.4f);
            this.f38733e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            ji0 ji0Var = this.f38733e0;
            if (ji0Var != null && !ji0Var.f27667f1) {
                ji0Var.f27667f1 = true;
                ji0Var.f27669g1 = true;
                zg.b0 b0Var = ji0Var.f27693x0;
                if (b0Var != null && (xVar = b0Var.f49254m) != null && !xVar.K1) {
                    xVar.K1 = true;
                    xVar.L1 = true;
                    x51 x51Var = xVar.f32027h0;
                    if (x51Var != null) {
                        x51Var.invalidate();
                    }
                    n51 n51Var = xVar.f32029i0;
                    if (n51Var != null) {
                        n51Var.invalidate();
                    }
                }
            }
            new ci.i4(this.F, false, new t3(this, 11));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f38730c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f38746q0) {
            return;
        }
        this.f38746q0 = true;
        ii0 ii0Var = this.X;
        if (ii0Var != null) {
            ii0Var.invalidate();
        }
        org.telegram.ui.Components.vg vgVar = this.W;
        if (vgVar != null) {
            vgVar.invalidate();
        }
        e(new ai0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        ji0 ji0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f38753v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.m1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        float f7 = 0.0f;
        if (!z10 && (ji0Var = this.f38733e0) != null && this.f38735f0) {
            ji0Var.e();
            if (this.f38733e0.getReactionsWindow() != null && this.f38733e0.getReactionsWindow().f49245a != null) {
                this.f38733e0.getReactionsWindow().f49245a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f38733e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f38754w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f38756x = true;
        this.f38758y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38753v0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(9, this, z11));
        this.f38753v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f38753v0.setInterpolator(org.telegram.ui.Components.rr.h);
        this.f38753v0.setDuration(350L);
        this.f38753v0.start();
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
        oi0 oi0Var = this.K;
        if (oi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < oi0Var.getChildCount()) {
                View childAt = oi0Var.getChildAt(i11);
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
            oi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        oi0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f38749s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f38746q0) {
            return;
        }
        this.f38746q0 = true;
        vh.f.f(false);
        vh.f fVar = this.f38738i0;
        if (fVar != null) {
            fVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f38746q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f38759y0 != null && this.f38760z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f38759y0.f28363c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f38760z0);
            this.f38759y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f38743n0 && this.f38733e0 != null) {
            if (this.f38741l0 != null) {
                this.f38743n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f38743n0 = true;
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
        ri0 ri0Var;
        int i10;
        oi0 oi0Var = this.K;
        if (oi0Var != null && oi0Var.getAdapter() != null && (ri0Var = this.M) != null) {
            int h = oi0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            ri0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f38755w0 = z10;
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
        if (this.f38733e0 != null && (effect = MessagesController.getInstance(this.f38730c).getEffect(j3)) != null) {
            this.f38733e0.setSelectedReactionAnimated(zg.o0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f38729b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f38729b0 = false;
            return;
        }
        ji0 ji0Var = this.f38733e0;
        if (ji0Var != null && ji0Var.getReactionsWindow() != null) {
            if (!this.f38733e0.getReactionsWindow().C) {
                this.f38733e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f38743n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        gi0 gi0Var = this.F;
        setContentView(gi0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        gi0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(gi0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    public final void p(org.telegram.ui.Components.y70 y70Var) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f38728b;
        y70Var.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var)));
        y70Var.Q(this.f38740k0, eh.b.k(d6Var), false);
        ViewGroup viewGroup = y70Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, w7.y5.c(-2.0f, -2));
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
                if (this.f38757x0 == null) {
                    this.f38757x0 = new org.telegram.ui.Cells.u1(getContext(), this.f38730c, true, null, this.f38728b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f38757x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId());
                ai.l4 l4Var = u1Var.S0;
                l4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f21434m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f21505r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f21599xe = 0;
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
        oi0 oi0Var = this.K;
        oi0Var.getAdapter().l();
        int h = oi0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.vg r(org.telegram.ui.Components.vg vgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = vgVar;
        int[] iArr = this.f38744o0;
        vgVar.getLocationOnScreen(iArr);
        ii0 ii0Var = new ii0(this, getContext(), vgVar.f29136b, this.f38728b, vgVar, z10);
        this.X = ii0Var;
        ii0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.vg vgVar2 = this.W;
        ii0 ii0Var2 = this.X;
        ii0Var2.E = vgVar2.E;
        ii0Var2.f29145h0 = vgVar2.f29145h0;
        ii0Var2.f29139c0.q(vgVar2.f29139c0.f26932g, false, true);
        ii0Var2.f29140d0 = vgVar2.f29140d0;
        ii0Var2.setEmoji(vgVar2.f29142f.f26920f[0]);
        ii0Var2.i(vgVar2.f29151s, vgVar2.f29150r, true);
        ii0Var2.P.d(vgVar2.P.f23844c, true);
        ii0Var2.f29153x.d(vgVar2.f29153x.f23844c, true);
        int i10 = vgVar2.I;
        int i11 = vgVar2.J;
        ii0Var2.I = i10;
        ii0Var2.J = i11;
        float f7 = vgVar2.M;
        float f10 = vgVar2.N;
        ii0Var2.M = f7;
        ii0Var2.N = f10;
        this.X.P.d(vgVar.P.f23844c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(vgVar.getWidth(), vgVar.getHeight()));
        org.telegram.ui.Components.vg vgVar3 = this.W;
        vgVar.getHeight();
        this.Y = vgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.vg vgVar4 = this.W;
        vgVar.getHeight();
        iArr[0] = org.telegram.messenger.ok.D(6.0f, width - vgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        org.telegram.ui.Components.t01 t01Var = null;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 > 0) {
            t01Var = new org.telegram.ui.Components.t01(yh.w7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f38759y0 = t01Var;
        if (this.f38760z0 == null) {
            Paint paint = new Paint(1);
            this.f38760z0 = paint;
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
        org.telegram.ui.Components.vg vgVar = this.W;
        if (vgVar != null) {
            vgVar.setAlpha(0.0f);
        }
        org.telegram.ui.Components.mm0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                vi0 vi0Var = vi0.this;
                fh.b bVar = vi0Var.f38739j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.vg vgVar2 = vi0Var.W;
                if (vgVar2 != null) {
                    vgVar2.setAlpha(alpha);
                }
                vi0Var.f38734f = bitmap;
                Paint paint = new Paint(1);
                vi0Var.f38742n = paint;
                Bitmap bitmap3 = vi0Var.f38734f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                vi0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                vi0Var.f38747r = new Matrix();
                bVar.a(bitmap2);
                gh.d.c(bVar, vi0Var.F);
                ViewGroup viewGroup = vi0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        gi0 gi0Var = this.H;
        if (gi0Var != null) {
            gi0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f38735f0) {
            return;
        }
        this.f38736g0 = false;
        this.f38735f0 = true;
        this.f38733e0.p(null, null, true);
        this.f38733e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.rr.h).start();
        this.f38733e0.r(false);
    }

    public void m(long j3) {
    }
}
