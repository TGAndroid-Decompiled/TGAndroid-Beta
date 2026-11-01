package zf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.db;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.i5;
import org.telegram.messenger.kj;
import org.telegram.messenger.m5;
import org.telegram.messenger.nd;
import org.telegram.messenger.o5;
import org.telegram.messenger.od;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.u6;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Cells.x4;
import org.telegram.ui.Cells.y4;
import org.telegram.ui.Cells.z4;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.pb0;
import org.telegram.ui.rb0;
import w7.b6;
public class h0 extends c {
    public final int K;
    public final Context L;
    public int M;
    public u6 N;
    public Location O;
    public Location P;
    public String Q;
    public String R;
    public Location S;
    public final int T;
    public final long U;
    public int V;
    public kj W;
    public TLRPC.TL_channelLocation X;
    public ArrayList Y;
    public boolean Z;
    public final boolean f55529a0;
    public final p6 f55530b0;
    public boolean f55531c0;
    public TLRPC.TL_messageMediaVenue f55532d0;
    public TLRPC.TL_messageMediaVenue f55533e0;
    public boolean f55534f0;
    public final boolean f55535g0;
    public pb0 f55536h0;
    public boolean f55537i0;
    public boolean f55538j0;
    public boolean f55539k0;
    public FrameLayout f55540l0;

    public h0(Context context, int i10, long j10, boolean z10, p6 p6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.K = e20.f15506s0;
        this.V = -1;
        this.Y = new ArrayList();
        this.f55531c0 = true;
        this.f55538j0 = false;
        this.f55539k0 = false;
        this.f55535g0 = z12;
        this.L = context;
        this.T = i10;
        this.U = j10;
        this.f55529a0 = z10;
        this.f55530b0 = p6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 == 6) {
            if (od.f(this.K).h(this.U) == null && this.O == null) {
                return false;
            }
        } else if (i10 != 1 && i10 != 3 && i10 != 8 && i10 != 12 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final void I() {
        int i10 = this.T;
        if (i10 == 8) {
            Location location = this.P;
            if (location != null || (location = this.O) != null) {
                this.Z = true;
                R();
                od.d(location, this.e ? 1 : 0, this);
                return;
            }
            return;
        }
        int i11 = 0;
        if (i10 == 4) {
            Location location2 = this.P;
            if (location2 != null || (location2 = this.O) != null) {
                Location location3 = this.S;
                if (location3 == null || location3.distanceTo(location2) > 100.0f) {
                    this.R = null;
                }
                this.Z = true;
                R();
                od.d(location2, 0, this);
                return;
            }
            return;
        }
        Location location4 = this.P;
        if (location4 != null) {
            Location location5 = this.S;
            if (location5 == null || location5.distanceTo(location4) > 20.0f) {
                this.R = null;
            }
            this.Z = true;
            R();
            if (this.d) {
                i11 = 2;
            }
            od.d(location4, i11, this);
        }
    }

    public final Object J(int i10) {
        int i11 = this.T;
        int i12 = 4;
        if (i11 == 4) {
            if (this.R == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.R;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.P;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.P.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.O;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.O.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        kj kjVar = this.W;
        ArrayList arrayList = this.f55473s;
        if (kjVar != null) {
            if (i10 == 1) {
                return kjVar;
            }
            if (i10 > 4 && i10 < arrayList.size() + 4) {
                return this.Y.get(i10 - 5);
            }
        } else {
            int i13 = 2;
            if (i11 == 2) {
                nd h = od.f(this.K).h(this.U);
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i13 = 3;
                }
                if (i10 < i13) {
                    return null;
                }
                return this.Y.get(i10 - i13);
            } else if (i11 == 1) {
                if (i10 > 4 && i10 < arrayList.size() + 5) {
                    return arrayList.get(i10 - 5);
                }
            } else if (i11 == 7) {
                if (this.f55533e0 == null) {
                    i12 = 3;
                }
                ArrayList arrayList2 = this.f55472r;
                if (i10 > i12) {
                    int i14 = i12 + 1;
                    if (i10 < arrayList2.size() + i14) {
                        return arrayList2.get(i10 - i14);
                    }
                }
                int size = arrayList2.size() + i12;
                if (i10 > size) {
                    int i15 = size + 1;
                    if (i10 < arrayList.size() + i15) {
                        return arrayList.get(i10 - i15);
                    }
                }
            } else if (i10 > 3 && i10 < arrayList.size() + 4) {
                return arrayList.get(i10 - 4);
            }
        }
        return null;
    }

    public final void L(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        boolean z10;
        boolean z11 = false;
        this.Z = false;
        this.S = location;
        int i10 = this.T;
        if (i10 == 8) {
            this.R = str2;
        } else {
            this.R = str;
        }
        if (i10 == 7 && this.f55539k0) {
            this.f55532d0 = null;
            this.f55533e0 = null;
        }
        if (this.f55533e0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 7) {
            this.f55532d0 = tL_messageMediaVenue;
            this.f55533e0 = tL_messageMediaVenue2;
            if (tL_messageMediaVenue2 == null) {
                z11 = true;
            }
            if (z10 == z11) {
                g(1);
                if (this.f55533e0 == null) {
                    s(2);
                    return;
                } else {
                    i(2);
                    return;
                }
            }
            k(1, 2);
            return;
        }
        R();
    }

    public final void M(Location location) {
        this.P = location;
        I();
        R();
    }

    public final void N(Location location) {
        boolean z10;
        int i10;
        if (this.O == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O = location;
        if (this.P == null) {
            I();
        }
        if (z10 && (i10 = this.V) > 0) {
            g(i10);
        }
        if (this.W != null) {
            h(1, new Object());
            if (!this.Y.isEmpty()) {
                n(2, this.Y.size(), new Object());
            }
        } else if (this.T != 2) {
            R();
        } else if (!this.Y.isEmpty()) {
            n(2, this.Y.size(), new Object());
        }
    }

    public void O(ArrayList arrayList) {
        this.Y = new ArrayList(arrayList);
        long e = e20.i(this.K).e();
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            if (((rb0) this.Y.get(i10)).f41029a == e || ((rb0) this.Y.get(i10)).f41030b.out) {
                this.Y.remove(i10);
                break;
            }
        }
        f();
    }

    public final void P(boolean z10, boolean z11) {
        if (this.f55538j0 == z10 && this.f55539k0 == z11) {
            return;
        }
        this.f55538j0 = z10;
        this.f55539k0 = z11;
        if (z11) {
            this.f55532d0 = null;
            this.f55533e0 = null;
        }
        f();
    }

    public final void Q(int i10) {
        this.M = i10;
        FrameLayout frameLayout = this.f55540l0;
        if (frameLayout != null) {
            s4.o0 o0Var = (s4.o0) frameLayout.getLayoutParams();
            if (o0Var == null) {
                o0Var = new s4.o0(-1, this.M);
            } else {
                ((ViewGroup.MarginLayoutParams) o0Var).height = this.M;
            }
            this.f55540l0.setLayoutParams(o0Var);
            this.f55540l0.forceLayout();
        }
    }

    public final void R() {
        String L0;
        u6 u6Var = this.N;
        if (u6Var != null) {
            int i10 = this.T;
            if (i10 == 8) {
                if (!TextUtils.isEmpty(this.Q)) {
                    L0 = this.Q;
                } else if (!TextUtils.isEmpty(this.R)) {
                    L0 = this.R;
                } else if (this.Z) {
                    L0 = dd.L0(2131748789, null);
                } else {
                    L0 = dd.L0(2131743902, null);
                }
                this.N.b(dd.L0(2131745528, null), L0);
                this.N.setHasLocation(true);
                return;
            }
            String str = "";
            if (i10 != 4 && this.P == null) {
                if (this.O != null) {
                    u6Var.b(dd.L0(2131745628, null), dd.a0(null, null, 2131754693, dd.G((int) this.O.getAccuracy(), "Meters", new Object[0])));
                    this.N.setHasLocation(true);
                    return;
                }
                String L02 = dd.L0(2131745628, null);
                if (!this.f55538j0) {
                    str = dd.L0(2131748789, null);
                }
                u6Var.b(L02, str);
                this.N.setHasLocation(!this.f55538j0);
                return;
            }
            if (!TextUtils.isEmpty(this.Q)) {
                str = this.Q;
            } else if (!TextUtils.isEmpty(this.R)) {
                str = this.R;
            } else {
                Location location = this.P;
                if ((location == null && this.O == null) || this.Z) {
                    str = dd.L0(2131748789, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.P.getLongitude()));
                } else {
                    Location location2 = this.O;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.O.getLongitude()));
                    } else if (!this.f55538j0) {
                        str = dd.L0(2131748789, null);
                    }
                }
            }
            if (this.f55534f0) {
                this.N.b(dd.L0(2131753937, null), str);
            } else if (i10 == 4) {
                this.N.b(dd.L0(2131752211, null), str);
            } else {
                this.N.b(dd.L0(2131745607, null), str);
            }
            this.N.setHasLocation(true);
        }
    }

    @Override
    public final int b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.T;
        int i14 = 6;
        if (i13 != 6 && i13 != 5 && i13 != 4 && !this.e) {
            int i15 = 0;
            if (this.W != null) {
                if (this.Y.isEmpty()) {
                    if (!this.f55535g0) {
                        i15 = 1;
                    }
                } else {
                    i15 = this.Y.size() + 3;
                }
                i12 = 2 + i15;
            } else if (i13 == 2) {
                nd h = od.f(this.K).h(this.U);
                int size = this.Y.size() + 2;
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i15 = 1;
                }
                i12 = size + i15;
            } else {
                boolean z10 = this.h;
                boolean z11 = this.f55529a0;
                if (!z10 && this.f55470f) {
                    ArrayList arrayList = this.f55473s;
                    if (!arrayList.isEmpty()) {
                        if (i13 != 1) {
                            i14 = 5;
                        }
                        i12 = arrayList.size() + this.f55472r.size() + (z11 ? 1 : 0) + i14;
                    }
                }
                if (i13 == 0) {
                    i14 = 5;
                } else if (i13 == 7) {
                    if (this.f55533e0 != null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    i14 = i10 + 5;
                }
                boolean z12 = this.f55538j0;
                if (!z12 && (this.h || !this.f55470f)) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                int i16 = i11 + (z11 ? 1 : 0);
                if (!z12) {
                    i12 = 0;
                }
                i12 = (i16 - i12) + i14;
            }
        }
        if (this.f55536h0 != null && this.f55537i0) {
            return i12 + 1;
        }
        return i12;
    }

    @Override
    public final int d(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: zf.h0.d(int):int");
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        long j10;
        int i12;
        int i13 = c1Var.f47912f;
        View view = c1Var.f47909a;
        int i14 = this.T;
        int i15 = 2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        boolean z11 = false;
        boolean z12 = true;
        switch (i13) {
            case 0:
                s4.o0 o0Var = (s4.o0) view.getLayoutParams();
                if (o0Var == null) {
                    o0Var = new s4.o0(-1, this.M);
                } else {
                    ((ViewGroup.MarginLayoutParams) o0Var).height = this.M;
                }
                view.setLayoutParams(o0Var);
                return;
            case 1:
                this.N = (u6) view;
                R();
                return;
            case 2:
                p4 p4Var = (p4) view;
                if (this.W != null) {
                    p4Var.setText(dd.L0(2131748847, null));
                    return;
                } else {
                    p4Var.setText(dd.L0(2131748314, null));
                    return;
                }
            case 3:
                x4 x4Var = (x4) view;
                if (i14 == 0) {
                    i11 = i10 - 4;
                } else {
                    if (i14 == 7 || i14 == 8) {
                        int i16 = i10 - 4;
                        if (this.f55533e0 == null) {
                            i11 = i16;
                        }
                    }
                    i11 = i10 - 5;
                }
                if (this.f55470f && (i14 != 7 || !this.h)) {
                    ArrayList arrayList = this.f55472r;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        x4Var.b(tL_messageMediaVenue, i15, true, false);
                        return;
                    }
                    int size = i11 - arrayList.size();
                    if (size >= 0) {
                        ArrayList arrayList2 = this.f55473s;
                        if (size < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                        }
                    }
                }
                i15 = i11;
                x4Var.b(tL_messageMediaVenue, i15, true, false);
                return;
            case 4:
                ((z4) view).setLoading(this.h);
                return;
            case 5:
            case 9:
            case 10:
            default:
                return;
            case 6:
                u6 u6Var = (u6) view;
                if (this.O != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6Var.setHasLocation(z10);
                int i17 = i10 + 1;
                if (i17 < b() && d(i17) == 7) {
                    z11 = true;
                }
                u6Var.f23142y = z11;
                u6Var.invalidate();
                return;
            case 7:
                u6 u6Var2 = (u6) view;
                if (this.O != null) {
                    z11 = true;
                }
                u6Var2.setHasLocation(z11);
                return;
            case 8:
                v7 v7Var = (v7) view;
                if (i14 == 6) {
                    v7Var.b(this.W, this.O, this.f55538j0);
                    return;
                }
                TLRPC.TL_channelLocation tL_channelLocation = this.X;
                long j11 = this.U;
                if (tL_channelLocation != null) {
                    TextView textView = v7Var.f23324f;
                    Location location = v7Var.f23330y;
                    g9 g9Var = v7Var.f23323c;
                    v7Var.E = e20.f15506s0;
                    String str = tL_channelLocation.address;
                    v7Var.f23325n = null;
                    String str2 = "";
                    if (o5.E(j11)) {
                        TLRPC.User Z1 = wp.r1(v7Var.E).Z1(Long.valueOf(j11));
                        if (Z1 != null) {
                            v7Var.f23325n = new r8(0, Z1);
                            str2 = i20.p(Z1);
                            g9Var.e(Z1, v7Var.f23325n);
                        }
                    } else {
                        TLRPC.Chat L0 = wp.r1(v7Var.E).L0(Long.valueOf(-j11));
                        if (L0 != null) {
                            r8 r8Var = new r8(L0);
                            v7Var.f23325n = r8Var;
                            str2 = L0.title;
                            g9Var.e(L0, r8Var);
                        }
                    }
                    v7Var.d.l(str2, false);
                    location.setLatitude(tL_channelLocation.geo_point.lat);
                    location.setLongitude(tL_channelLocation.geo_point._long);
                    v7Var.h = true;
                    textView.setSingleLine(true);
                    textView.setText(str);
                    return;
                }
                kj kjVar = this.W;
                if (kjVar != null && i10 == 1) {
                    v7Var.b(kjVar, this.O, this.f55538j0);
                    return;
                }
                if (kjVar != null) {
                    i15 = 5;
                }
                int i18 = i10 - i15;
                nd h = od.f(this.K).h(j11);
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i18--;
                }
                if (i18 >= 0 && i18 < this.Y.size()) {
                    rb0 rb0Var = (rb0) this.Y.get(i18);
                    Location location2 = this.O;
                    TextView textView2 = v7Var.f23324f;
                    g9 g9Var2 = v7Var.f23323c;
                    u5 u5Var = v7Var.d;
                    Location location3 = v7Var.f23330y;
                    v7Var.f23329x = rb0Var;
                    if (o5.E(rb0Var.f41029a)) {
                        TLRPC.User Z12 = wp.r1(v7Var.E).Z1(Long.valueOf(rb0Var.f41029a));
                        if (Z12 != null) {
                            v7Var.f23325n.r(Z12);
                            u5Var.l(i5.m(0, Z12.first_name, Z12.last_name), false);
                            g9Var2.e(Z12, v7Var.f23325n);
                        }
                    } else {
                        TLRPC.Chat L02 = wp.r1(v7Var.E).L0(Long.valueOf(-rb0Var.f41029a));
                        if (L02 != null) {
                            v7Var.f23325n.q(L02);
                            u5Var.l(L02.title, false);
                            g9Var2.e(L02, v7Var.f23325n);
                        }
                    }
                    db a2 = rb0Var.e.a();
                    location3.setLatitude(a2.f15333a);
                    location3.setLongitude(a2.f15334b);
                    TLRPC.Message message = rb0Var.f41030b;
                    int i19 = message.edit_date;
                    if (i19 != 0) {
                        j10 = i19;
                    } else {
                        j10 = message.date;
                    }
                    String D = dd.D(j10);
                    if (location2 != null) {
                        textView2.setText(D + " - " + dd.y(location3.distanceTo(location2), 0, null));
                        return;
                    }
                    textView2.setText(D);
                    return;
                }
                return;
            case 11:
                if (this.f55538j0) {
                    i12 = t6.f21020i5;
                } else {
                    i12 = t6.f21002h5;
                }
                a7.i(i12, view, this.f55530b0);
                return;
            case 12:
                x4 x4Var2 = (x4) view;
                if (this.f55539k0) {
                    if (i10 != 1 || this.f55533e0 == null) {
                        z12 = false;
                    }
                    x4Var2.b(null, 2, z12, false);
                    return;
                } else if (i10 == 1) {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = this.f55532d0;
                    if (this.f55533e0 != null) {
                        z11 = true;
                    }
                    x4Var2.b(tL_messageMediaVenue2, 2, z11, this.f55531c0);
                    return;
                } else {
                    x4Var2.b(this.f55533e0, 2, false, this.f55531c0);
                    return;
                }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        long j10 = this.U;
        p6 p6Var = this.f55530b0;
        Context context = this.L;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.f55540l0 = frameLayout;
                frameLayout.setTag(-33024);
                this.f55540l0.setLayoutParams(new s4.o0(-1, this.M));
                view = frameLayout;
                break;
            case 1:
                view = new u6(context, p6Var, false, false);
                break;
            case 2:
                view = new p4(context, p6Var);
                break;
            case 3:
                view = new x4(context, p6Var);
                break;
            case 4:
                ?? frameLayout2 = new FrameLayout(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, p6Var);
                frameLayout2.f23643a = radialProgressView;
                frameLayout2.addView(radialProgressView, b6.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                frameLayout2.f23645c = imageView;
                imageView.setImageResource(2131231639);
                a7.t(imageView, t6.W5, p6Var, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView, b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                frameLayout2.f23644b = textView;
                a7.V(textView, t6.X5, p6Var);
                textView.setGravity(17);
                textView.setTypeface(org.telegram.messenger.i0.o());
                sc.e.u(textView, 1, 17.0f, null, 2131748196);
                frameLayout2.addView(textView, b6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = frameLayout2;
                break;
            case 5:
                FrameLayout a5Var = new a5(context, 0);
                LinearLayout linearLayout = new LinearLayout(context);
                a5Var.addView(linearLayout, b6.e(-2, -2, 17));
                TextView g10 = m5.g(context, 1, 16.0f);
                int i12 = t6.A6;
                a7.V(g10, i12, p6Var);
                g10.setText("Powered by");
                linearLayout.addView(g10, b6.o(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(2131231209);
                a7.t(imageView2, i12, p6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setPadding(0, org.telegram.messenger.i0.L(2.0f), 0, 0);
                linearLayout.addView(imageView2, b6.o(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                a7.V(textView2, i12, p6Var);
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, b6.o(-2, -2));
                view = a5Var;
                break;
            case 6:
                u6 u6Var = new u6(context, p6Var, true, false);
                u6Var.setDialogId(j10);
                view = u6Var;
                break;
            case 7:
                u6 u6Var2 = new u6(context, p6Var, true, true);
                u6Var2.setDialogId(j10);
                view = u6Var2;
                break;
            case 8:
                int i13 = this.T;
                if (i13 != 4 && i13 != 5 && i13 != 3) {
                    i11 = 54;
                } else {
                    i11 = 16;
                }
                view = new v7(i11, context, p6Var, true);
                break;
            case 9:
                y4 y4Var = new y4(context, p6Var);
                y4Var.setOnButtonClick(new f(this, 2));
                view = y4Var;
                break;
            case 10:
                View c7Var = new c7(context, (org.telegram.ui.Cells.f1) null);
                new eq(new ColorDrawable(t6.w0(t6.f20873a7, p6Var)), t6.Y0(context, 2131231231, t6.f20893b7)).f25909x = true;
                view = c7Var;
                break;
            case 11:
            default:
                view = new View(context);
                break;
            case 12:
                x4 x4Var = new x4(context, p6Var);
                x4Var.setAllowTextAnimation(true);
                view = x4Var;
                break;
            case 13:
                view = this.f55536h0;
                break;
        }
        return new s4.c1(view);
    }

    public void K() {
    }
}
