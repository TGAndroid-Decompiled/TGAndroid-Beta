package uf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.z8;
import org.telegram.ui.rc0;
import org.telegram.ui.vc0;
public class h0 extends c implements LocationController.LocationFetchCallback {
    public final int H;
    public final Context I;
    public int J;
    public s6 K;
    public Location L;
    public Location M;
    public String N;
    public String O;
    public Location P;
    public final int Q;
    public final long R;
    public int S;
    public MessageObject T;
    public TLRPC.TL_channelLocation U;
    public ArrayList V;
    public boolean W;
    public final boolean X;
    public final g6 Y;
    public boolean Z;
    public TLRPC.TL_messageMediaVenue f48581a0;
    public TLRPC.TL_messageMediaVenue f48582b0;
    public boolean f48583c0;
    public final boolean f48584d0;
    public rc0 f48585e0;
    public boolean f48586f0;
    public boolean f48587g0;
    public boolean f48588h0;
    public FrameLayout f48589i0;

    public h0(Context context, int i10, long j10, boolean z4, g6 g6Var, boolean z10, boolean z11, boolean z12) {
        super(z10, z12);
        this.H = UserConfig.selectedAccount;
        this.S = -1;
        this.V = new ArrayList();
        this.Z = true;
        this.f48587g0 = false;
        this.f48588h0 = false;
        this.f48584d0 = z11;
        this.I = context;
        this.Q = i10;
        this.R = j10;
        this.X = z4;
        this.Y = g6Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 == 6) {
            if (LocationController.getInstance(this.H).getSharingLocationInfo(this.R) == null && this.L == null) {
                return false;
            }
        } else if (i10 != 1 && i10 != 3 && i10 != 8 && i10 != 12 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final void I() {
        int i10;
        int i11 = this.Q;
        if (i11 == 8) {
            Location location = this.M;
            if (location != null || (location = this.L) != null) {
                this.W = true;
                Q();
                LocationController.fetchLocationAddress(location, this.f48508e ? 1 : 0, this);
            }
        } else if (i11 == 4) {
            Location location2 = this.M;
            if (location2 != null || (location2 = this.L) != null) {
                Location location3 = this.P;
                if (location3 == null || location3.distanceTo(location2) > 100.0f) {
                    this.O = null;
                }
                this.W = true;
                Q();
                LocationController.fetchLocationAddress(location2, this);
            }
        } else {
            Location location4 = this.M;
            if (location4 != null) {
                Location location5 = this.P;
                if (location5 == null || location5.distanceTo(location4) > 20.0f) {
                    this.O = null;
                }
                this.W = true;
                Q();
                if (this.d) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                LocationController.fetchLocationAddress(location4, i10, this);
            }
        }
    }

    public final Object J(int i10) {
        int i11 = this.Q;
        int i12 = 4;
        if (i11 == 4) {
            if (this.O == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.O;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.M;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.M.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.L;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.L.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        MessageObject messageObject = this.T;
        ArrayList arrayList = this.f48512s;
        if (messageObject != null) {
            if (i10 == 1) {
                return messageObject;
            }
            if (i10 > 4 && i10 < arrayList.size() + 4) {
                return this.V.get(i10 - 5);
            }
        } else {
            int i13 = 2;
            if (i11 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.H).getSharingLocationInfo(this.R);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i13 = 3;
                }
                if (i10 < i13) {
                    return null;
                }
                return this.V.get(i10 - i13);
            } else if (i11 == 1) {
                if (i10 > 4 && i10 < arrayList.size() + 5) {
                    return arrayList.get(i10 - 5);
                }
            } else if (i11 == 7) {
                if (this.f48582b0 == null) {
                    i12 = 3;
                }
                ArrayList arrayList2 = this.f48511r;
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

    public final void L(Location location) {
        this.M = location;
        I();
        Q();
    }

    public final void M(Location location) {
        boolean z4;
        int i10;
        if (this.L == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.L = location;
        if (this.M == null) {
            I();
        }
        if (z4 && (i10 = this.S) > 0) {
            m(i10);
        }
        if (this.T != null) {
            n(1, new Object());
            if (!this.V.isEmpty()) {
                r(2, this.V.size(), new Object());
            }
        } else if (this.Q != 2) {
            Q();
        } else if (!this.V.isEmpty()) {
            r(2, this.V.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.V = new ArrayList(arrayList);
        long clientUserId = UserConfig.getInstance(this.H).getClientUserId();
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            if (((vc0) this.V.get(i10)).f42200a == clientUserId || ((vc0) this.V.get(i10)).f42201b.out) {
                this.V.remove(i10);
                break;
            }
        }
        l();
    }

    public final void O(boolean z4, boolean z10) {
        if (this.f48587g0 == z4 && this.f48588h0 == z10) {
            return;
        }
        this.f48587g0 = z4;
        this.f48588h0 = z10;
        if (z10) {
            this.f48581a0 = null;
            this.f48582b0 = null;
        }
        l();
    }

    public final void P(int i10) {
        this.J = i10;
        FrameLayout frameLayout = this.f48589i0;
        if (frameLayout != null) {
            f2.x0 x0Var = (f2.x0) frameLayout.getLayoutParams();
            if (x0Var == null) {
                x0Var = new f2.x0(-1, this.J);
            } else {
                ((ViewGroup.MarginLayoutParams) x0Var).height = this.J;
            }
            this.f48589i0.setLayoutParams(x0Var);
            this.f48589i0.forceLayout();
        }
    }

    public final void Q() {
        String string;
        s6 s6Var = this.K;
        if (s6Var != null) {
            int i10 = this.Q;
            if (i10 == 8) {
                if (!TextUtils.isEmpty(this.N)) {
                    string = this.N;
                } else if (!TextUtils.isEmpty(this.O)) {
                    string = this.O;
                } else if (this.W) {
                    string = LocaleController.getString(R.string.Loading);
                } else {
                    string = LocaleController.getString(R.string.UnknownLocation);
                }
                this.K.b(LocaleController.getString(R.string.SetThisLocation), string);
                this.K.setHasLocation(true);
                return;
            }
            String str = "";
            if (i10 != 4 && this.M == null) {
                if (this.L != null) {
                    s6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.L.getAccuracy(), new Object[0])));
                    this.K.setHasLocation(true);
                    return;
                }
                String string2 = LocaleController.getString(R.string.SendLocation);
                if (!this.f48587g0) {
                    str = LocaleController.getString(R.string.Loading);
                }
                s6Var.b(string2, str);
                this.K.setHasLocation(!this.f48587g0);
                return;
            }
            if (!TextUtils.isEmpty(this.N)) {
                str = this.N;
            } else if (!TextUtils.isEmpty(this.O)) {
                str = this.O;
            } else {
                Location location = this.M;
                if ((location == null && this.L == null) || this.W) {
                    str = LocaleController.getString(R.string.Loading);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.M.getLongitude()));
                } else {
                    Location location2 = this.L;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.L.getLongitude()));
                    } else if (!this.f48587g0) {
                        str = LocaleController.getString(R.string.Loading);
                    }
                }
            }
            if (this.f48583c0) {
                this.K.b(LocaleController.getString(R.string.AttachSelectedLocation), str);
            } else if (i10 == 4) {
                this.K.b(LocaleController.getString(R.string.ChatSetThisLocation), str);
            } else {
                this.K.b(LocaleController.getString(R.string.SendSelectedLocation), str);
            }
            this.K.setHasLocation(true);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.Q;
        int i14 = 6;
        if (i13 != 6 && i13 != 5 && i13 != 4 && !this.f48508e) {
            int i15 = 0;
            if (this.T != null) {
                if (this.V.isEmpty()) {
                    if (!this.f48584d0) {
                        i15 = 1;
                    }
                } else {
                    i15 = this.V.size() + 3;
                }
                i12 = 2 + i15;
            } else if (i13 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.H).getSharingLocationInfo(this.R);
                int size = this.V.size() + 2;
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i15 = 1;
                }
                i12 = size + i15;
            } else {
                boolean z4 = this.h;
                boolean z10 = this.X;
                if (!z4 && this.f48509f) {
                    ArrayList arrayList = this.f48512s;
                    if (!arrayList.isEmpty()) {
                        if (i13 != 1) {
                            i14 = 5;
                        }
                        i12 = arrayList.size() + this.f48511r.size() + (z10 ? 1 : 0) + i14;
                    }
                }
                if (i13 == 0) {
                    i14 = 5;
                } else if (i13 == 7) {
                    if (this.f48582b0 != null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    i14 = i10 + 5;
                }
                boolean z11 = this.f48587g0;
                if (!z11 && (this.h || !this.f48509f)) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                int i16 = i11 + (z10 ? 1 : 0);
                if (!z11) {
                    i12 = 0;
                }
                i12 = (i16 - i12) + i14;
            }
        }
        if (this.f48585e0 != null && this.f48586f0) {
            return i12 + 1;
        }
        return i12;
    }

    @Override
    public final int j(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: uf.h0.j(int):int");
    }

    @Override
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        boolean z4;
        boolean z10 = false;
        this.W = false;
        this.P = location;
        int i10 = this.Q;
        if (i10 == 8) {
            this.O = str2;
        } else {
            this.O = str;
        }
        if (i10 == 7 && this.f48588h0) {
            this.f48581a0 = null;
            this.f48582b0 = null;
        }
        if (this.f48582b0 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 == 7) {
            this.f48581a0 = tL_messageMediaVenue;
            this.f48582b0 = tL_messageMediaVenue2;
            if (tL_messageMediaVenue2 == null) {
                z10 = true;
            }
            if (z4 == z10) {
                m(1);
                if (this.f48582b0 == null) {
                    u(2);
                    return;
                } else {
                    o(2);
                    return;
                }
            }
            q(1, 2);
            return;
        }
        Q();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        boolean z4;
        long j10;
        int i12;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        int i14 = this.Q;
        int i15 = 2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        boolean z10 = false;
        boolean z11 = true;
        switch (i13) {
            case 0:
                f2.x0 x0Var = (f2.x0) view.getLayoutParams();
                if (x0Var == null) {
                    x0Var = new f2.x0(-1, this.J);
                } else {
                    ((ViewGroup.MarginLayoutParams) x0Var).height = this.J;
                }
                view.setLayoutParams(x0Var);
                return;
            case 1:
                this.K = (s6) view;
                Q();
                return;
            case 2:
                m4 m4Var = (m4) view;
                if (this.T != null) {
                    m4Var.setText(LocaleController.getString(R.string.LiveLocations));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                }
            case 3:
                u4 u4Var = (u4) view;
                if (i14 == 0) {
                    i11 = i10 - 4;
                } else {
                    if (i14 == 7 || i14 == 8) {
                        int i16 = i10 - 4;
                        if (this.f48582b0 == null) {
                            i11 = i16;
                        }
                    }
                    i11 = i10 - 5;
                }
                if (this.f48509f && (i14 != 7 || !this.h)) {
                    ArrayList arrayList = this.f48511r;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        u4Var.b(tL_messageMediaVenue, i15, true, false);
                        return;
                    }
                    int size = i11 - arrayList.size();
                    if (size >= 0) {
                        ArrayList arrayList2 = this.f48512s;
                        if (size < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                        }
                    }
                }
                i15 = i11;
                u4Var.b(tL_messageMediaVenue, i15, true, false);
                return;
            case 4:
                ((w4) view).setLoading(this.h);
                return;
            case 5:
            case 9:
            case 10:
            default:
                return;
            case 6:
                s6 s6Var = (s6) view;
                if (this.L != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                s6Var.setHasLocation(z4);
                int i17 = i10 + 1;
                if (i17 < h() && j(i17) == 7) {
                    z10 = true;
                }
                s6Var.f23738s = z10;
                s6Var.invalidate();
                return;
            case 7:
                s6 s6Var2 = (s6) view;
                if (this.L != null) {
                    z10 = true;
                }
                s6Var2.setHasLocation(z10);
                return;
            case 8:
                u7 u7Var = (u7) view;
                if (i14 == 6) {
                    u7Var.b(this.T, this.L, this.f48587g0);
                    return;
                }
                TLRPC.TL_channelLocation tL_channelLocation = this.U;
                long j11 = this.R;
                if (tL_channelLocation != null) {
                    TextView textView = u7Var.d;
                    Location location = u7Var.v;
                    p9 p9Var = u7Var.f24212a;
                    u7Var.f24221x = UserConfig.selectedAccount;
                    String str = tL_channelLocation.address;
                    u7Var.f24216f = null;
                    String str2 = "";
                    if (DialogObject.isUserDialog(j11)) {
                        TLRPC.User user = MessagesController.getInstance(u7Var.f24221x).getUser(Long.valueOf(j11));
                        if (user != null) {
                            u7Var.f24216f = new z8(0, user);
                            str2 = UserObject.getUserName(user);
                            p9Var.e(user, u7Var.f24216f);
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(u7Var.f24221x).getChat(Long.valueOf(-j11));
                        if (chat != null) {
                            z8 z8Var = new z8(chat);
                            u7Var.f24216f = z8Var;
                            str2 = chat.title;
                            p9Var.e(chat, z8Var);
                        }
                    }
                    u7Var.f24213b.l(str2, false);
                    location.setLatitude(tL_channelLocation.geo_point.lat);
                    location.setLongitude(tL_channelLocation.geo_point._long);
                    u7Var.f24215e = true;
                    textView.setSingleLine(true);
                    textView.setText(str);
                    return;
                }
                MessageObject messageObject = this.T;
                if (messageObject != null && i10 == 1) {
                    u7Var.b(messageObject, this.L, this.f48587g0);
                    return;
                }
                if (messageObject != null) {
                    i15 = 5;
                }
                int i18 = i10 - i15;
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.H).getSharingLocationInfo(j11);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i18--;
                }
                if (i18 >= 0 && i18 < this.V.size()) {
                    vc0 vc0Var = (vc0) this.V.get(i18);
                    Location location2 = this.L;
                    TextView textView2 = u7Var.d;
                    p9 p9Var2 = u7Var.f24212a;
                    l5 l5Var = u7Var.f24213b;
                    Location location3 = u7Var.v;
                    u7Var.f24219s = vc0Var;
                    if (DialogObject.isUserDialog(vc0Var.f42200a)) {
                        TLRPC.User user2 = MessagesController.getInstance(u7Var.f24221x).getUser(Long.valueOf(vc0Var.f42200a));
                        if (user2 != null) {
                            u7Var.f24216f.m(u7Var.f24221x, user2);
                            l5Var.l(ContactsController.formatName(user2.first_name, user2.last_name), false);
                            p9Var2.e(user2, u7Var.f24216f);
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(u7Var.f24221x).getChat(Long.valueOf(-vc0Var.f42200a));
                        if (chat2 != null) {
                            u7Var.f24216f.k(u7Var.f24221x, chat2);
                            l5Var.l(chat2.title, false);
                            p9Var2.e(chat2, u7Var.f24216f);
                        }
                    }
                    IMapsProvider.LatLng position = vc0Var.f42203e.getPosition();
                    location3.setLatitude(position.latitude);
                    location3.setLongitude(position.longitude);
                    TLRPC.Message message = vc0Var.f42201b;
                    int i19 = message.edit_date;
                    if (i19 != 0) {
                        j10 = i19;
                    } else {
                        j10 = message.date;
                    }
                    String formatLocationUpdateDate = LocaleController.formatLocationUpdateDate(j10);
                    if (location2 != null) {
                        textView2.setText(formatLocationUpdateDate + " - " + LocaleController.formatDistance(location3.distanceTo(location2), 0));
                        return;
                    }
                    textView2.setText(formatLocationUpdateDate);
                    return;
                }
                return;
            case 11:
                if (this.f48587g0) {
                    i12 = k6.f21749i5;
                } else {
                    i12 = k6.f21731h5;
                }
                view.setBackgroundColor(k6.v0(i12, this.Y));
                return;
            case 12:
                u4 u4Var2 = (u4) view;
                if (this.f48588h0) {
                    u4Var2.b(null, 2, (i10 != 1 || this.f48582b0 == null) ? false : false, false);
                    return;
                } else if (i10 == 1) {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = this.f48581a0;
                    if (this.f48582b0 != null) {
                        z10 = true;
                    }
                    u4Var2.b(tL_messageMediaVenue2, 2, z10, this.Z);
                    return;
                } else {
                    u4Var2.b(this.f48582b0, 2, false, this.Z);
                    return;
                }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11;
        long j10 = this.R;
        g6 g6Var = this.Y;
        Context context = this.I;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.f48589i0 = frameLayout;
                frameLayout.setTag(-33024);
                this.f48589i0.setLayoutParams(new f2.x0(-1, this.J));
                view2 = frameLayout;
                break;
            case 1:
                view2 = new s6(context, g6Var, false, false);
                break;
            case 2:
                view2 = new m4(context, g6Var);
                break;
            case 3:
                view2 = new u4(context, g6Var);
                break;
            case 4:
                ?? frameLayout2 = new FrameLayout(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, g6Var);
                frameLayout2.f24354a = radialProgressView;
                frameLayout2.addView(radialProgressView, c6.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                frameLayout2.f24356c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.W5, g6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView, c6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                frameLayout2.f24355b = textView;
                textView.setTextColor(k6.v0(k6.X5, g6Var));
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                frameLayout2.addView(textView, c6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = frameLayout2;
                view2 = view;
                break;
            case 5:
                FrameLayout frameLayout3 = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                frameLayout3.addView(linearLayout, c6.e(-2, -2, 17));
                TextView g10 = y3.g(context, 1, 16.0f);
                int i12 = k6.A6;
                g10.setTextColor(k6.v0(i12, g6Var));
                g10.setText("Powered by");
                linearLayout.addView(g10, c6.n(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                imageView2.setColorFilter(new PorterDuffColorFilter(k6.v0(i12, g6Var), PorterDuff.Mode.MULTIPLY));
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, c6.n(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(k6.v0(i12, g6Var));
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, c6.n(-2, -2));
                view = frameLayout3;
                view2 = view;
                break;
            case 6:
                s6 s6Var = new s6(context, g6Var, true, false);
                s6Var.setDialogId(j10);
                view2 = s6Var;
                break;
            case 7:
                s6 s6Var2 = new s6(context, g6Var, true, true);
                s6Var2.setDialogId(j10);
                view2 = s6Var2;
                break;
            case 8:
                int i13 = this.Q;
                if (i13 != 4 && i13 != 5 && i13 != 3) {
                    i11 = 54;
                } else {
                    i11 = 16;
                }
                view2 = new u7(i11, context, g6Var, true);
                break;
            case 9:
                ?? frameLayout4 = new FrameLayout(context);
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout4.f24312a = frameLayout5;
                frameLayout5.setBackground(a6.e(new float[]{8.0f}, k6.v0(k6.Oh, g6Var)));
                frameLayout4.addView(frameLayout5, c6.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
                l5 l5Var = new l5(context);
                l5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                l5Var.setGravity(17);
                l5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
                l5Var.setTextColor(k6.v0(k6.Sh, g6Var));
                l5Var.setTextSize(14);
                l5Var.l(LocaleController.getString(R.string.Directions), false);
                l5Var.setLeftDrawable(R.drawable.filled_directions);
                l5Var.setTypeface(AndroidUtilities.bold());
                frameLayout5.addView(l5Var, c6.c(-1.0f, -1));
                frameLayout5.setOutlineProvider(lf.q0.f12505b);
                frameLayout5.setClipToOutline(true);
                e6.b(frameLayout5, 0.02f, 1.2f);
                frameLayout4.setOnButtonClick(new org.telegram.ui.Components.voip.o(this, 21));
                view2 = frameLayout4;
                break;
            case 10:
                View z6Var = new z6(context, (org.telegram.ui.b) null);
                new pq(new ColorDrawable(k6.v0(k6.f21605a7, g6Var)), k6.V0(context, R.drawable.greydivider_bottom, k6.f21624b7)).f30173w = true;
                view2 = z6Var;
                break;
            case 11:
            default:
                view2 = new View(context);
                break;
            case 12:
                u4 u4Var = new u4(context, g6Var);
                u4Var.setAllowTextAnimation(true);
                view2 = u4Var;
                break;
            case 13:
                view2 = this.f48585e0;
                break;
        }
        return new f2.m1(view2);
    }

    public void K() {
    }
}
