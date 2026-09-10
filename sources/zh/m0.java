package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.b9;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.uc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.bq0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ic1;
import org.telegram.ui.m20;
import org.telegram.ui.zp0;
import xh.r8;
public abstract class m0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public t E;
    public int F;
    public boolean G;
    public long H;
    public final m20 I;
    public boolean J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public TLRPC.InputGroupCall O;
    public t0 P;
    public long Q;
    public long R;
    public boolean S;
    public ArrayList T;
    public boolean U;
    public final u V;
    public pc W;
    public final View f48661a;
    public jc f48662a0;
    public final FrameLayout f48663b;
    public nc f48664b0;
    public final zp0 f48665c;
    public ic f48666c0;
    public final s4.c0 d;
    public final u f48667d0;
    public final x e;
    public ValueAnimator f48668e0;
    public final ic1 f48669f;
    public boolean f48670f0;
    public final u f48671g0;
    public final s4.c0 h;
    public final j61 f48672n;
    public final ArrayList f48673r;
    public final ArrayList f48674s;
    public final HashMap v;
    public long f48675w;
    public int f48676x;
    public boolean f48677y;

    public m0(Context context, u7 u7Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f48673r = new ArrayList();
        this.f48674s = new ArrayList();
        this.v = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new m20();
        int i10 = UserConfig.selectedAccount;
        this.N = i10;
        this.T = new ArrayList();
        final o1 o1Var = (o1) this;
        this.V = new u(o1Var, 0);
        this.f48667d0 = new u(o1Var, 1);
        this.f48670f0 = false;
        this.f48671g0 = new u(o1Var, 2);
        this.f48661a = view;
        this.f48663b = frameLayout;
        view.setAlpha(0.5f);
        zp0 zp0Var = new zp0(o1Var, context, 3);
        this.f48665c = zp0Var;
        zp0Var.setWillNotDraw(false);
        s4.c0 c0Var = new s4.c0(1, true);
        this.d = c0Var;
        zp0Var.setLayoutManager(c0Var);
        x xVar = new x(o1Var, zp0Var, context, i10, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j3;
                int i11 = r2;
                int i12 = 0;
                o1 o1Var2 = o1Var;
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = o1Var2.f48673r;
                        t0 t0Var = o1Var2.P;
                        if (t0Var == null) {
                            j3 = 0;
                        } else {
                            j3 = t0Var.j();
                        }
                        o1Var2.H = j3;
                        while (i12 < arrayList2.size()) {
                            k0 k0Var = (k0) arrayList2.get(i12);
                            if (k0Var.f48576b || !k0Var.e || k0Var.f48579g >= j3) {
                                int i13 = e0.f48360a;
                                v51 J = v51.J(e0.class);
                                J.G = k0Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = o1Var2.f48674s;
                        while (i12 < arrayList3.size()) {
                            int i14 = i0.f48486a;
                            v51 J2 = v51.J(i0.class);
                            J2.G = (l0) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, new b());
        this.e = xVar;
        zp0Var.setAdapter(xVar);
        xVar.f24250r = false;
        zp0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        zp0Var.setClipToPadding(false);
        addView(zp0Var, w7.a6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        zp0Var.setOnItemClickListener(new b9(o1Var, viewGroup, u7Var, 3));
        y yVar = new y(o1Var);
        yVar.f41645m = false;
        yVar.C = false;
        wr wrVar = wr.h;
        yVar.o(wrVar);
        yVar.n(280L);
        yVar.D = 14L;
        zp0Var.setItemAnimator(yVar);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new org.telegram.ui.web.c(o1Var, 24));
        ic1 ic1Var = new ic1(context, 13, null);
        this.f48669f = ic1Var;
        ic1Var.setWillNotDraw(false);
        s4.c0 c0Var2 = new s4.c0(0, false);
        this.h = c0Var2;
        ic1Var.setLayoutManager(c0Var2);
        j61 j61Var = new j61(ic1Var, context, i10, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j3;
                int i11 = r2;
                int i12 = 0;
                o1 o1Var2 = o1Var;
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var2 = (j61) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = o1Var2.f48673r;
                        t0 t0Var = o1Var2.P;
                        if (t0Var == null) {
                            j3 = 0;
                        } else {
                            j3 = t0Var.j();
                        }
                        o1Var2.H = j3;
                        while (i12 < arrayList2.size()) {
                            k0 k0Var = (k0) arrayList2.get(i12);
                            if (k0Var.f48576b || !k0Var.e || k0Var.f48579g >= j3) {
                                int i13 = e0.f48360a;
                                v51 J = v51.J(e0.class);
                                J.G = k0Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = o1Var2.f48674s;
                        while (i12 < arrayList3.size()) {
                            int i14 = i0.f48486a;
                            v51 J2 = v51.J(i0.class);
                            J2.G = (l0) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, null);
        this.f48672n = j61Var;
        ic1Var.setAdapter(j61Var);
        j61Var.f24250r = false;
        ic1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ic1Var.setClipToPadding(false);
        addView(ic1Var, w7.a6.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        ic1Var.setOnItemClickListener(new th.e(o1Var, 21));
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wrVar);
        jVar.n(350L);
        ic1Var.setItemAnimator(jVar);
        u(false);
    }

    public static Integer a(m0 m0Var, Long l4) {
        m0Var.f48667d0.run();
        m0Var.R = l4.longValue();
        pc M = new wc(m0Var.f48663b, new b()).M(m0Var.getStarsToastTitle(), m0Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.f26089r = false;
        M.k(true);
        long j3 = 0;
        m0Var.R = 0L;
        m0Var.S = true;
        int o9 = m0Var.o(new TLRPC.TL_textWithEntities(), l4.longValue());
        t0 t0Var = m0Var.P;
        if (t0Var != null) {
            j3 = t0Var.j();
        }
        if (m0Var.getDefaultPeerId() == m0Var.M && m0Var.f()) {
            z10 = true;
        }
        if (l4.longValue() < j3 && !z10) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(o9);
    }

    private long getDefaultPeerId() {
        boolean z10;
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        t0 t0Var = this.P;
        if (t0Var != null && t0Var.l()) {
            TLRPC.GroupCall groupCall = this.P.v;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (z10) {
                return this.M;
            }
        }
        if (defaultSendAs == null) {
            return UserConfig.getInstance(this.N).getClientUserId();
        }
        return DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        zp0 zp0Var = this.f48665c;
        int height = zp0Var.getHeight();
        for (int i10 = 0; i10 < zp0Var.getChildCount(); i10++) {
            height = Math.min(zp0Var.getChildAt(i10).getTop(), height);
        }
        return zp0Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.R)));
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private int getTotalMyStars() {
        int i10 = (int) (0 + this.R);
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            if (((TL_phone.groupCallDonor) this.T.get(i11)).my) {
                i10 = (int) (i10 + ((TL_phone.groupCallDonor) this.T.get(i11)).stars);
            }
        }
        return i10;
    }

    public final void b() {
        this.R = 0L;
        h(getDefaultPeerId());
        f1 f1Var = ((o1) this).f48735i0.Z1;
        e1 e1Var = f1Var.f48398a;
        e1Var.c(f1Var);
        e1Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        k0 k0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f48673r;
            if (i11 < arrayList.size()) {
                if (((k0) arrayList.get(i11)).f48575a == i10) {
                    k0Var = (k0) arrayList.get(i11);
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                k0Var = null;
                break;
            }
        }
        if (k0Var != null) {
            if (k0Var.f48575a < 0 && k0Var.e) {
                long j3 = k0Var.f48579g;
                if (j3 > 0) {
                    this.Q -= j3;
                    j();
                }
            }
            int i12 = 0;
            while (true) {
                arrayList2 = this.f48674s;
                if (i12 >= arrayList2.size()) {
                    break;
                } else if (((l0) arrayList2.get(i12)).f48634f.contains(k0Var)) {
                    ((l0) arrayList2.get(i12)).f48634f.remove(k0Var);
                    if (((l0) arrayList2.get(i12)).f48634f.isEmpty()) {
                        arrayList2.remove(i12);
                        z10 = true;
                    } else {
                        ((l0) arrayList2.get(i12)).c();
                        m();
                    }
                } else {
                    i12++;
                }
            }
            arrayList.remove(i11);
            this.e.N(true);
            if (z10) {
                ConnectionsManager.getInstance(this.N).getCurrentTime();
                Collections.sort(arrayList2, new sg.p(this, 21));
                this.f48672n.N(true);
                t();
                u(true);
            }
        }
    }

    public final f0 d(int i10) {
        f0 f0Var;
        k0 k0Var;
        int i11 = 0;
        while (true) {
            zp0 zp0Var = this.f48665c;
            if (i11 < zp0Var.getChildCount()) {
                View childAt = zp0Var.getChildAt(i11);
                if ((childAt instanceof f0) && (k0Var = (f0Var = (f0) childAt).K) != null && k0Var.f48575a == i10) {
                    return f0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.liveStoryMessageUpdate) {
            int i12 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TL_update.TL_updateGroupCallMessage) {
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.O;
                if (inputGroupCall != null && inputGroupCall.f17212id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i13 = groupCallMessage.date;
                    int i14 = groupCallMessage.f17206id;
                    boolean z10 = groupCallMessage.from_admin;
                    long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i13, i14, z10, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.O;
                if (inputGroupCall2 != null && inputGroupCall2.f17212id == longValue) {
                    ArrayList<Integer> arrayList = tL_updateDeleteGroupCallMessages.messages;
                    int size = arrayList.size();
                    while (i12 < size) {
                        Integer num = arrayList.get(i12);
                        i12++;
                        c(num.intValue());
                    }
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.G) {
            return false;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getY() < s()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        zp0 zp0Var = this.f48665c;
        if (view == zp0Var) {
            if (zp0Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.K - zp0Var.getTop()) + zp0Var.getY();
            canvas.saveLayerAlpha(zp0Var.getX(), zp0Var.getY(), zp0Var.getX() + zp0Var.getWidth(), zp0Var.getY() + zp0Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((zp0Var.getY() + zp0Var.getHeight()) - max, getListViewTop()) * (1.0f - zp0Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
            m20 m20Var = this.I;
            m20Var.b(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (zp0Var.getY() + zp0Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), zp0Var.getHeight() + zp0Var.getBottom());
            m20Var.b(canvas, rectF, 3, 1.0f);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final int e(long j3) {
        return ((Integer) Map.EL.getOrDefault(this.v, Long.valueOf(j3), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.M) {
            long j3 = this.M;
            int i10 = this.N;
            if (j3 >= 0) {
                if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
                    return true;
                }
                return false;
            }
            t0 t0Var = this.P;
            if (t0Var != null && (inputGroupCall = this.O) != null && inputGroupCall.f17212id == t0Var.g() && (groupCall = this.P.v) != null && groupCall.creator) {
                return true;
            }
            return ChatObject.canManageCalls(MessagesController.getInstance(i10).getChat(Long.valueOf(-this.M)));
        }
        return false;
    }

    public final boolean g() {
        return this.f48670f0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        zp0 zp0Var = this.f48665c;
        int height = zp0Var.getHeight();
        for (int i10 = 0; i10 < zp0Var.getChildCount(); i10++) {
            height = Math.min(zp0Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f48673r.size();
    }

    public long getStarsCount() {
        return this.Q + this.R;
    }

    public int getUnreadMessagesCount() {
        long j3;
        int i10 = 0;
        if (this.F < 0) {
            return 0;
        }
        t0 t0Var = this.P;
        if (t0Var == null) {
            j3 = 0;
        } else {
            j3 = t0Var.j();
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f48673r;
            if (i10 < arrayList.size()) {
                k0 k0Var = (k0) arrayList.get(i10);
                int i12 = k0Var.f48575a;
                if (i12 >= 0 && i12 > this.F && (k0Var.f48576b || !k0Var.e || k0Var.f48579g >= j3)) {
                    i11++;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public abstract void h(long j3);

    public abstract void i(int i10, int i11, long j3);

    public abstract void j();

    public final void k(boolean z10) {
        this.f48667d0.run();
        ArrayList arrayList = new ArrayList();
        if (this.T != null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i10);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long clientUserId = UserConfig.getInstance(this.N).getClientUserId();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        bq0 bq0Var = new bq0(2);
        int i11 = this.N;
        r8 r8Var = new r8(getContext(), i11, this.M, null, null, arrayList, !z10, true, clientUserId, bq0Var);
        o1 o1Var = (o1) this;
        r8Var.N = o1Var;
        r8Var.P = new th.e(o1Var, 20);
        r8Var.show();
    }

    public final void l(int i10, int i11, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z11) {
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        l0 l0Var;
        boolean z12;
        l0 l0Var2;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f48673r;
            if (i13 < arrayList.size()) {
                if (((k0) arrayList.get(i13)).f48575a != i11) {
                    i13++;
                } else {
                    return;
                }
            } else {
                int i14 = this.N;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                ?? obj = new Object();
                obj.d = i10;
                obj.f48576b = z10;
                obj.f48577c = j3;
                obj.f48578f = tL_textWithEntities;
                obj.f48579g = j10;
                obj.f48575a = i11;
                obj.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = o.b(i14, (int) obj.f48579g, 0);
                long j11 = obj.f48579g;
                ArrayList arrayList2 = this.f48674s;
                boolean z13 = true;
                if (j11 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList2.size()) {
                            if (((l0) arrayList2.get(i15)).f48632b == j3) {
                                l0Var = (l0) arrayList2.get(i15);
                                break;
                            }
                            i15++;
                        } else {
                            l0Var = null;
                            break;
                        }
                    }
                    if (l0Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f48634f = arrayList3;
                        obj2.f48631a = i14;
                        obj2.f48632b = j3;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z12 = true;
                        l0Var2 = obj2;
                    } else {
                        l0Var.f48634f.add(obj);
                        this.f48669f.e1();
                        z12 = false;
                        l0Var2 = l0Var;
                    }
                    l0Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new sg.p(this, 21));
                    if (!z11) {
                        this.f48672n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && obj.e) {
                    long j12 = obj.f48579g;
                    if (j12 > 0) {
                        this.Q += j12;
                        j();
                    }
                }
                if (obj.f48575a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f48575a < ((k0) arrayList.get(size)).f48575a) {
                            i12 = size + 1;
                            break;
                        }
                    }
                }
                i12 = 0;
                arrayList.add(i12, obj);
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.N(true);
                }
                if (i12 <= 0 && !z11 && (!this.f48665c.canScrollVertically(1) || obj.f48575a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i16 = obj.f48575a;
                    if (i16 > 0) {
                        this.F = i16;
                    }
                }
                invalidate();
                o1 o1Var = (o1) this;
                a aVar = o1Var.f48735i0.X1;
                if (aVar != null) {
                    aVar.setCount(o1Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && obj.f48579g > 0) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < this.T.size()) {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.T.get(i17)).peer_id) == obj.f48577c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i17);
                                break;
                            }
                            i17++;
                        } else {
                            groupcalldonor = null;
                            break;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        if (UserConfig.getInstance(i14).getClientUserId() != obj.f48577c) {
                            z13 = false;
                        }
                        groupcalldonor.my = z13;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(obj.f48577c);
                        groupcalldonor.stars = 0L;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((l0) arrayList2.get(i18)).f48632b == obj.f48577c) {
                                ((l0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((l0) arrayList2.get(i18)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j13 = groupcalldonor.stars;
                    long j14 = obj.f48579g;
                    long j15 = j13 + j14;
                    groupcalldonor.stars = j15;
                    i((int) j15, (int) j14, obj.f48577c);
                }
                t();
                if (z11) {
                    u uVar = this.f48671g0;
                    AndroidUtilities.cancelRunOnUIThread(uVar);
                    AndroidUtilities.runOnUIThread(uVar, 100L);
                }
                t0 t0Var = this.P;
                if (t0Var != null) {
                    t0Var.U = arrayList;
                    t0Var.V = arrayList2;
                    return;
                }
                return;
            }
        }
    }

    public final void m() {
        int i10;
        t tVar = this.E;
        if (tVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tVar);
            this.E = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        ArrayList arrayList = this.f48674s;
        int size = arrayList.size();
        long j3 = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            l0 l0Var = (l0) obj;
            ArrayList arrayList2 = l0Var.f48634f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                k0 k0Var = (k0) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (k0Var.f48579g > 0) {
                    i12 = Math.min(i12, k0Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, o.b(l0Var.f48631a, (int) k0Var.f48579g, 0) + k0Var.d);
                } else {
                    i10 = i15;
                }
                arrayList = arrayList3;
                currentTime = i10;
            }
            int i16 = currentTime;
            j3 = Math.min(j3, Math.max(0, i13 - i16) * 1000);
            arrayList = arrayList;
            currentTime = i16;
        }
        if (j3 >= Long.MAX_VALUE) {
            return;
        }
        t tVar2 = new t(this, 1);
        this.E = tVar2;
        AndroidUtilities.runOnUIThread(tVar2, j3);
    }

    public final int n(final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j10) {
        int i10;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i11 = this.N;
        final int newMessageId = UserConfig.getInstance(i11).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.O;
        sendgroupcallmessage.message = tL_textWithEntities;
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j10;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i11).getInputPeer(j3);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                m0 m0Var = m0.this;
                int i13 = newMessageId;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateMessageID.class);
                    int size = findUpdatesAndRemove.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = findUpdatesAndRemove.get(i14);
                        i14++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i15 = tL_updateMessageID.f17453id;
                            ArrayList arrayList = m0Var.f48673r;
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size2) {
                                    Object obj2 = arrayList.get(i16);
                                    i16++;
                                    k0 k0Var = (k0) obj2;
                                    if (k0Var.f48575a == i13) {
                                        k0Var.f48575a = i15;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    MessagesController.getInstance(m0Var.N).processUpdates(updates, false);
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new uc(m0Var, i13, tL_error, j10, j3, tL_textWithEntities));
                }
            }
        });
        if (this.T != null && i12 > 0) {
            int i13 = 0;
            while (true) {
                if (i13 < this.T.size()) {
                    if (((TL_phone.groupCallDonor) this.T.get(i13)).my) {
                        groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    groupcalldonor = null;
                    break;
                }
            }
            if (groupcalldonor != null) {
                groupcalldonor.stars += j10;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = MessagesController.getInstance(i11).getPeer(j3);
                groupcalldonor2.stars = j10;
                this.T.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j3 != this.M && !f()) {
            i10 = newMessageId;
            z10 = false;
        } else {
            i10 = newMessageId;
            z10 = true;
        }
        l(currentTime, i10, z10, j3, tL_textWithEntities, j10, false);
        int i14 = i10;
        q(false, true);
        return i14;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j3) {
        return n(getDefaultPeerId(), tL_textWithEntities, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.O != null) {
            u uVar = this.V;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.O != null) {
            AndroidUtilities.cancelRunOnUIThread(this.V);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < s()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < s()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        int[] iArr;
        pc pcVar = this.W;
        u uVar = this.f48667d0;
        if (pcVar == null || !pcVar.f26083l) {
            b bVar = new b();
            jc jcVar = new jc(getContext(), bVar);
            this.f48662a0 = jcVar;
            jcVar.c(R.raw.stars_topup, new String[0]);
            this.f48662a0.f24342b.setText(getStarsToastTitle());
            nc ncVar = new nc(getContext(), bVar, true, false);
            this.f48664b0 = ncVar;
            ncVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.f48664b0.f25483a = new t((o1) this, 0);
            ic icVar = new ic(getContext(), bVar);
            this.f48666c0 = icVar;
            icVar.f23985b = 5000L;
            icVar.setColor(bVar.F0(org.telegram.ui.ActionBar.j6.Gi));
            this.f48664b0.addView(this.f48666c0, w7.a6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.f48664b0.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.f48662a0.setButton(this.f48664b0);
            pc f7 = pc.f(this.f48663b, this.f48662a0, -1);
            this.W = f7;
            f7.f26089r = false;
            f7.k(true);
            this.W.v = uVar;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.f48662a0.f24342b.setText(getStarsToastTitle());
        this.f48662a0.f24343c.setText(getStarsToastSubtitle());
        this.f48666c0.f23985b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(uVar);
        AndroidUtilities.runOnUIThread(uVar, 5000L);
        long j3 = this.R;
        f1 f1Var = ((o1) this).f48735i0.Z1;
        e1 e1Var = f1Var.f48398a;
        e1Var.c(f1Var);
        if (e1Var.f48367s) {
            e1Var.f48367s = false;
            e1Var.a(1.0f, null);
        }
        ArrayList arrayList = e1Var.e;
        while (arrayList.size() > 4) {
            ((hj0) arrayList.remove(0)).C(true);
        }
        int[] iArr2 = e1Var.f48364f;
        hj0 hj0Var = new hj0(iArr2[Utilities.fastRandom.nextInt(iArr2.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        hj0Var.f23672v0 = e1Var;
        hj0Var.J(true);
        hj0Var.K(0);
        hj0Var.start();
        arrayList.add(hj0Var);
        e1Var.invalidate();
        org.telegram.ui.Components.n6 n6Var = e1Var.f48363c;
        n6Var.b();
        n6Var.q(hc.b.l(j3, ',', new StringBuilder("+")), true, true);
        c1 c1Var = e1Var.d;
        AndroidUtilities.cancelRunOnUIThread(c1Var);
        AndroidUtilities.runOnUIThread(c1Var, 1500L);
        f1Var.getLocationInWindow(f1Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - f1Var.f48407y;
        if (j10 < 100) {
            f1Var.E += 0.5f;
        } else {
            f1Var.E = Utilities.clamp(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * f1Var.E;
            LaunchActivity.b0((f1Var.getWidth() / 2.0f) + iArr[0], (f1Var.getHeight() / 2.0f) + iArr[1], Utilities.clamp(f1Var.E, 0.9f, 0.3f));
            f1Var.E = 0.0f;
            f1Var.f48407y = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j3, TLRPC.InputGroupCall inputGroupCall) {
        long j10;
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.O;
        long j11 = 0;
        if (inputGroupCall2 == null) {
            j10 = 0;
        } else {
            j10 = inputGroupCall2.f17212id;
        }
        if (inputGroupCall != null) {
            j11 = inputGroupCall.f17212id;
        }
        if (j10 != j11) {
            this.f48673r.clear();
            z10 = true;
            this.e.N(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.O;
        int i10 = this.N;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.M = j3;
        this.O = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z10) {
            this.f48667d0.run();
            u uVar = this.V;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(uVar);
                return z10;
            }
            uVar.run();
        }
        return z10;
    }

    public final float s() {
        zp0 zp0Var = this.f48665c;
        return Math.max(Math.max(0.0f, this.K - zp0Var.getTop()), getListViewContentTop()) + zp0Var.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.G = z10;
    }

    public void setLivePlayer(t0 t0Var) {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (this.P == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.P = t0Var;
        if (z10 && t0Var != null && (arrayList = t0Var.U) != null && (arrayList2 = t0Var.V) != null && arrayList != (arrayList3 = this.f48673r) && arrayList2 != (arrayList4 = this.f48674s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(t0Var.U);
            arrayList4.addAll(t0Var.V);
            this.e.N(true);
            ConnectionsManager.getInstance(this.N).getCurrentTime();
            Collections.sort(arrayList4, new sg.p(this, 21));
            this.f48672n.N(true);
            u(false);
        }
    }

    public final void t() {
        j0 j0Var;
        l0 l0Var;
        f0 f0Var;
        k0 k0Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new sg.p(22));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) obj;
            int i14 = (int) groupcalldonor.stars;
            if (i14 != i11) {
                i12++;
                i11 = i14;
            }
            if (i12 > 3) {
                break;
            }
            hashMap.put(Long.valueOf(DialogObject.getPeerDialogId(groupcalldonor.peer_id)), Integer.valueOf(i12));
        }
        int i15 = 0;
        while (true) {
            zp0 zp0Var = this.f48665c;
            if (i15 >= zp0Var.getChildCount()) {
                break;
            }
            View childAt = zp0Var.getChildAt(i15);
            if ((childAt instanceof f0) && (k0Var = (f0Var = (f0) childAt).K) != null) {
                int e = e(k0Var.f48577c);
                k0 k0Var2 = f0Var.K;
                if (e != k0Var2.h) {
                    k0Var2.h = e;
                    f0Var.set(k0Var2);
                }
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList3 = this.f48673r;
            if (i16 >= arrayList3.size()) {
                break;
            }
            k0 k0Var3 = (k0) arrayList3.get(i16);
            int e7 = e(k0Var3.f48577c);
            if (e7 != k0Var3.h) {
                k0Var3.h = e7;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            ic1 ic1Var = this.f48669f;
            if (i17 >= ic1Var.getChildCount()) {
                break;
            }
            View childAt2 = ic1Var.getChildAt(i17);
            if ((childAt2 instanceof j0) && (l0Var = (j0Var = (j0) childAt2).f48529f) != null) {
                int e10 = e(l0Var.f48632b);
                l0 l0Var2 = j0Var.f48529f;
                if (e10 != l0Var2.e) {
                    l0Var2.e = e10;
                    j0Var.set(l0Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.f48674s;
            if (i10 < arrayList4.size()) {
                l0 l0Var3 = (l0) arrayList4.get(i10);
                int e11 = e(l0Var3.f48632b);
                if (e11 != l0Var3.e) {
                    l0Var3.e = e11;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void u(boolean z10) {
        float dp;
        float dp2;
        float dp3;
        float dp4;
        ArrayList arrayList = this.f48674s;
        if (z10 && this.J == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.J = !isEmpty;
        float f7 = 1.0f;
        zp0 zp0Var = this.f48665c;
        ic1 ic1Var = this.f48669f;
        if (z10) {
            ViewPropertyAnimator animate = zp0Var.animate();
            if (this.J) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(dp3);
            wr wrVar = wr.h;
            translationY.setInterpolator(wrVar).setUpdateListener(new qg.o(this, 16)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = ic1Var.animate();
            if (this.J) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(dp4);
            if (!this.J) {
                f7 = 0.0f;
            }
            translationY2.alpha(f7).setInterpolator(wrVar).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(35.0f);
        }
        zp0Var.setTranslationY(dp);
        if (this.J) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(35.0f);
        }
        ic1Var.setTranslationY(dp2);
        if (!this.J) {
            f7 = 0.0f;
        }
        ic1Var.setAlpha(f7);
        invalidate();
    }
}
