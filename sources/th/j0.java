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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.messenger.nn;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dx0;
import org.telegram.ui.mb0;
import org.telegram.ui.u71;
import rh.y8;
public abstract class j0 extends FrameLayout implements vs {
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
    public final View f49093a;
    public qb f49094a0;
    public final FrameLayout f49095b;
    public ub f49096b0;
    public final mb0 f49097c;
    public pb f49098c0;
    public final s4.a0 d;
    public final u f49099d0;
    public final ph.o3 e;
    public ValueAnimator f49100e0;
    public final u71 f49101f;
    public boolean f49102f0;
    public final u f49103g0;
    public final s4.a0 h;
    public final q51 f49104n;
    public final ArrayList f49105r;
    public final ArrayList f49106s;
    public final HashMap f49107w;
    public long f49108x;
    public int f49109y;

    public j0(Context context, o7 o7Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f49105r = new ArrayList();
        this.f49106s = new ArrayList();
        this.f49107w = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new li.k(23);
        int i10 = e20.f15506s0;
        this.N = i10;
        this.T = new ArrayList();
        final p1 p1Var = (p1) this;
        this.V = new u(p1Var, 0);
        this.f49099d0 = new u(p1Var, 1);
        this.f49102f0 = false;
        this.f49103g0 = new u(p1Var, 2);
        this.f49093a = view;
        this.f49095b = frameLayout;
        view.setAlpha(0.5f);
        mb0 mb0Var = new mb0(p1Var, context, 4);
        this.f49097c = mb0Var;
        mb0Var.setWillNotDraw(false);
        s4.a0 a0Var = new s4.a0(1, true);
        this.d = a0Var;
        mb0Var.setLayoutManager(a0Var);
        ph.o3 o3Var = new ph.o3(p1Var, mb0Var, context, i10, new k20() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j10;
                int i11 = r2;
                int i12 = 0;
                p1 p1Var2 = p1Var;
                ArrayList arrayList = (ArrayList) obj;
                q51 q51Var = (q51) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = p1Var2.f49105r;
                        s0 s0Var = p1Var2.P;
                        if (s0Var == null) {
                            j10 = 0;
                        } else {
                            j10 = s0Var.j();
                        }
                        p1Var2.H = j10;
                        while (i12 < arrayList2.size()) {
                            h0 h0Var = (h0) arrayList2.get(i12);
                            if (h0Var.f49021b || !h0Var.e || h0Var.f49024g >= j10) {
                                int i13 = b0.f48808b;
                                b51 K = b51.K(b0.class);
                                K.G = h0Var;
                                arrayList.add(K);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = p1Var2.f49106s;
                        while (i12 < arrayList3.size()) {
                            int i14 = f0.f48961b;
                            b51 K2 = b51.K(f0.class);
                            K2.G = (i0) arrayList3.get(i12);
                            arrayList.add(K2);
                            i12++;
                        }
                        return;
                }
            }
        }, new b(), 2);
        this.e = o3Var;
        mb0Var.setAdapter(o3Var);
        o3Var.f29638r = false;
        mb0Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(7.5f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(7.5f));
        mb0Var.setClipToPadding(false);
        addView(mb0Var, w7.b6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        mb0Var.setOnItemClickListener(new org.telegram.ui.Cells.o(p1Var, viewGroup, o7Var, 1));
        x xVar = new x(p1Var);
        xVar.f47938m = false;
        xVar.C = false;
        gr grVar = gr.h;
        xVar.o(grVar);
        xVar.n(280L);
        xVar.D = 14L;
        mb0Var.setItemAnimator(xVar);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232058);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new rh.s(p1Var, 11));
        u71 u71Var = new u71(12, context, null);
        this.f49101f = u71Var;
        u71Var.setWillNotDraw(false);
        s4.a0 a0Var2 = new s4.a0(0, false);
        this.h = a0Var2;
        u71Var.setLayoutManager(a0Var2);
        q51 q51Var = new q51(u71Var, context, i10, 0, false, new k20() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j10;
                int i11 = r2;
                int i12 = 0;
                p1 p1Var2 = p1Var;
                ArrayList arrayList = (ArrayList) obj;
                q51 q51Var2 = (q51) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = p1Var2.f49105r;
                        s0 s0Var = p1Var2.P;
                        if (s0Var == null) {
                            j10 = 0;
                        } else {
                            j10 = s0Var.j();
                        }
                        p1Var2.H = j10;
                        while (i12 < arrayList2.size()) {
                            h0 h0Var = (h0) arrayList2.get(i12);
                            if (h0Var.f49021b || !h0Var.e || h0Var.f49024g >= j10) {
                                int i13 = b0.f48808b;
                                b51 K = b51.K(b0.class);
                                K.G = h0Var;
                                arrayList.add(K);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = p1Var2.f49106s;
                        while (i12 < arrayList3.size()) {
                            int i14 = f0.f48961b;
                            b51 K2 = b51.K(f0.class);
                            K2.G = (i0) arrayList3.get(i12);
                            arrayList.add(K2);
                            i12++;
                        }
                        return;
                }
            }
        }, null);
        this.f49104n = q51Var;
        u71Var.setAdapter(q51Var);
        q51Var.f29638r = false;
        u71Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        u71Var.setClipToPadding(false);
        addView(u71Var, w7.b6.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        u71Var.setOnItemClickListener(new rh.d0(p1Var, 12));
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        jVar.o(grVar);
        jVar.n(350L);
        u71Var.setItemAnimator(jVar);
        u(false);
    }

    public static Integer a(j0 j0Var, Long l4) {
        j0Var.f49099d0.run();
        j0Var.R = l4.longValue();
        wb I = new cc(j0Var.f49095b, new b()).I(2131624224, j0Var.getStarsToastTitle(), j0Var.getStarsToastSubtitle());
        boolean z10 = false;
        I.f32209r = false;
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
            TLRPC.GroupCall groupCall = this.P.f49440w;
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
            return e20.i(this.N).e();
        }
        return org.telegram.messenger.o5.o(defaultSendAs);
    }

    private int getListViewTop() {
        mb0 mb0Var = this.f49097c;
        int height = mb0Var.getHeight();
        for (int i10 = 0; i10 < mb0Var.getChildCount(); i10++) {
            height = Math.min(mb0Var.getChildAt(i10).getTop(), height);
        }
        return mb0Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return org.telegram.messenger.i0.W2(dd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.R)));
    }

    private String getStarsToastTitle() {
        return dd.L0(2131745043, null);
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
        e1 e1Var = ((p1) this).f49368i0.I1;
        d1 d1Var = e1Var.f48902a;
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
            arrayList = this.f49105r;
            if (i11 < arrayList.size()) {
                if (((h0) arrayList.get(i11)).f49020a == i10) {
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
            if (h0Var.f49020a < 0 && h0Var.e) {
                long j10 = h0Var.f49024g;
                if (j10 > 0) {
                    this.Q -= j10;
                    j();
                }
            }
            int i12 = 0;
            while (true) {
                arrayList2 = this.f49106s;
                if (i12 >= arrayList2.size()) {
                    break;
                } else if (((i0) arrayList2.get(i12)).f49068f.contains(h0Var)) {
                    ((i0) arrayList2.get(i12)).f49068f.remove(h0Var);
                    if (((i0) arrayList2.get(i12)).f49068f.isEmpty()) {
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
                Collections.sort(arrayList2, new dx0(this, 19));
                this.f49104n.O(true);
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
            mb0 mb0Var = this.f49097c;
            if (i11 < mb0Var.getChildCount()) {
                View childAt = mb0Var.getChildAt(i11);
                if ((childAt instanceof c0) && (h0Var = (c0Var = (c0) childAt).K) != null && h0Var.f49020a == i10) {
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
        if (i10 == at.H2) {
            int i12 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TL_update.TL_updateGroupCallMessage) {
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.O;
                if (inputGroupCall != null && inputGroupCall.f19811id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i13 = groupCallMessage.date;
                    int i14 = groupCallMessage.f19805id;
                    boolean z10 = groupCallMessage.from_admin;
                    long o10 = org.telegram.messenger.o5.o(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i13, i14, z10, o10, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.O;
                if (inputGroupCall2 != null && inputGroupCall2.f19811id == longValue) {
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
        mb0 mb0Var = this.f49097c;
        if (view == mb0Var) {
            if (mb0Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.K - mb0Var.getTop()) + mb0Var.getY();
            canvas.saveLayerAlpha(mb0Var.getX(), mb0Var.getY(), mb0Var.getX() + mb0Var.getWidth(), mb0Var.getY() + mb0Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((mb0Var.getY() + mb0Var.getHeight()) - max, getListViewTop()) * (1.0f - mb0Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, max, getWidth(), org.telegram.messenger.i0.L(12.0f) + max);
            li.k kVar = this.I;
            kVar.o(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (mb0Var.getY() + mb0Var.getHeight()) - org.telegram.messenger.i0.L(12.0f), getWidth(), mb0Var.getHeight() + mb0Var.getBottom());
            kVar.o(canvas, rectF, 3, 1.0f);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final int e(long j10) {
        return ((Integer) Map.EL.getOrDefault(this.f49107w, Long.valueOf(j10), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.M) {
            long j10 = this.M;
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            int i11 = this.N;
            if (i10 >= 0) {
                if (j10 == e20.i(i11).e()) {
                    return true;
                }
                return false;
            }
            s0 s0Var = this.P;
            if (s0Var != null && (inputGroupCall = this.O) != null && inputGroupCall.f19811id == s0Var.g() && (groupCall = this.P.f49440w) != null && groupCall.creator) {
                return true;
            }
            return org.telegram.messenger.w3.w(14, wp.r1(i11).L0(Long.valueOf(-this.M)));
        }
        return false;
    }

    public final boolean g() {
        return this.f49102f0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        mb0 mb0Var = this.f49097c;
        int height = mb0Var.getHeight();
        for (int i10 = 0; i10 < mb0Var.getChildCount(); i10++) {
            height = Math.min(mb0Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f49105r.size();
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
            ArrayList arrayList = this.f49105r;
            if (i10 < arrayList.size()) {
                h0 h0Var = (h0) arrayList.get(i10);
                int i12 = h0Var.f49020a;
                if (i12 >= 0 && i12 > this.F && (h0Var.f49021b || !h0Var.e || h0Var.f49024g >= j10)) {
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
        this.f49099d0.run();
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
        long e = e20.i(this.N).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e = org.telegram.messenger.o5.o(defaultSendAs);
        }
        so0 so0Var = new so0(2);
        int i11 = this.N;
        y8 y8Var = new y8(getContext(), i11, this.M, null, null, arrayList, !z10, true, e, so0Var);
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
            ArrayList arrayList = this.f49105r;
            if (i13 < arrayList.size()) {
                if (((h0) arrayList.get(i13)).f49020a != i11) {
                    i13++;
                } else {
                    return;
                }
            } else {
                int i14 = this.N;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                ?? obj = new Object();
                obj.d = i10;
                obj.f49021b = z10;
                obj.f49022c = j10;
                obj.f49023f = tL_textWithEntities;
                obj.f49024g = j11;
                obj.f49020a = i11;
                obj.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = o.b(i14, (int) obj.f49024g, 0);
                long j13 = 0;
                int i15 = (obj.f49024g > 0L ? 1 : (obj.f49024g == 0L ? 0 : -1));
                ArrayList arrayList2 = this.f49106s;
                boolean z13 = true;
                if (i15 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList2.size()) {
                            j12 = j13;
                            if (((i0) arrayList2.get(i16)).f49066b == j10) {
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
                        obj2.f49068f = arrayList3;
                        obj2.f49065a = i14;
                        obj2.f49066b = j10;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z12 = true;
                        i0Var2 = obj2;
                    } else {
                        i0Var.f49068f.add(obj);
                        this.f49101f.g1();
                        z12 = false;
                        i0Var2 = i0Var;
                    }
                    i0Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new dx0(this, 19));
                    if (!z11) {
                        this.f49104n.O(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                } else {
                    j12 = 0;
                }
                if (!z11 && obj.e) {
                    long j14 = obj.f49024g;
                    if (j14 > j12) {
                        this.Q += j14;
                        j();
                    }
                }
                if (obj.f49020a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f49020a < ((h0) arrayList.get(size)).f49020a) {
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
                if (i12 <= 0 && !z11 && (!this.f49097c.canScrollVertically(1) || obj.f49020a < 0)) {
                    this.d.h1(0, org.telegram.messenger.i0.L(100.0f));
                    int i17 = obj.f49020a;
                    if (i17 > 0) {
                        this.F = i17;
                    }
                }
                invalidate();
                p1 p1Var = (p1) this;
                a aVar = p1Var.f49368i0.G1;
                if (aVar != null) {
                    aVar.setCount(p1Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && obj.f49024g > j12) {
                    int i18 = 0;
                    while (true) {
                        if (i18 < this.T.size()) {
                            if (org.telegram.messenger.o5.o(((TL_phone.groupCallDonor) this.T.get(i18)).peer_id) == obj.f49022c) {
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
                        if (e20.i(i14).e() != obj.f49022c) {
                            z13 = false;
                        }
                        groupcalldonor.my = z13;
                        groupcalldonor.peer_id = wp.r1(i14).y1(obj.f49022c);
                        groupcalldonor.stars = j12;
                        for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                            if (((i0) arrayList2.get(i19)).f49066b == obj.f49022c) {
                                ((i0) arrayList2.get(i19)).b();
                                groupcalldonor.stars += ((i0) arrayList2.get(i19)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j15 = groupcalldonor.stars;
                    long j16 = obj.f49024g;
                    long j17 = j15 + j16;
                    groupcalldonor.stars = j17;
                    i((int) j17, (int) j16, obj.f49022c);
                }
                t();
                if (z11) {
                    u uVar = this.f49103g0;
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
        ArrayList arrayList = this.f49106s;
        int size = arrayList.size();
        int i12 = 0;
        long j10 = Long.MAX_VALUE;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            i0 i0Var = (i0) obj;
            ArrayList arrayList2 = i0Var.f49068f;
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
                if (h0Var.f49024g > 0) {
                    i13 = Math.min(i13, h0Var.d);
                    i11 = i16;
                    i14 = Math.max(i14, o.b(i0Var.f49065a, (int) h0Var.f49024g, 0) + h0Var.d);
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
        final int j12 = e20.i(i11).j();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.O;
        sendgroupcallmessage.message = tL_textWithEntities;
        int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i12 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j11;
        }
        sendgroupcallmessage.random_id = Utilities.f14520b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = wp.r1(i11).i1(j10);
        ConnectionsManager.getInstance(e20.f15506s0).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                j0 j0Var = j0.this;
                int i13 = j12;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = wp.z0(updates, TL_update.TL_updateMessageID.class);
                    int size = z02.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = z02.get(i14);
                        i14++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i15 = tL_updateMessageID.f20051id;
                            ArrayList arrayList = j0Var.f49105r;
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size2) {
                                    Object obj2 = arrayList.get(i16);
                                    i16++;
                                    h0 h0Var = (h0) obj2;
                                    if (h0Var.f49020a == i13) {
                                        h0Var.f49020a = i15;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    wp.r1(j0Var.N).L3(updates, false);
                } else if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new nn(j0Var, i13, tL_error, j11, j10, tL_textWithEntities));
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
                groupcalldonor2.peer_id = wp.r1(i11).y1(j10);
                groupcalldonor2.stars = j11;
                this.T.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(e20.f15506s0).getCurrentTime();
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
        u uVar = this.f49099d0;
        if (wbVar == null || !wbVar.f32203l) {
            b bVar = new b();
            qb qbVar = new qb(getContext(), bVar);
            this.f49094a0 = qbVar;
            qbVar.c(2131624224, new String[0]);
            this.f49094a0.f29704b.setText(getStarsToastTitle());
            ub ubVar = new ub(getContext(), bVar, true, false);
            this.f49096b0 = ubVar;
            ubVar.e(dd.L0(2131745041, null));
            this.f49096b0.f30924b = new t((p1) this, 0);
            pb pbVar = new pb(getContext(), bVar);
            this.f49098c0 = pbVar;
            pbVar.f29396b = 5000L;
            pbVar.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, bVar));
            this.f49096b0.addView(this.f49098c0, w7.b6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.f49096b0.e.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(8.0f));
            this.f49094a0.setButton(this.f49096b0);
            wb f7 = wb.f(this.f49095b, this.f49094a0, -1);
            this.W = f7;
            f7.f32209r = false;
            f7.k(true);
            this.W.v = uVar;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.f49094a0.f29704b.setText(getStarsToastTitle());
        this.f49094a0.f29705c.setText(getStarsToastSubtitle());
        this.f49098c0.f29396b = 5000L;
        org.telegram.messenger.i0.r(uVar);
        org.telegram.messenger.i0.h3(uVar, 5000L);
        long j10 = this.R;
        e1 e1Var = ((p1) this).f49368i0.I1;
        d1 d1Var = e1Var.f48902a;
        d1Var.c(e1Var);
        if (d1Var.f48885s) {
            d1Var.f48885s = false;
            d1Var.a(1.0f, null);
        }
        ArrayList arrayList = d1Var.e;
        while (arrayList.size() > 4) {
            ((ci0) arrayList.remove(0)).C(true);
        }
        int[] iArr2 = d1Var.f48882f;
        ci0 ci0Var = new ci0(iArr2[Utilities.f14521c.nextInt(iArr2.length)], org.telegram.messenger.i0.L(70.0f), org.telegram.messenger.i0.L(70.0f));
        ci0Var.R(d1Var);
        ci0Var.J(true);
        ci0Var.K(0);
        ci0Var.start();
        arrayList.add(ci0Var);
        d1Var.invalidate();
        org.telegram.ui.Components.e6 e6Var = d1Var.f48881c;
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
            j11 = inputGroupCall2.f19811id;
        }
        if (inputGroupCall != null) {
            j12 = inputGroupCall.f19811id;
        }
        if (j11 != j12) {
            this.f49105r.clear();
            z10 = true;
            this.e.O(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.O;
        int i10 = at.H2;
        int i11 = this.N;
        if (inputGroupCall3 != null) {
            at.f(i11).n(this, i10);
        }
        this.M = j10;
        this.O = inputGroupCall;
        if (inputGroupCall != null) {
            at.f(i11).c(this, i10);
        }
        if (z10) {
            this.f49099d0.run();
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
        mb0 mb0Var = this.f49097c;
        return Math.max(Math.max(0.0f, this.K - mb0Var.getTop()), getListViewContentTop()) + mb0Var.getY();
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
        if (z10 && s0Var != null && (arrayList = s0Var.U) != null && (arrayList2 = s0Var.V) != null && arrayList != (arrayList3 = this.f49105r) && arrayList2 != (arrayList4 = this.f49106s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(s0Var.U);
            arrayList4.addAll(s0Var.V);
            this.e.O(true);
            ConnectionsManager.getInstance(this.N).getCurrentTime();
            Collections.sort(arrayList4, new dx0(this, 19));
            this.f49104n.O(true);
            u(false);
        }
    }

    public final void t() {
        g0 g0Var;
        i0 i0Var;
        c0 c0Var;
        h0 h0Var;
        HashMap hashMap = this.f49107w;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new dx0(20));
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
            mb0 mb0Var = this.f49097c;
            if (i15 >= mb0Var.getChildCount()) {
                break;
            }
            View childAt = mb0Var.getChildAt(i15);
            if ((childAt instanceof c0) && (h0Var = (c0Var = (c0) childAt).K) != null) {
                int e = e(h0Var.f49022c);
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
            ArrayList arrayList3 = this.f49105r;
            if (i16 >= arrayList3.size()) {
                break;
            }
            h0 h0Var3 = (h0) arrayList3.get(i16);
            int e7 = e(h0Var3.f49022c);
            if (e7 != h0Var3.h) {
                h0Var3.h = e7;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            u71 u71Var = this.f49101f;
            if (i17 >= u71Var.getChildCount()) {
                break;
            }
            View childAt2 = u71Var.getChildAt(i17);
            if ((childAt2 instanceof g0) && (i0Var = (g0Var = (g0) childAt2).f48999f) != null) {
                int e10 = e(i0Var.f49066b);
                i0 i0Var2 = g0Var.f48999f;
                if (e10 != i0Var2.e) {
                    i0Var2.e = e10;
                    g0Var.set(i0Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.f49106s;
            if (i10 < arrayList4.size()) {
                i0 i0Var3 = (i0) arrayList4.get(i10);
                int e11 = e(i0Var3.f49066b);
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
        ArrayList arrayList = this.f49106s;
        if (z10 && this.J == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.J = !isEmpty;
        float f7 = 1.0f;
        mb0 mb0Var = this.f49097c;
        u71 u71Var = this.f49101f;
        if (z10) {
            ViewPropertyAnimator animate = mb0Var.animate();
            if (this.J) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.i0.L(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L3);
            gr grVar = gr.h;
            translationY.setInterpolator(grVar).setUpdateListener(new qh.e0(this, 11)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = u71Var.animate();
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
        mb0Var.setTranslationY(L);
        if (this.J) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.i0.L(35.0f);
        }
        u71Var.setTranslationY(L2);
        if (!this.J) {
            f7 = 0.0f;
        }
        u71Var.setAlpha(f7);
        invalidate();
    }
}
