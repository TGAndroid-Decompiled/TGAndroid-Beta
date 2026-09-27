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
public class yi0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final ji0 F;
    public final qi0 G;
    public final ji0 H;
    public long I;
    public org.telegram.ui.Components.o5 J;
    public final ri0 K;
    public final ii0 L;
    public final ui0 M;
    public final ArrayList N;
    public int O;
    public final a0.i P;
    public org.telegram.ui.Cells.u1 Q;
    public int R;
    public org.telegram.ui.Components.qf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.ce V;
    public org.telegram.ui.Components.vg W;
    public li0 X;
    public int Y;
    public ViewGroup Z;
    public final Context f40221a;
    public final ki0 f40222a0;
    public final org.telegram.ui.ActionBar.e6 f40223b;
    public boolean f40224b0;
    public final int f40225c;
    public float f40226c0;
    public hb0 d;
    public FrameLayout f40227d0;
    public i0.b e;
    public mi0 f40228e0;
    public Bitmap f40229f;
    public boolean f40230f0;
    public boolean f40231g0;
    public BitmapShader h;
    public boolean f40232h0;
    public final vh.f f40233i0;
    public final fh.b f40234j0;
    public final ah.c f40235k0;
    public RectF f40236l0;
    public boolean m0;
    public Paint f40237n;
    public boolean f40238n0;
    public final int[] f40239o0;
    public boolean f40240p0;
    public boolean f40241q0;
    public Matrix f40242r;
    public org.telegram.ui.Cells.u1 f40243r0;
    public boolean f40244s;
    public float f40245s0;
    public float f40246t0;
    public final Rect f40247u0;
    public boolean v;
    public ValueAnimator f40248v0;
    public boolean f40249w;
    public boolean f40250w0;
    public boolean f40251x;
    public org.telegram.ui.Cells.u1 f40252x0;
    public boolean f40253y;
    public org.telegram.ui.Components.v01 f40254y0;
    public Paint f40255z0;

    public yi0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, R.style.TransparentDialog);
        hb0 hb0Var;
        int i10 = UserConfig.selectedAccount;
        this.f40225c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.i();
        this.T = new Paint(1);
        this.f40239o0 = new int[2];
        this.f40241q0 = false;
        this.f40247u0 = new Rect();
        this.f40221a = context;
        this.f40223b = e6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            hb0Var = new hb0(launchActivity, true);
        } else {
            hb0Var = null;
        }
        this.d = hb0Var;
        ji0 ji0Var = new ji0(this, context, 1);
        this.F = ji0Var;
        this.f40233i0 = vh.f.d(1, ji0Var, ji0Var);
        ji0Var.setOnClickListener(new View.OnClickListener(this) {
            public final yi0 f33951b;

            {
                this.f33951b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33951b.onBackPressed();
                        return;
                    default:
                        this.f33951b.onBackPressed();
                        return;
                }
            }
        });
        ji0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                yi0 yi0Var = yi0.this;
                if (!yi0Var.f40240p0 && (view2 instanceof EditText)) {
                    AndroidUtilities.hideKeyboard(yi0Var.S);
                    AndroidUtilities.runOnUIThread(new ei0(yi0Var, (EditText) view2, 0), 200L);
                }
            }
        });
        fh.b bVar = new fh.b();
        this.f40234j0 = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f40235k0 = cVar;
        cVar.f425f = new hh.k(ji0Var);
        cVar.f426g = ji0Var;
        qi0 qi0Var = new qi0(this, context, e6Var);
        this.G = qi0Var;
        qi0Var.setClipToPadding(false);
        ji0Var.addView(qi0Var, w7.y5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.f42173a;
        r0.a0.j(ji0Var, gVar);
        ri0 ri0Var = new ri0(this, context, e6Var);
        this.K = ri0Var;
        ri0Var.setOnClickListener(new View.OnClickListener(this) {
            public final yi0 f33951b;

            {
                this.f33951b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33951b.onBackPressed();
                        return;
                    default:
                        this.f33951b.onBackPressed();
                        return;
                }
            }
        });
        ri0Var.setOnItemClickListener(new i(this, 17));
        ri0Var.setOnScrollListener(new j3(this, 19));
        ri0Var.setItemAnimator(new ji.n(null, ri0Var, e6Var));
        ui0 ui0Var = new ui0(this);
        this.M = ui0Var;
        ui0Var.O = new vi0(this);
        ri0Var.setLayoutManager(ui0Var);
        ri0Var.i(new Object());
        ii0 ii0Var = new ii0(this, context, e6Var);
        this.L = ii0Var;
        ri0Var.setAdapter(ii0Var);
        ri0Var.setVerticalScrollBarEnabled(false);
        ri0Var.setOverScrollMode(2);
        qi0Var.addView(ri0Var, w7.y5.c(-2.0f, -1));
        ji0 ji0Var2 = new ji0(this, context, 0);
        this.H = ji0Var2;
        ji0Var.addView(ji0Var2, w7.y5.c(-1.0f, -1));
        this.f40222a0 = new ki0(this, ji0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.f40225c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        hb0 hb0Var = this.d;
        if (hb0Var != null) {
            hb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.o2 o2Var) {
        zg.y yVar;
        if (this.f40228e0 == null && o2Var != null) {
            int i10 = this.f40225c;
            MessagesController.getInstance(i10).getAvailableEffects();
            FrameLayout frameLayout = new FrameLayout(this.f40221a);
            this.f40227d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.f40227d0.setClipToPadding(false);
            this.f40227d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
            ?? sk0Var = new org.telegram.ui.Components.sk0(5, this.f40225c, getContext(), null, this.f40223b);
            this.f40228e0 = sk0Var;
            sk0Var.setClipChildren(false);
            this.f40228e0.setClipToPadding(false);
            this.f40228e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
            this.f40228e0.setDelegate(new oi0(this, o2Var));
            this.f40228e0.setTop(false);
            this.f40228e0.setClipChildren(false);
            this.f40228e0.setClipToPadding(false);
            this.f40228e0.setVisibility(0);
            this.f40228e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
            this.f40228e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
            this.f40228e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
            this.G.addView(this.f40227d0, w7.y5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40227d0.addView(this.f40228e0, w7.y5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.f40228e0.setScaleY(0.4f);
            this.f40228e0.setScaleX(0.4f);
            this.f40228e0.setAlpha(0.0f);
            if (MessagesController.getInstance(i10).hasAvailableEffects()) {
                t();
            } else {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
            }
            mi0 mi0Var = this.f40228e0;
            if (mi0Var != null && !mi0Var.f28297f1) {
                mi0Var.f28297f1 = true;
                mi0Var.f28299g1 = true;
                zg.c0 c0Var = mi0Var.f28323x0;
                if (c0Var != null && (yVar = c0Var.f49308m) != null && !yVar.K1) {
                    yVar.K1 = true;
                    yVar.L1 = true;
                    z51 z51Var = yVar.f32585h0;
                    if (z51Var != null) {
                        z51Var.invalidate();
                    }
                    p51 p51Var = yVar.f32587i0;
                    if (p51Var != null) {
                        p51Var.invalidate();
                    }
                }
            }
            new ci.i4(this.F, false, new u3(this, 11));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.f40225c).hasAvailableEffects()) {
            t();
        }
    }

    @Override
    public final void dismiss() {
        if (this.f40241q0) {
            return;
        }
        this.f40241q0 = true;
        li0 li0Var = this.X;
        if (li0Var != null) {
            li0Var.invalidate();
        }
        org.telegram.ui.Components.vg vgVar = this.W;
        if (vgVar != null) {
            vgVar.invalidate();
        }
        e(new di0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        boolean z11;
        mi0 mi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.f40248v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            org.telegram.ui.ActionBar.o1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        float f7 = 0.0f;
        if (!z10 && (mi0Var = this.f40228e0) != null && this.f40230f0) {
            mi0Var.e();
            if (this.f40228e0.getReactionsWindow() != null && this.f40228e0.getReactionsWindow().f49299a != null) {
                this.f40228e0.getReactionsWindow().f49299a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.f40228e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.f40249w = true;
        this.v = !z10;
        this.K.invalidate();
        this.f40251x = true;
        this.f40253y = true;
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40248v0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(9, this, z11));
        this.f40248v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.f40248v0.setInterpolator(org.telegram.ui.Components.sr.h);
        this.f40248v0.setDuration(350L);
        this.f40248v0.start();
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
        ri0 ri0Var = this.K;
        if (ri0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < ri0Var.getChildCount()) {
                View childAt = ri0Var.getChildAt(i11);
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
            ri0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        ri0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.f40244s = z10;
        dismiss();
    }

    public final void i() {
        if (this.f40241q0) {
            return;
        }
        this.f40241q0 = true;
        vh.f.f(false);
        vh.f fVar = this.f40233i0;
        if (fVar != null) {
            fVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override
    public final boolean isShowing() {
        return !this.f40241q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f40254y0 != null && this.f40255z0 != null) {
            float f13 = (f7 + f11) / 2.0f;
            float f14 = (f10 + f12) / 2.0f;
            float dp = AndroidUtilities.dp(28.0f) + this.f40254y0.f28987c;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = dp / 2.0f;
            float f16 = f13 - f15;
            float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
            rectF.set(f16, f14 - dp2, f13 + f15, f14 + dp2);
            canvas.save();
            canvas.drawRoundRect(rectF, dp2, dp2, this.f40255z0);
            this.f40254y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long k() {
        MessageObject messageObject;
        if (!this.f40238n0 && this.f40228e0 != null) {
            if (this.f40236l0 != null) {
                this.f40238n0 = true;
                return this.I;
            }
            org.telegram.ui.Cells.u1 u1Var = this.Q;
            if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if ((message.flags2 & 4) != 0) {
                    this.f40238n0 = true;
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
        ui0 ui0Var;
        int i10;
        ri0 ri0Var = this.K;
        if (ri0Var != null && ri0Var.getAdapter() != null && (ui0Var = this.M) != null) {
            int h = ri0Var.getAdapter().h();
            if (z10) {
                if (h > 10) {
                    i10 = h % 10;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = h - 1;
            }
            ui0Var.i1(i10, AndroidUtilities.dp(12.0f), z10);
            this.f40250w0 = z10;
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
        if (this.f40228e0 != null && (effect = MessagesController.getInstance(this.f40225c).getEffect(j3)) != null) {
            this.f40228e0.setSelectedReactionAnimated(zg.p0.e(effect));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f40224b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.f40224b0 = false;
            return;
        }
        mi0 mi0Var = this.f40228e0;
        if (mi0Var != null && mi0Var.getReactionsWindow() != null) {
            if (!this.f40228e0.getReactionsWindow().C) {
                this.f40228e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.f40238n0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ji0 ji0Var = this.F;
        setContentView(ji0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        ji0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(ji0Var, !org.telegram.ui.ActionBar.i6.I.q());
    }

    public final void p(org.telegram.ui.Components.a80 a80Var) {
        int i10 = org.telegram.ui.ActionBar.i6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f40223b;
        a80Var.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(i10, e6Var)));
        a80Var.Q(this.f40235k0, eh.b.k(e6Var), false);
        ViewGroup viewGroup = a80Var.A;
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
                if (this.f40252x0 == null) {
                    this.f40252x0 = new org.telegram.ui.Cells.u1(getContext(), this.f40225c, true, null, this.f40223b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.f40252x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId());
                ai.l4 l4Var = u1Var.S0;
                l4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.f21437m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.f21508r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 != null && groupedMessages2.messages.size() != 1) {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.f21602xe = 0;
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
        ri0 ri0Var = this.K;
        ri0Var.getAdapter().l();
        int h = ri0Var.getAdapter().h();
        if (h > 10) {
            i12 = h % 10;
        }
        this.M.i1(i12, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.vg r(org.telegram.ui.Components.vg vgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = vgVar;
        int[] iArr = this.f40239o0;
        vgVar.getLocationOnScreen(iArr);
        li0 li0Var = new li0(this, getContext(), vgVar.f29112b, this.f40223b, vgVar, z10);
        this.X = li0Var;
        li0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.vg vgVar2 = this.W;
        li0 li0Var2 = this.X;
        li0Var2.E = vgVar2.E;
        li0Var2.f29121h0 = vgVar2.f29121h0;
        li0Var2.f29115c0.q(vgVar2.f29115c0.f26986g, false, true);
        li0Var2.f29116d0 = vgVar2.f29116d0;
        li0Var2.setEmoji(vgVar2.f29118f.f26971f[0]);
        li0Var2.i(vgVar2.f29127s, vgVar2.f29126r, true);
        li0Var2.P.d(vgVar2.P.f23890c, true);
        li0Var2.f29129x.d(vgVar2.f29129x.f23890c, true);
        int i10 = vgVar2.I;
        int i11 = vgVar2.J;
        li0Var2.I = i10;
        li0Var2.J = i11;
        float f7 = vgVar2.M;
        float f10 = vgVar2.N;
        li0Var2.M = f7;
        li0Var2.N = f10;
        this.X.P.d(vgVar.P.f23890c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(vgVar.getWidth(), vgVar.getHeight()));
        org.telegram.ui.Components.vg vgVar3 = this.W;
        vgVar.getHeight();
        this.Y = vgVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.vg vgVar4 = this.W;
        vgVar.getHeight();
        iArr[0] = org.telegram.messenger.qk.D(6.0f, width - vgVar4.m(), i12);
        return this.X;
    }

    public final void s(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z10;
        org.telegram.ui.Components.v01 v01Var = null;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 > 0) {
            v01Var = new org.telegram.ui.Components.v01(yh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
        }
        this.f40254y0 = v01Var;
        if (this.f40255z0 == null) {
            Paint paint = new Paint(1);
            this.f40255z0 = paint;
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
        org.telegram.ui.Components.om0.d(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                yi0 yi0Var = yi0.this;
                fh.b bVar = yi0Var.f40234j0;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                org.telegram.ui.Components.vg vgVar2 = yi0Var.W;
                if (vgVar2 != null) {
                    vgVar2.setAlpha(alpha);
                }
                yi0Var.f40229f = bitmap;
                Paint paint = new Paint(1);
                yi0Var.f40237n = paint;
                Bitmap bitmap3 = yi0Var.f40229f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                yi0Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                yi0Var.f40242r = new Matrix();
                bVar.a(bitmap2);
                gh.d.c(bVar, yi0Var.F);
                ViewGroup viewGroup = yi0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        ji0 ji0Var = this.H;
        if (ji0Var != null) {
            ji0Var.bringToFront();
        }
        e(null, true);
    }

    public final void t() {
        if (this.f40230f0) {
            return;
        }
        this.f40231g0 = false;
        this.f40230f0 = true;
        this.f40228e0.p(null, null, true);
        this.f40228e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.sr.h).start();
        this.f40228e0.r(false);
    }

    public void m(long j3) {
    }
}
