package th;

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
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.mn;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ex0;
import org.telegram.ui.nb0;
import org.telegram.ui.w71;
import rh.y8;
public abstract class j0 extends FrameLayout implements us {
    public boolean D;
    public t E;
    public int F;
    public boolean G;
    public long H;
    public final li.k I;
    public boolean J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public TLRPC.InputGroupCall O;
    public s0 P;
    public long Q;
    public long R;
    public boolean S;
    public ArrayList T;
    public boolean U;
    public final u V;
    public wb W;
    public final View f49079a;
    public qb f49080a0;
    public final FrameLayout f49081b;
    public ub f49082b0;
    public final nb0 f49083c;
    public pb f49084c0;
    public final s4.a0 d;
    public final u f49085d0;
    public final ph.o3 e;
    public ValueAnimator f49086e0;
    public final w71 f49087f;
    public boolean f49088f0;
    public final u f49089g0;
    public final s4.a0 h;
    public final p51 f49090n;
    public final ArrayList f49091r;
    public final ArrayList f49092s;
    public final HashMap f49093w;
    public long f49094x;
    public int f49095y;

    public j0(Context context, o7 o7Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f49091r = new ArrayList();
        this.f49092s = new ArrayList();
        this.f49093w = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new li.k(23);
        int i10 = d20.f15147s0;
        this.N = i10;
        this.T = new ArrayList();
        final p1 p1Var = (p1) this;
        this.V = new u(p1Var, 0);
        this.f49085d0 = new u(p1Var, 1);
        this.f49088f0 = false;
        this.f49089g0 = new u(p1Var, 2);
        this.f49079a = view;
        this.f49081b = frameLayout;
        view.setAlpha(0.5f);
        nb0 nb0Var = new nb0(p1Var, context, 4);
        this.f49083c = nb0Var;
        nb0Var.setWillNotDraw(false);
        s4.a0 a0Var = new s4.a0(1, true);
        this.d = a0Var;
        nb0Var.setLayoutManager(a0Var);
        ph.o3 o3Var = new ph.o3(p1Var, nb0Var, context, i10, new j20() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j10;
                int i11 = r2;
                int i12 = 0;
                p1 p1Var2 = p1Var;
                ArrayList arrayList = (ArrayList) obj;
                p51 p51Var = (p51) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = p1Var2.f49091r;
                        s0 s0Var = p1Var2.P;
                        if (s0Var == null) {
                            j10 = 0;
                        } else {
                            j10 = s0Var.j();
                        }
                        p1Var2.H = j10;
                        while (i12 < arrayList2.size()) {
                            h0 h0Var = (h0) arrayList2.get(i12);
                            if (h0Var.f49007b || !h0Var.e || h0Var.f49010g >= j10) {
                                int i13 = b0.f48794b;
                                a51 K = a51.K(b0.class);
                                K.G = h0Var;
                                arrayList.add(K);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = p1Var2.f49092s;
                        while (i12 < arrayList3.size()) {
                            int i14 = f0.f48947b;
                            a51 K2 = a51.K(f0.class);
                            K2.G = (i0) arrayList3.get(i12);
                            arrayList.add(K2);
                            i12++;
                        }
                        return;
                }
            }
        }, new b(), 2);
        this.e = o3Var;
        nb0Var.setAdapter(o3Var);
        o3Var.f29295r = false;
        nb0Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(7.5f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(7.5f));
        nb0Var.setClipToPadding(false);
        addView(nb0Var, w7.b6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        nb0Var.setOnItemClickListener(new org.telegram.ui.Cells.o(p1Var, viewGroup, o7Var, 1));
        x xVar = new x(p1Var);
        xVar.f47927m = false;
        xVar.C = false;
        gr grVar = gr.h;
        xVar.o(grVar);
        xVar.n(280L);
        xVar.D = 14L;
        nb0Var.setItemAnimator(xVar);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232058);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new rh.s(p1Var, 11));
        w71 w71Var = new w71(12, context, null);
        this.f49087f = w71Var;
        w71Var.setWillNotDraw(false);
        s4.a0 a0Var2 = new s4.a0(0, false);
        this.h = a0Var2;
        w71Var.setLayoutManager(a0Var2);
        p51 p51Var = new p51(w71Var, context, i10, 0, false, new j20() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j10;
                int i11 = r2;
                int i12 = 0;
                p1 p1Var2 = p1Var;
                ArrayList arrayList = (ArrayList) obj;
                p51 p51Var2 = (p51) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = p1Var2.f49091r;
                        s0 s0Var = p1Var2.P;
                        if (s0Var == null) {
                            j10 = 0;
                        } else {
                            j10 = s0Var.j();
                        }
                        p1Var2.H = j10;
                        while (i12 < arrayList2.size()) {
                            h0 h0Var = (h0) arrayList2.get(i12);
                            if (h0Var.f49007b || !h0Var.e || h0Var.f49010g >= j10) {
                                int i13 = b0.f48794b;
                                a51 K = a51.K(b0.class);
                                K.G = h0Var;
                                arrayList.add(K);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = p1Var2.f49092s;
                        while (i12 < arrayList3.size()) {
                            int i14 = f0.f48947b;
                            a51 K2 = a51.K(f0.class);
                            K2.G = (i0) arrayList3.get(i12);
                            arrayList.add(K2);
                            i12++;
                        }
                        return;
                }
            }
        }, null);
        this.f49090n = p51Var;
        w71Var.setAdapter(p51Var);
        p51Var.f29295r = false;
        w71Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        w71Var.setClipToPadding(false);
        addView(w71Var, w7.b6.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        w71Var.setOnItemClickListener(new rh.d0(p1Var, 12));
        s4.j jVar = new s4.j();
        jVar.f47927m = false;
        jVar.C = false;
        jVar.o(grVar);
        jVar.n(350L);
        w71Var.setItemAnimator(jVar);
        u(false);
    }

    public static Integer a(j0 j0Var, Long l4) {
        j0Var.f49085d0.run();
        j0Var.R = l4.longValue();
        wb I = new cc(j0Var.f49081b, new b()).I(2131624224, j0Var.getStarsToastTitle(), j0Var.getStarsToastSubtitle());
        boolean z10 = false;
        I.f32143r = false;
        I.k(true);
        long j10 = 0;
        j0Var.R = 0L;
        j0Var.S = true;
        int o10 = j0Var.o(new TLRPC.TL_textWithEntities(), l4.longValue());
        s0 s0Var = j0Var.P;
        if (s0Var != null) {
            j10 = s0Var.j();
        }
        if (j0Var.getDefaultPeerId() == j0Var.M && j0Var.f()) {
            z10 = true;
        }
        if (l4.longValue() < j10 && !z10) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(o10);
    }

    private long getDefaultPeerId() {
        boolean z10;
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        s0 s0Var = this.P;
        if (s0Var != null && s0Var.l()) {
            TLRPC.GroupCall groupCall = this.P.f49426w;
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
            return d20.i(this.N).e();
        }
        return org.telegram.messenger.o5.o(defaultSendAs);
    }

    private int getListViewTop() {
        nb0 nb0Var = this.f49083c;
        int height = nb0Var.getHeight();
        for (int i10 = 0; i10 < nb0Var.getChildCount(); i10++) {
            height = Math.min(nb0Var.getChildAt(i10).getTop(), height);
        }
        return nb0Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return org.telegram.messenger.i0.W2(cd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.R)));
    }

    private String getStarsToastTitle() {
        return cd.L0(2131745043, null);
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
        e1 e1Var = ((p1) this).f49354i0.I1;
        d1 d1Var = e1Var.f48888a;
        d1Var.c(e1Var);
        d1Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        h0 h0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f49091r;
            if (i11 < arrayList.size()) {
                if (((h0) arrayList.get(i11)).f49006a == i10) {
                    h0Var = (h0) arrayList.get(i11);
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                h0Var = null;
                break;
            }
        }
        if (h0Var != null) {
            if (h0Var.f49006a < 0 && h0Var.e) {
                long j10 = h0Var.f49010g;
                if (j10 > 0) {
                    this.Q -= j10;
                    j();
                }
            }
            int i12 = 0;
            while (true) {
                arrayList2 = this.f49092s;
                if (i12 >= arrayList2.size()) {
                    break;
                } else if (((i0) arrayList2.get(i12)).f49054f.contains(h0Var)) {
                    ((i0) arrayList2.get(i12)).f49054f.remove(h0Var);
                    if (((i0) arrayList2.get(i12)).f49054f.isEmpty()) {
                        arrayList2.remove(i12);
                        z10 = true;
                    } else {
                        ((i0) arrayList2.get(i12)).c();
                        m();
                    }
                } else {
                    i12++;
                }
            }
            arrayList.remove(i11);
            this.e.O(true);
            if (z10) {
                ConnectionsManager.getInstance(this.N).getCurrentTime();
                Collections.sort(arrayList2, new ex0(this, 19));
                this.f49090n.O(true);
                t();
                u(true);
            }
        }
    }

    public final c0 d(int i10) {
        c0 c0Var;
        h0 h0Var;
        int i11 = 0;
        while (true) {
            nb0 nb0Var = this.f49083c;
            if (i11 < nb0Var.getChildCount()) {
                View childAt = nb0Var.getChildAt(i11);
                if ((childAt instanceof c0) && (h0Var = (c0Var = (c0) childAt).K) != null && h0Var.f49006a == i10) {
                    return c0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.H2) {
            int i12 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TL_update.TL_updateGroupCallMessage) {
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.O;
                if (inputGroupCall != null && inputGroupCall.f19810id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i13 = groupCallMessage.date;
                    int i14 = groupCallMessage.f19804id;
                    boolean z10 = groupCallMessage.from_admin;
                    long o10 = org.telegram.messenger.o5.o(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i13, i14, z10, o10, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.O;
                if (inputGroupCall2 != null && inputGroupCall2.f19810id == longValue) {
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        nb0 nb0Var = this.f49083c;
        if (view == nb0Var) {
            if (nb0Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.K - nb0Var.getTop()) + nb0Var.getY();
            canvas.saveLayerAlpha(nb0Var.getX(), nb0Var.getY(), nb0Var.getX() + nb0Var.getWidth(), nb0Var.getY() + nb0Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((nb0Var.getY() + nb0Var.getHeight()) - max, getListViewTop()) * (1.0f - nb0Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, max, getWidth(), org.telegram.messenger.i0.L(12.0f) + max);
            li.k kVar = this.I;
            kVar.o(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (nb0Var.getY() + nb0Var.getHeight()) - org.telegram.messenger.i0.L(12.0f), getWidth(), nb0Var.getHeight() + nb0Var.getBottom());
            kVar.o(canvas, rectF, 3, 1.0f);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final int e(long j10) {
        return ((Integer) Map.EL.getOrDefault(this.f49093w, Long.valueOf(j10), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.M) {
            long j10 = this.M;
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            int i11 = this.N;
            if (i10 >= 0) {
                if (j10 == d20.i(i11).e()) {
                    return true;
                }
                return false;
            }
            s0 s0Var = this.P;
            if (s0Var != null && (inputGroupCall = this.O) != null && inputGroupCall.f19810id == s0Var.g() && (groupCall = this.P.f49426w) != null && groupCall.creator) {
                return true;
            }
            return org.telegram.messenger.w3.w(14, vp.r1(i11).L0(Long.valueOf(-this.M)));
        }
        return false;
    }

    public final boolean g() {
        return this.f49088f0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        nb0 nb0Var = this.f49083c;
        int height = nb0Var.getHeight();
        for (int i10 = 0; i10 < nb0Var.getChildCount(); i10++) {
            height = Math.min(nb0Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f49091r.size();
    }

    public long getStarsCount() {
        return this.Q + this.R;
    }

    public int getUnreadMessagesCount() {
        long j10;
        int i10 = 0;
        if (this.F < 0) {
            return 0;
        }
        s0 s0Var = this.P;
        if (s0Var == null) {
            j10 = 0;
        } else {
            j10 = s0Var.j();
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f49091r;
            if (i10 < arrayList.size()) {
                h0 h0Var = (h0) arrayList.get(i10);
                int i12 = h0Var.f49006a;
                if (i12 >= 0 && i12 > this.F && (h0Var.f49007b || !h0Var.e || h0Var.f49010g >= j10)) {
                    i11++;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public abstract void h(long j10);

    public abstract void i(int i10, int i11, long j10);

    public abstract void j();

    public final void k(boolean z10) {
        this.f49085d0.run();
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
        long e = d20.i(this.N).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e = org.telegram.messenger.o5.o(defaultSendAs);
        }
        ro0 ro0Var = new ro0(2);
        int i11 = this.N;
        y8 y8Var = new y8(getContext(), i11, this.M, null, null, arrayList, !z10, true, e, ro0Var);
        p1 p1Var = (p1) this;
        y8Var.G1 = p1Var;
        y8Var.I1 = new rh.d0(p1Var, 11);
        y8Var.show();
    }

    public final void l(int i10, int i11, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z11) {
        long j12;
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        i0 i0Var;
        boolean z12;
        i0 i0Var2;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f49091r;
            if (i13 < arrayList.size()) {
                if (((h0) arrayList.get(i13)).f49006a != i11) {
                    i13++;
                } else {
                    return;
                }
            } else {
                int i14 = this.N;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                ?? obj = new Object();
                obj.d = i10;
                obj.f49007b = z10;
                obj.f49008c = j10;
                obj.f49009f = tL_textWithEntities;
                obj.f49010g = j11;
                obj.f49006a = i11;
                obj.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = o.b(i14, (int) obj.f49010g, 0);
                long j13 = 0;
                int i15 = (obj.f49010g > 0L ? 1 : (obj.f49010g == 0L ? 0 : -1));
                ArrayList arrayList2 = this.f49092s;
                boolean z13 = true;
                if (i15 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList2.size()) {
                            j12 = j13;
                            if (((i0) arrayList2.get(i16)).f49052b == j10) {
                                i0Var = (i0) arrayList2.get(i16);
                                break;
                            } else {
                                i16++;
                                j13 = j12;
                            }
                        } else {
                            j12 = j13;
                            i0Var = null;
                            break;
                        }
                    }
                    if (i0Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f49054f = arrayList3;
                        obj2.f49051a = i14;
                        obj2.f49052b = j10;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z12 = true;
                        i0Var2 = obj2;
                    } else {
                        i0Var.f49054f.add(obj);
                        this.f49087f.g1();
                        z12 = false;
                        i0Var2 = i0Var;
                    }
                    i0Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new ex0(this, 19));
                    if (!z11) {
                        this.f49090n.O(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                } else {
                    j12 = 0;
                }
                if (!z11 && obj.e) {
                    long j14 = obj.f49010g;
                    if (j14 > j12) {
                        this.Q += j14;
                        j();
                    }
                }
                if (obj.f49006a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f49006a < ((h0) arrayList.get(size)).f49006a) {
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
                    this.e.O(true);
                }
                if (i12 <= 0 && !z11 && (!this.f49083c.canScrollVertically(1) || obj.f49006a < 0)) {
                    this.d.h1(0, org.telegram.messenger.i0.L(100.0f));
                    int i17 = obj.f49006a;
                    if (i17 > 0) {
                        this.F = i17;
                    }
                }
                invalidate();
                p1 p1Var = (p1) this;
                a aVar = p1Var.f49354i0.G1;
                if (aVar != null) {
                    aVar.setCount(p1Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && obj.f49010g > j12) {
                    int i18 = 0;
                    while (true) {
                        if (i18 < this.T.size()) {
                            if (org.telegram.messenger.o5.o(((TL_phone.groupCallDonor) this.T.get(i18)).peer_id) == obj.f49008c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i18);
                                break;
                            }
                            i18++;
                        } else {
                            groupcalldonor = null;
                            break;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        if (d20.i(i14).e() != obj.f49008c) {
                            z13 = false;
                        }
                        groupcalldonor.my = z13;
                        groupcalldonor.peer_id = vp.r1(i14).y1(obj.f49008c);
                        groupcalldonor.stars = j12;
                        for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                            if (((i0) arrayList2.get(i19)).f49052b == obj.f49008c) {
                                ((i0) arrayList2.get(i19)).b();
                                groupcalldonor.stars += ((i0) arrayList2.get(i19)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j15 = groupcalldonor.stars;
                    long j16 = obj.f49010g;
                    long j17 = j15 + j16;
                    groupcalldonor.stars = j17;
                    i((int) j17, (int) j16, obj.f49008c);
                }
                t();
                if (z11) {
                    u uVar = this.f49089g0;
                    org.telegram.messenger.i0.r(uVar);
                    org.telegram.messenger.i0.h3(uVar, 100L);
                }
                s0 s0Var = this.P;
                if (s0Var != null) {
                    s0Var.U = arrayList;
                    s0Var.V = arrayList2;
                    return;
                }
                return;
            }
        }
    }

    public final void m() {
        int i10;
        int i11;
        t tVar = this.E;
        if (tVar != null) {
            org.telegram.messenger.i0.r(tVar);
            this.E = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        ArrayList arrayList = this.f49092s;
        int size = arrayList.size();
        int i12 = 0;
        long j10 = Long.MAX_VALUE;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            i0 i0Var = (i0) obj;
            ArrayList arrayList2 = i0Var.f49054f;
            int size2 = arrayList2.size();
            int i13 = currentTime;
            int i14 = 0;
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList2.get(i15);
                i15++;
                h0 h0Var = (h0) obj2;
                int i16 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (h0Var.f49010g > 0) {
                    i13 = Math.min(i13, h0Var.d);
                    i11 = i16;
                    i14 = Math.max(i14, o.b(i0Var.f49051a, (int) h0Var.f49010g, 0) + h0Var.d);
                } else {
                    i11 = i16;
                }
                arrayList = arrayList3;
                currentTime = i11;
            }
            j10 = Math.min(j10, Math.max(0, i14 - i10) * 1000);
            arrayList = arrayList;
            currentTime = currentTime;
        }
        if (j10 >= Long.MAX_VALUE) {
            return;
        }
        t tVar2 = new t(this, 1);
        this.E = tVar2;
        org.telegram.messenger.i0.h3(tVar2, j10);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        int i10;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i11 = this.N;
        final int j12 = d20.i(i11).j();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.O;
        sendgroupcallmessage.message = tL_textWithEntities;
        int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i12 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j11;
        }
        sendgroupcallmessage.random_id = Utilities.f14519b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = vp.r1(i11).i1(j10);
        ConnectionsManager.getInstance(d20.f15147s0).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                j0 j0Var = j0.this;
                int i13 = j12;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = vp.z0(updates, TL_update.TL_updateMessageID.class);
                    int size = z02.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = z02.get(i14);
                        i14++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i15 = tL_updateMessageID.f20050id;
                            ArrayList arrayList = j0Var.f49091r;
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size2) {
                                    Object obj2 = arrayList.get(i16);
                                    i16++;
                                    h0 h0Var = (h0) obj2;
                                    if (h0Var.f49006a == i13) {
                                        h0Var.f49006a = i15;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    vp.r1(j0Var.N).L3(updates, false);
                } else if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new mn(j0Var, i13, tL_error, j11, j10, tL_textWithEntities));
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
                groupcalldonor.stars += j11;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = vp.r1(i11).y1(j10);
                groupcalldonor2.stars = j11;
                this.T.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(d20.f15147s0).getCurrentTime();
        if (j10 != this.M && !f()) {
            i10 = j12;
            z10 = false;
        } else {
            i10 = j12;
            z10 = true;
        }
        l(currentTime, i10, z10, j10, tL_textWithEntities, j11, false);
        int i14 = i10;
        q(false, true);
        return i14;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        return n(getDefaultPeerId(), tL_textWithEntities, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.O != null) {
            u uVar = this.V;
            org.telegram.messenger.i0.r(uVar);
            org.telegram.messenger.i0.g3(uVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.O != null) {
            org.telegram.messenger.i0.r(this.V);
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
        wb wbVar = this.W;
        u uVar = this.f49085d0;
        if (wbVar == null || !wbVar.f32137l) {
            b bVar = new b();
            qb qbVar = new qb(getContext(), bVar);
            this.f49080a0 = qbVar;
            qbVar.c(2131624224, new String[0]);
            this.f49080a0.f29623b.setText(getStarsToastTitle());
            ub ubVar = new ub(getContext(), bVar, true, false);
            this.f49082b0 = ubVar;
            ubVar.e(cd.L0(2131745041, null));
            this.f49082b0.f30890b = new t((p1) this, 0);
            pb pbVar = new pb(getContext(), bVar);
            this.f49084c0 = pbVar;
            pbVar.f29331b = 5000L;
            pbVar.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, bVar));
            this.f49082b0.addView(this.f49084c0, w7.b6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.f49082b0.e.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(8.0f));
            this.f49080a0.setButton(this.f49082b0);
            wb f7 = wb.f(this.f49081b, this.f49080a0, -1);
            this.W = f7;
            f7.f32143r = false;
            f7.k(true);
            this.W.v = uVar;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.f49080a0.f29623b.setText(getStarsToastTitle());
        this.f49080a0.f29624c.setText(getStarsToastSubtitle());
        this.f49084c0.f29331b = 5000L;
        org.telegram.messenger.i0.r(uVar);
        org.telegram.messenger.i0.h3(uVar, 5000L);
        long j10 = this.R;
        e1 e1Var = ((p1) this).f49354i0.I1;
        d1 d1Var = e1Var.f48888a;
        d1Var.c(e1Var);
        if (d1Var.f48871s) {
            d1Var.f48871s = false;
            d1Var.a(1.0f, null);
        }
        ArrayList arrayList = d1Var.e;
        while (arrayList.size() > 4) {
            ((bi0) arrayList.remove(0)).C(true);
        }
        int[] iArr2 = d1Var.f48868f;
        bi0 bi0Var = new bi0(iArr2[Utilities.f14520c.nextInt(iArr2.length)], org.telegram.messenger.i0.L(70.0f), org.telegram.messenger.i0.L(70.0f));
        bi0Var.R(d1Var);
        bi0Var.J(true);
        bi0Var.K(0);
        bi0Var.start();
        arrayList.add(bi0Var);
        d1Var.invalidate();
        org.telegram.ui.Components.e6 e6Var = d1Var.f48867c;
        e6Var.a();
        e6Var.t(i0.a.k(j10, ',', new StringBuilder("+")), true, true);
        b1 b1Var = d1Var.d;
        org.telegram.messenger.i0.r(b1Var);
        org.telegram.messenger.i0.h3(b1Var, 1500L);
        e1Var.getLocationInWindow(e1Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - e1Var.D;
        if (j11 < 100) {
            e1Var.E += 0.5f;
        } else {
            e1Var.E = Utilities.i(1.0f - (((float) (j11 - 100)) / 200.0f), 1.0f, 0.0f) * e1Var.E;
            LaunchActivity.b0((e1Var.getWidth() / 2.0f) + iArr[0], (e1Var.getHeight() / 2.0f) + iArr[1], Utilities.i(e1Var.E, 0.9f, 0.3f));
            e1Var.E = 0.0f;
            e1Var.D = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j10, TLRPC.InputGroupCall inputGroupCall) {
        long j11;
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.O;
        long j12 = 0;
        if (inputGroupCall2 == null) {
            j11 = 0;
        } else {
            j11 = inputGroupCall2.f19810id;
        }
        if (inputGroupCall != null) {
            j12 = inputGroupCall.f19810id;
        }
        if (j11 != j12) {
            this.f49091r.clear();
            z10 = true;
            this.e.O(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.O;
        int i10 = zs.H2;
        int i11 = this.N;
        if (inputGroupCall3 != null) {
            zs.f(i11).n(this, i10);
        }
        this.M = j10;
        this.O = inputGroupCall;
        if (inputGroupCall != null) {
            zs.f(i11).c(this, i10);
        }
        if (z10) {
            this.f49085d0.run();
            u uVar = this.V;
            if (inputGroupCall == null) {
                org.telegram.messenger.i0.r(uVar);
                return z10;
            }
            uVar.run();
        }
        return z10;
    }

    public final float s() {
        nb0 nb0Var = this.f49083c;
        return Math.max(Math.max(0.0f, this.K - nb0Var.getTop()), getListViewContentTop()) + nb0Var.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.G = z10;
    }

    public void setLivePlayer(s0 s0Var) {
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
        this.P = s0Var;
        if (z10 && s0Var != null && (arrayList = s0Var.U) != null && (arrayList2 = s0Var.V) != null && arrayList != (arrayList3 = this.f49091r) && arrayList2 != (arrayList4 = this.f49092s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(s0Var.U);
            arrayList4.addAll(s0Var.V);
            this.e.O(true);
            ConnectionsManager.getInstance(this.N).getCurrentTime();
            Collections.sort(arrayList4, new ex0(this, 19));
            this.f49090n.O(true);
            u(false);
        }
    }

    public final void t() {
        g0 g0Var;
        i0 i0Var;
        c0 c0Var;
        h0 h0Var;
        HashMap hashMap = this.f49093w;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new ex0(20));
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
            hashMap.put(Long.valueOf(org.telegram.messenger.o5.o(groupcalldonor.peer_id)), Integer.valueOf(i12));
        }
        int i15 = 0;
        while (true) {
            nb0 nb0Var = this.f49083c;
            if (i15 >= nb0Var.getChildCount()) {
                break;
            }
            View childAt = nb0Var.getChildAt(i15);
            if ((childAt instanceof c0) && (h0Var = (c0Var = (c0) childAt).K) != null) {
                int e = e(h0Var.f49008c);
                h0 h0Var2 = c0Var.K;
                if (e != h0Var2.h) {
                    h0Var2.h = e;
                    c0Var.set(h0Var2);
                }
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList3 = this.f49091r;
            if (i16 >= arrayList3.size()) {
                break;
            }
            h0 h0Var3 = (h0) arrayList3.get(i16);
            int e7 = e(h0Var3.f49008c);
            if (e7 != h0Var3.h) {
                h0Var3.h = e7;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            w71 w71Var = this.f49087f;
            if (i17 >= w71Var.getChildCount()) {
                break;
            }
            View childAt2 = w71Var.getChildAt(i17);
            if ((childAt2 instanceof g0) && (i0Var = (g0Var = (g0) childAt2).f48985f) != null) {
                int e10 = e(i0Var.f49052b);
                i0 i0Var2 = g0Var.f48985f;
                if (e10 != i0Var2.e) {
                    i0Var2.e = e10;
                    g0Var.set(i0Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.f49092s;
            if (i10 < arrayList4.size()) {
                i0 i0Var3 = (i0) arrayList4.get(i10);
                int e11 = e(i0Var3.f49052b);
                if (e11 != i0Var3.e) {
                    i0Var3.e = e11;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void u(boolean z10) {
        float L;
        float L2;
        float L3;
        float L4;
        ArrayList arrayList = this.f49092s;
        if (z10 && this.J == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.J = !isEmpty;
        float f7 = 1.0f;
        nb0 nb0Var = this.f49083c;
        w71 w71Var = this.f49087f;
        if (z10) {
            ViewPropertyAnimator animate = nb0Var.animate();
            if (this.J) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.i0.L(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L3);
            gr grVar = gr.h;
            translationY.setInterpolator(grVar).setUpdateListener(new qh.e0(this, 11)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = w71Var.animate();
            if (this.J) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.i0.L(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(L4);
            if (!this.J) {
                f7 = 0.0f;
            }
            translationY2.alpha(f7).setInterpolator(grVar).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.i0.L(35.0f);
        }
        nb0Var.setTranslationY(L);
        if (this.J) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.i0.L(35.0f);
        }
        w71Var.setTranslationY(L2);
        if (!this.J) {
            f7 = 0.0f;
        }
        w71Var.setAlpha(f7);
        invalidate();
    }
}
