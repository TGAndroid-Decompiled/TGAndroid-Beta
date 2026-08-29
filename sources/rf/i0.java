package rf;

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
import f2.n1;
import i7.f6;
import i7.h6;
import java.util.ArrayList;
import java.util.Locale;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.q6;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.t9;
import org.telegram.ui.hc0;
import org.telegram.ui.lc0;
public class i0 extends c implements LocationController.LocationFetchCallback {
    public final int G;
    public final Context H;
    public int I;
    public q6 J;
    public Location K;
    public Location L;
    public String M;
    public String N;
    public Location O;
    public final int P;
    public final long Q;
    public int R;
    public MessageObject S;
    public TLRPC.TL_channelLocation T;
    public ArrayList U;
    public boolean V;
    public final boolean W;
    public final c6 X;
    public boolean Y;
    public TLRPC.TL_messageMediaVenue Z;
    public TLRPC.TL_messageMediaVenue f47254a0;
    public boolean f47255b0;
    public final boolean f47256c0;
    public hc0 f47257d0;
    public boolean f47258e0;
    public boolean f47259f0;
    public boolean f47260g0;
    public FrameLayout f47261h0;

    public i0(Context context, int i10, long j10, boolean z10, c6 c6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.G = UserConfig.selectedAccount;
        this.R = -1;
        this.U = new ArrayList();
        this.Y = true;
        this.f47259f0 = false;
        this.f47260g0 = false;
        this.f47256c0 = z12;
        this.H = context;
        this.P = i10;
        this.Q = j10;
        this.W = z10;
        this.X = c6Var;
    }

    @Override
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 == 6) {
            if (LocationController.getInstance(this.G).getSharingLocationInfo(this.Q) == null && this.K == null) {
                return false;
            }
        } else if (i10 != 1 && i10 != 3 && i10 != 8 && i10 != 12 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final void I() {
        int i10;
        int i11 = this.P;
        if (i11 == 8) {
            Location location = this.L;
            if (location != null || (location = this.K) != null) {
                this.V = true;
                Q();
                LocationController.fetchLocationAddress(location, this.f47176e ? 1 : 0, this);
            }
        } else if (i11 == 4) {
            Location location2 = this.L;
            if (location2 != null || (location2 = this.K) != null) {
                Location location3 = this.O;
                if (location3 == null || location3.distanceTo(location2) > 100.0f) {
                    this.N = null;
                }
                this.V = true;
                Q();
                LocationController.fetchLocationAddress(location2, this);
            }
        } else {
            Location location4 = this.L;
            if (location4 != null) {
                Location location5 = this.O;
                if (location5 == null || location5.distanceTo(location4) > 20.0f) {
                    this.N = null;
                }
                this.V = true;
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
        int i11 = this.P;
        int i12 = 4;
        if (i11 == 4) {
            if (this.N == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.N;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.L;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.L.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.K;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.K.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        MessageObject messageObject = this.S;
        ArrayList arrayList = this.f47180s;
        if (messageObject != null) {
            if (i10 == 1) {
                return messageObject;
            }
            if (i10 > 4 && i10 < arrayList.size() + 4) {
                return this.U.get(i10 - 5);
            }
        } else {
            int i13 = 2;
            if (i11 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(this.Q);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i13 = 3;
                }
                if (i10 < i13) {
                    return null;
                }
                return this.U.get(i10 - i13);
            } else if (i11 == 1) {
                if (i10 > 4 && i10 < arrayList.size() + 5) {
                    return arrayList.get(i10 - 5);
                }
            } else if (i11 == 7) {
                if (this.f47254a0 == null) {
                    i12 = 3;
                }
                ArrayList arrayList2 = this.f47179r;
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
        this.L = location;
        I();
        Q();
    }

    public final void M(Location location) {
        boolean z10;
        int i10;
        if (this.K == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = location;
        if (this.L == null) {
            I();
        }
        if (z10 && (i10 = this.R) > 0) {
            m(i10);
        }
        if (this.S != null) {
            n(1, new Object());
            if (!this.U.isEmpty()) {
                r(2, this.U.size(), new Object());
            }
        } else if (this.P != 2) {
            Q();
        } else if (!this.U.isEmpty()) {
            r(2, this.U.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.U = new ArrayList(arrayList);
        long clientUserId = UserConfig.getInstance(this.G).getClientUserId();
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            if (((lc0) this.U.get(i10)).f40164a == clientUserId || ((lc0) this.U.get(i10)).f40165b.out) {
                this.U.remove(i10);
                break;
            }
        }
        l();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f47259f0 == z10 && this.f47260g0 == z11) {
            return;
        }
        this.f47259f0 = z10;
        this.f47260g0 = z11;
        if (z11) {
            this.Z = null;
            this.f47254a0 = null;
        }
        l();
    }

    public final void P(int i10) {
        this.I = i10;
        FrameLayout frameLayout = this.f47261h0;
        if (frameLayout != null) {
            f2.x0 x0Var = (f2.x0) frameLayout.getLayoutParams();
            if (x0Var == null) {
                x0Var = new f2.x0(-1, this.I);
            } else {
                ((ViewGroup.MarginLayoutParams) x0Var).height = this.I;
            }
            this.f47261h0.setLayoutParams(x0Var);
            this.f47261h0.forceLayout();
        }
    }

    public final void Q() {
        String string;
        q6 q6Var = this.J;
        if (q6Var != null) {
            int i10 = this.P;
            if (i10 == 8) {
                if (!TextUtils.isEmpty(this.M)) {
                    string = this.M;
                } else if (!TextUtils.isEmpty(this.N)) {
                    string = this.N;
                } else if (this.V) {
                    string = LocaleController.getString(R.string.Loading);
                } else {
                    string = LocaleController.getString(R.string.UnknownLocation);
                }
                this.J.b(LocaleController.getString(R.string.SetThisLocation), string);
                this.J.setHasLocation(true);
                return;
            }
            String str = "";
            if (i10 != 4 && this.L == null) {
                if (this.K != null) {
                    q6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.K.getAccuracy(), new Object[0])));
                    this.J.setHasLocation(true);
                    return;
                }
                String string2 = LocaleController.getString(R.string.SendLocation);
                if (!this.f47259f0) {
                    str = LocaleController.getString(R.string.Loading);
                }
                q6Var.b(string2, str);
                this.J.setHasLocation(!this.f47259f0);
                return;
            }
            if (!TextUtils.isEmpty(this.M)) {
                str = this.M;
            } else if (!TextUtils.isEmpty(this.N)) {
                str = this.N;
            } else {
                Location location = this.L;
                if ((location == null && this.K == null) || this.V) {
                    str = LocaleController.getString(R.string.Loading);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.L.getLongitude()));
                } else {
                    Location location2 = this.K;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.K.getLongitude()));
                    } else if (!this.f47259f0) {
                        str = LocaleController.getString(R.string.Loading);
                    }
                }
            }
            if (this.f47255b0) {
                this.J.b(LocaleController.getString(R.string.AttachSelectedLocation), str);
            } else if (i10 == 4) {
                this.J.b(LocaleController.getString(R.string.ChatSetThisLocation), str);
            } else {
                this.J.b(LocaleController.getString(R.string.SendSelectedLocation), str);
            }
            this.J.setHasLocation(true);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.P;
        int i14 = 6;
        if (i13 != 6 && i13 != 5 && i13 != 4 && !this.f47176e) {
            int i15 = 0;
            if (this.S != null) {
                if (this.U.isEmpty()) {
                    if (!this.f47256c0) {
                        i15 = 1;
                    }
                } else {
                    i15 = this.U.size() + 3;
                }
                i12 = 2 + i15;
            } else if (i13 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(this.Q);
                int size = this.U.size() + 2;
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i15 = 1;
                }
                i12 = size + i15;
            } else {
                boolean z10 = this.h;
                boolean z11 = this.W;
                if (!z10 && this.f47177f) {
                    ArrayList arrayList = this.f47180s;
                    if (!arrayList.isEmpty()) {
                        if (i13 != 1) {
                            i14 = 5;
                        }
                        i12 = arrayList.size() + this.f47179r.size() + (z11 ? 1 : 0) + i14;
                    }
                }
                if (i13 == 0) {
                    i14 = 5;
                } else if (i13 == 7) {
                    if (this.f47254a0 != null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    i14 = i10 + 5;
                }
                boolean z12 = this.f47259f0;
                if (!z12 && (this.h || !this.f47177f)) {
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
        if (this.f47257d0 != null && this.f47258e0) {
            return i12 + 1;
        }
        return i12;
    }

    @Override
    public final int j(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: rf.i0.j(int):int");
    }

    @Override
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        boolean z10;
        boolean z11 = false;
        this.V = false;
        this.O = location;
        int i10 = this.P;
        if (i10 == 8) {
            this.N = str2;
        } else {
            this.N = str;
        }
        if (i10 == 7 && this.f47260g0) {
            this.Z = null;
            this.f47254a0 = null;
        }
        if (this.f47254a0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 7) {
            this.Z = tL_messageMediaVenue;
            this.f47254a0 = tL_messageMediaVenue2;
            if (tL_messageMediaVenue2 == null) {
                z11 = true;
            }
            if (z10 == z11) {
                m(1);
                if (this.f47254a0 == null) {
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
    public final void v(n1 n1Var, int i10) {
        int i11;
        boolean z10;
        long j10;
        int i12;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        int i14 = this.P;
        int i15 = 2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        boolean z11 = false;
        boolean z12 = true;
        switch (i13) {
            case 0:
                f2.x0 x0Var = (f2.x0) view.getLayoutParams();
                if (x0Var == null) {
                    x0Var = new f2.x0(-1, this.I);
                } else {
                    ((ViewGroup.MarginLayoutParams) x0Var).height = this.I;
                }
                view.setLayoutParams(x0Var);
                return;
            case 1:
                this.J = (q6) view;
                Q();
                return;
            case 2:
                k4 k4Var = (k4) view;
                if (this.S != null) {
                    k4Var.setText(LocaleController.getString(R.string.LiveLocations));
                    return;
                } else {
                    k4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                }
            case 3:
                s4 s4Var = (s4) view;
                if (i14 == 0) {
                    i11 = i10 - 4;
                } else {
                    if (i14 == 7 || i14 == 8) {
                        int i16 = i10 - 4;
                        if (this.f47254a0 == null) {
                            i11 = i16;
                        }
                    }
                    i11 = i10 - 5;
                }
                if (this.f47177f && (i14 != 7 || !this.h)) {
                    ArrayList arrayList = this.f47179r;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        s4Var.b(tL_messageMediaVenue, i15, true, false);
                        return;
                    }
                    int size = i11 - arrayList.size();
                    if (size >= 0) {
                        ArrayList arrayList2 = this.f47180s;
                        if (size < arrayList2.size()) {
                            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                        }
                    }
                }
                i15 = i11;
                s4Var.b(tL_messageMediaVenue, i15, true, false);
                return;
            case 4:
                ((u4) view).setLoading(this.h);
                return;
            case 5:
            case 9:
            case 10:
            default:
                return;
            case 6:
                q6 q6Var = (q6) view;
                if (this.K != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q6Var.setHasLocation(z10);
                int i17 = i10 + 1;
                if (i17 < h() && j(i17) == 7) {
                    z11 = true;
                }
                q6Var.f25068s = z11;
                q6Var.invalidate();
                return;
            case 7:
                q6 q6Var2 = (q6) view;
                if (this.K != null) {
                    z11 = true;
                }
                q6Var2.setHasLocation(z11);
                return;
            case 8:
                s7 s7Var = (s7) view;
                if (i14 == 6) {
                    s7Var.b(this.S, this.K, this.f47259f0);
                    return;
                }
                TLRPC.TL_channelLocation tL_channelLocation = this.T;
                long j11 = this.Q;
                if (tL_channelLocation != null) {
                    TextView textView = s7Var.d;
                    Location location = s7Var.v;
                    t9 t9Var = s7Var.f25658a;
                    s7Var.f25667x = UserConfig.selectedAccount;
                    String str = tL_channelLocation.address;
                    s7Var.f25662f = null;
                    String str2 = "";
                    if (DialogObject.isUserDialog(j11)) {
                        TLRPC.User user = MessagesController.getInstance(s7Var.f25667x).getUser(Long.valueOf(j11));
                        if (user != null) {
                            s7Var.f25662f = new e9(0, user);
                            str2 = UserObject.getUserName(user);
                            t9Var.e(user, s7Var.f25662f);
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(s7Var.f25667x).getChat(Long.valueOf(-j11));
                        if (chat != null) {
                            e9 e9Var = new e9(chat);
                            s7Var.f25662f = e9Var;
                            str2 = chat.title;
                            t9Var.e(chat, e9Var);
                        }
                    }
                    s7Var.f25659b.l(str2, false);
                    location.setLatitude(tL_channelLocation.geo_point.lat);
                    location.setLongitude(tL_channelLocation.geo_point._long);
                    s7Var.f25661e = true;
                    textView.setSingleLine(true);
                    textView.setText(str);
                    return;
                }
                MessageObject messageObject = this.S;
                if (messageObject != null && i10 == 1) {
                    s7Var.b(messageObject, this.K, this.f47259f0);
                    return;
                }
                if (messageObject != null) {
                    i15 = 5;
                }
                int i18 = i10 - i15;
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(j11);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i18--;
                }
                if (i18 >= 0 && i18 < this.U.size()) {
                    lc0 lc0Var = (lc0) this.U.get(i18);
                    Location location2 = this.K;
                    TextView textView2 = s7Var.d;
                    t9 t9Var2 = s7Var.f25658a;
                    h5 h5Var = s7Var.f25659b;
                    Location location3 = s7Var.v;
                    s7Var.f25665s = lc0Var;
                    if (DialogObject.isUserDialog(lc0Var.f40164a)) {
                        TLRPC.User user2 = MessagesController.getInstance(s7Var.f25667x).getUser(Long.valueOf(lc0Var.f40164a));
                        if (user2 != null) {
                            s7Var.f25662f.m(s7Var.f25667x, user2);
                            h5Var.l(ContactsController.formatName(user2.first_name, user2.last_name), false);
                            t9Var2.e(user2, s7Var.f25662f);
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(s7Var.f25667x).getChat(Long.valueOf(-lc0Var.f40164a));
                        if (chat2 != null) {
                            s7Var.f25662f.k(s7Var.f25667x, chat2);
                            h5Var.l(chat2.title, false);
                            t9Var2.e(chat2, s7Var.f25662f);
                        }
                    }
                    IMapsProvider.LatLng position = lc0Var.f40167e.getPosition();
                    location3.setLatitude(position.latitude);
                    location3.setLongitude(position.longitude);
                    TLRPC.Message message = lc0Var.f40165b;
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
                if (this.f47259f0) {
                    i12 = g6.f23151i5;
                } else {
                    i12 = g6.f23133h5;
                }
                view.setBackgroundColor(g6.v0(i12, this.X));
                return;
            case 12:
                s4 s4Var2 = (s4) view;
                if (this.f47260g0) {
                    s4Var2.b(null, 2, (i10 != 1 || this.f47254a0 == null) ? false : false, false);
                    return;
                } else if (i10 == 1) {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = this.Z;
                    if (this.f47254a0 != null) {
                        z11 = true;
                    }
                    s4Var2.b(tL_messageMediaVenue2, 2, z11, this.Y);
                    return;
                } else {
                    s4Var2.b(this.f47254a0, 2, false, this.Y);
                    return;
                }
        }
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11;
        long j10 = this.Q;
        c6 c6Var = this.X;
        Context context = this.H;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.f47261h0 = frameLayout;
                frameLayout.setTag(-33024);
                this.f47261h0.setLayoutParams(new f2.x0(-1, this.I));
                view2 = frameLayout;
                break;
            case 1:
                view2 = new q6(context, c6Var, false, false);
                break;
            case 2:
                view2 = new k4(context, c6Var);
                break;
            case 3:
                view2 = new s4(context, c6Var);
                break;
            case 4:
                ?? frameLayout2 = new FrameLayout(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
                frameLayout2.f25728a = radialProgressView;
                frameLayout2.addView(radialProgressView, f6.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                frameLayout2.f25730c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.W5, c6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView, f6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                frameLayout2.f25729b = textView;
                textView.setTextColor(g6.v0(g6.X5, c6Var));
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                frameLayout2.addView(textView, f6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = frameLayout2;
                view2 = view;
                break;
            case 5:
                FrameLayout frameLayout3 = new FrameLayout(context);
                LinearLayout linearLayout = new LinearLayout(context);
                frameLayout3.addView(linearLayout, f6.e(-2, -2, 17));
                TextView h = x3.h(context, 1, 16.0f);
                int i12 = g6.A6;
                h.setTextColor(g6.v0(i12, c6Var));
                h.setText("Powered by");
                linearLayout.addView(h, f6.n(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i12, c6Var), PorterDuff.Mode.MULTIPLY));
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, f6.n(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(g6.v0(i12, c6Var));
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, f6.n(-2, -2));
                view = frameLayout3;
                view2 = view;
                break;
            case 6:
                q6 q6Var = new q6(context, c6Var, true, false);
                q6Var.setDialogId(j10);
                view2 = q6Var;
                break;
            case 7:
                q6 q6Var2 = new q6(context, c6Var, true, true);
                q6Var2.setDialogId(j10);
                view2 = q6Var2;
                break;
            case 8:
                int i13 = this.P;
                if (i13 != 4 && i13 != 5 && i13 != 3) {
                    i11 = 54;
                } else {
                    i11 = 16;
                }
                view2 = new s7(i11, context, c6Var, true);
                break;
            case 9:
                ?? frameLayout4 = new FrameLayout(context);
                FrameLayout frameLayout5 = new FrameLayout(context);
                frameLayout4.f25699a = frameLayout5;
                frameLayout5.setBackground(w5.e(new float[]{8.0f}, g6.v0(g6.Oh, c6Var)));
                frameLayout4.addView(frameLayout5, f6.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
                h5 h5Var = new h5(context);
                h5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                h5Var.setGravity(17);
                h5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
                h5Var.setTextColor(g6.v0(g6.Sh, c6Var));
                h5Var.setTextSize(14);
                h5Var.l(LocaleController.getString(R.string.Directions), false);
                h5Var.setLeftDrawable(R.drawable.filled_directions);
                h5Var.setTypeface(AndroidUtilities.bold());
                frameLayout5.addView(h5Var, f6.c(-1.0f, -1));
                frameLayout5.setOutlineProvider(jf.q0.f11669b);
                frameLayout5.setClipToOutline(true);
                h6.b(frameLayout5, 0.02f, 1.2f);
                frameLayout4.setOnButtonClick(new mh.n(this, 21));
                view2 = frameLayout4;
                break;
            case 10:
                View x6Var = new x6(context, (org.telegram.ui.b) null);
                new jq(new ColorDrawable(g6.v0(g6.f23009a7, c6Var)), g6.V0(context, R.drawable.greydivider_bottom, g6.f23028b7)).f29792w = true;
                view2 = x6Var;
                break;
            case 11:
            default:
                view2 = new View(context);
                break;
            case 12:
                s4 s4Var = new s4(context, c6Var);
                s4Var.setAllowTextAnimation(true);
                view2 = s4Var;
                break;
            case 13:
                view2 = this.f47257d0;
                break;
        }
        return new n1(view2);
    }

    public void K() {
    }
}
