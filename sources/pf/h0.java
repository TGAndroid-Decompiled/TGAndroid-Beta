package pf;

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
import f2.o1;
import h7.b6;
import h7.z5;
import java.util.ArrayList;
import java.util.Locale;
import lh.c5;
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
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.w6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.jc0;
import org.telegram.ui.nc0;

public class h0 extends c implements LocationController.LocationFetchCallback {
    public final int G;
    public final Context H;
    public int I;
    public p6 J;
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

    public TLRPC.TL_messageMediaVenue f45813a0;

    public boolean f45814b0;

    public final boolean f45815c0;

    public jc0 f45816d0;

    public boolean f45817e0;

    public boolean f45818f0;

    public boolean f45819g0;

    public FrameLayout f45820h0;

    public h0(Context context, int i10, long j10, boolean z10, c6 c6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.G = UserConfig.selectedAccount;
        this.R = -1;
        this.U = new ArrayList();
        this.Y = true;
        this.f45818f0 = false;
        this.f45819g0 = false;
        this.f45815c0 = z12;
        this.H = context;
        this.P = i10;
        this.Q = j10;
        this.W = z10;
        this.X = c6Var;
    }

    @Override
    public final boolean D(o1 o1Var) {
        int i10 = o1Var.f5793f;
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
        int i10 = this.P;
        if (i10 == 8) {
            Location location = this.L;
            if (location == null && (location = this.K) == null) {
                return;
            }
            this.V = true;
            Q();
            LocationController.fetchLocationAddress(location, this.f45741e ? 1 : 0, this);
            return;
        }
        if (i10 != 4) {
            Location location2 = this.L;
            if (location2 != null) {
                Location location3 = this.O;
                if (location3 == null || location3.distanceTo(location2) > 20.0f) {
                    this.N = null;
                }
                this.V = true;
                Q();
                LocationController.fetchLocationAddress(location2, this.d ? 2 : 0, this);
                return;
            }
            return;
        }
        Location location4 = this.L;
        if (location4 == null && (location4 = this.K) == null) {
            return;
        }
        Location location5 = this.O;
        if (location5 == null || location5.distanceTo(location4) > 100.0f) {
            this.N = null;
        }
        this.V = true;
        Q();
        LocationController.fetchLocationAddress(location4, this);
    }

    public final Object J(int i10) {
        int i11 = this.P;
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
        ArrayList arrayList = this.f45745s;
        if (messageObject == null) {
            int i12 = 2;
            if (i11 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(this.Q);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i12 = 3;
                }
                if (i10 >= i12) {
                    return this.U.get(i10 - i12);
                }
                return null;
            }
            if (i11 == 1) {
                if (i10 > 4 && i10 < arrayList.size() + 5) {
                    return arrayList.get(i10 - 5);
                }
            } else if (i11 == 7) {
                int i13 = this.f45813a0 == null ? 3 : 4;
                ArrayList arrayList2 = this.f45744r;
                if (i10 > i13) {
                    int i14 = i13 + 1;
                    if (i10 < arrayList2.size() + i14) {
                        return arrayList2.get(i10 - i14);
                    }
                }
                int size = arrayList2.size() + i13;
                if (i10 > size) {
                    int i15 = size + 1;
                    if (i10 < arrayList.size() + i15) {
                        return arrayList.get(i10 - i15);
                    }
                }
            } else if (i10 > 3 && i10 < arrayList.size() + 4) {
                return arrayList.get(i10 - 4);
            }
        } else {
            if (i10 == 1) {
                return messageObject;
            }
            if (i10 > 4 && i10 < arrayList.size() + 4) {
                return this.U.get(i10 - 5);
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
        int i10;
        boolean z10 = this.K == null;
        this.K = location;
        if (this.L == null) {
            I();
        }
        if (z10 && (i10 = this.R) > 0) {
            m(i10);
        }
        if (this.S != null) {
            n(1, new Object());
            if (this.U.isEmpty()) {
                return;
            }
            r(2, this.U.size(), new Object());
            return;
        }
        if (this.P != 2) {
            Q();
        } else {
            if (this.U.isEmpty()) {
                return;
            }
            r(2, this.U.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.U = new ArrayList(arrayList);
        long clientUserId = UserConfig.getInstance(this.G).getClientUserId();
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            if (((nc0) this.U.get(i10)).f40729a == clientUserId || ((nc0) this.U.get(i10)).f40730b.out) {
                this.U.remove(i10);
                break;
            }
        }
        l();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f45818f0 == z10 && this.f45819g0 == z11) {
            return;
        }
        this.f45818f0 = z10;
        this.f45819g0 = z11;
        if (z11) {
            this.Z = null;
            this.f45813a0 = null;
        }
        l();
    }

    public final void P(int i10) {
        this.I = i10;
        FrameLayout frameLayout = this.f45820h0;
        if (frameLayout != null) {
            f2.y0 y0Var = (f2.y0) frameLayout.getLayoutParams();
            if (y0Var == null) {
                y0Var = new f2.y0(-1, this.I);
            } else {
                ((ViewGroup.MarginLayoutParams) y0Var).height = this.I;
            }
            this.f45820h0.setLayoutParams(y0Var);
            this.f45820h0.forceLayout();
        }
    }

    public final void Q() {
        String string;
        p6 p6Var = this.J;
        if (p6Var != null) {
            int i10 = this.P;
            if (i10 == 8) {
                if (!TextUtils.isEmpty(this.M)) {
                    string = this.M;
                } else if (TextUtils.isEmpty(this.N)) {
                    string = this.V ? LocaleController.getString(R.string.Loading) : LocaleController.getString(R.string.UnknownLocation);
                } else {
                    string = this.N;
                }
                this.J.b(LocaleController.getString(R.string.SetThisLocation), string);
                this.J.setHasLocation(true);
                return;
            }
            String string2 = "";
            if (i10 != 4 && this.L == null) {
                if (this.K != null) {
                    p6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.K.getAccuracy(), new Object[0])));
                    this.J.setHasLocation(true);
                    return;
                } else {
                    p6Var.b(LocaleController.getString(R.string.SendLocation), this.f45818f0 ? "" : LocaleController.getString(R.string.Loading));
                    this.J.setHasLocation(!this.f45818f0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.M)) {
                string2 = this.M;
            } else if (TextUtils.isEmpty(this.N)) {
                Location location = this.L;
                if ((location == null && this.K == null) || this.V) {
                    string2 = LocaleController.getString(R.string.Loading);
                } else if (location != null) {
                    string2 = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.L.getLongitude()));
                } else {
                    Location location2 = this.K;
                    if (location2 != null) {
                        string2 = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.K.getLongitude()));
                    } else if (!this.f45818f0) {
                        string2 = LocaleController.getString(R.string.Loading);
                    }
                }
            } else {
                string2 = this.N;
            }
            if (this.f45814b0) {
                this.J.b(LocaleController.getString(R.string.AttachSelectedLocation), string2);
            } else if (i10 == 4) {
                this.J.b(LocaleController.getString(R.string.ChatSetThisLocation), string2);
            } else {
                this.J.b(LocaleController.getString(R.string.SendSelectedLocation), string2);
            }
            this.J.setHasLocation(true);
        }
    }

    @Override
    public final int h() {
        int i10;
        boolean z10;
        int i11;
        int size = 2;
        int i12 = this.P;
        int i13 = 6;
        if (i12 != 6 && i12 != 5 && i12 != 4 && !this.f45741e) {
            int size2 = 0;
            if (this.S != null) {
                if (!this.U.isEmpty()) {
                    size2 = this.U.size() + 3;
                } else if (!this.f45815c0) {
                    size2 = 1;
                }
                size = 2 + size2;
            } else if (i12 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(this.Q);
                int size3 = this.U.size() + 2;
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    size2 = 1;
                }
                size = size3 + size2;
            } else {
                boolean z11 = this.h;
                boolean z12 = this.W;
                if (z11 || !this.f45742f) {
                    if (i12 == 0) {
                        i13 = 5;
                    } else if (i12 == 7) {
                        if (this.f45813a0 != null) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        i13 = i10 + 5;
                    }
                    z10 = this.f45818f0;
                    if (!z10 || (!this.h && this.f45742f)) {
                        i11 = 0;
                    } else {
                        i11 = 2;
                    }
                    size = ((i11 + (z12 ? 1 : 0)) - (z10 ? 2 : 0)) + i13;
                } else {
                    ArrayList arrayList = this.f45745s;
                    if (arrayList.isEmpty()) {
                        if (i12 == 0) {
                            i13 = 5;
                        } else if (i12 == 7) {
                            if (this.f45813a0 != null) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            i13 = i10 + 5;
                        }
                        z10 = this.f45818f0;
                        if (z10) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        size = ((i11 + (z12 ? 1 : 0)) - (z10 ? 2 : 0)) + i13;
                    } else {
                        size = arrayList.size() + this.f45744r.size() + (z12 ? 1 : 0) + (i12 != 1 ? 5 : 6);
                    }
                }
            }
        }
        return (this.f45816d0 == null || !this.f45817e0) ? size : size + 1;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == h() - 1 && this.f45816d0 != null && this.f45817e0) {
            return 13;
        }
        if (i10 == 0) {
            return 0;
        }
        int i12 = this.P;
        if (i12 == 6) {
            return 8;
        }
        if (this.W && i10 == h() - 1) {
            return 11;
        }
        if (i12 == 5) {
            return 8;
        }
        if (i12 != 4) {
            LocationController.SharingLocationInfo sharingLocationInfo = (i12 == 2 || i12 == 1) ? LocationController.getInstance(this.G).getSharingLocationInfo(this.Q) : null;
            if (this.S != null) {
                if (this.U.isEmpty()) {
                    return i10 == 2 ? 9 : 8;
                }
                if (i10 == 2) {
                    return 10;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        return 8;
                    }
                    this.R = i10;
                    return 6;
                }
            } else {
                if (i12 == 2) {
                    if (i10 != 2 || sharingLocationInfo == null || sharingLocationInfo.period == Integer.MAX_VALUE) {
                        if (i10 != 1) {
                            return 8;
                        }
                        if (sharingLocationInfo == null || sharingLocationInfo.period != Integer.MAX_VALUE) {
                            this.R = i10;
                            return 6;
                        }
                    }
                    return 7;
                }
                ArrayList arrayList = this.f45745s;
                if (i12 != 1) {
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.f45744r;
                    int size2 = arrayList2.size() + size;
                    if (i12 != 7) {
                        i11 = 4;
                    } else {
                        if (i10 == 1) {
                            return 12;
                        }
                        if (this.f45813a0 == null) {
                            i11 = 4;
                        } else {
                            if (i10 == 2) {
                                return 12;
                            }
                            i10--;
                            i11 = 3;
                        }
                    }
                    if (i10 != 1) {
                        if (i10 == 2) {
                            return 10;
                        }
                        if (i10 != 3) {
                            if (this.h || (arrayList.isEmpty() && arrayList2.isEmpty())) {
                                if (i10 > 6 || ((!this.h && this.f45742f) || this.f45818f0)) {
                                    return 4;
                                }
                            } else if (i10 == size2 + i11) {
                                return 5;
                            }
                            return 3;
                        }
                    }
                } else if (i10 != 1) {
                    if (i10 == 2) {
                        if (sharingLocationInfo != null) {
                            this.R = -1;
                            return 7;
                        }
                        this.R = i10;
                        return 6;
                    }
                    if (i10 == 3) {
                        return 10;
                    }
                    if (i10 != 4) {
                        if (this.h || arrayList.isEmpty() || !this.f45742f) {
                            if (i10 > 7 || ((!this.h && this.f45742f) || this.f45818f0)) {
                                return 4;
                            }
                        } else if (i10 == arrayList.size() + 5) {
                            return 5;
                        }
                        return 3;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        this.V = false;
        this.O = location;
        int i10 = this.P;
        if (i10 == 8) {
            this.N = str2;
        } else {
            this.N = str;
        }
        if (i10 == 7 && this.f45819g0) {
            this.Z = null;
            this.f45813a0 = null;
        }
        boolean z10 = this.f45813a0 != null;
        if (i10 != 7) {
            Q();
            return;
        }
        this.Z = tL_messageMediaVenue;
        this.f45813a0 = tL_messageMediaVenue2;
        if (z10 != (tL_messageMediaVenue2 == null)) {
            q(1, 2);
            return;
        }
        m(1);
        if (this.f45813a0 == null) {
            u(2);
        } else {
            o(2);
        }
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        int i11;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        int i13 = this.P;
        int i14 = 2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        boolean z10 = false;
        switch (i12) {
            case 0:
                f2.y0 y0Var = (f2.y0) view.getLayoutParams();
                if (y0Var == null) {
                    y0Var = new f2.y0(-1, this.I);
                } else {
                    ((ViewGroup.MarginLayoutParams) y0Var).height = this.I;
                }
                view.setLayoutParams(y0Var);
                break;
            case 1:
                this.J = (p6) view;
                Q();
                break;
            case 2:
                j4 j4Var = (j4) view;
                if (this.S == null) {
                    j4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                } else {
                    j4Var.setText(LocaleController.getString(R.string.LiveLocations));
                }
                break;
            case 3:
                r4 r4Var = (r4) view;
                if (i13 == 0) {
                    i11 = i10 - 4;
                } else if (i13 == 7 || i13 == 8) {
                    int i15 = i10 - 4;
                    if (this.f45813a0 != null) {
                        i11 = i10 - 5;
                    } else {
                        i11 = i15;
                    }
                } else {
                    i11 = i10 - 5;
                }
                if (!this.f45742f || (i13 == 7 && this.h)) {
                    i14 = i11;
                } else {
                    ArrayList arrayList = this.f45744r;
                    if (i11 < 0 || i11 >= arrayList.size()) {
                        int size = i11 - arrayList.size();
                        if (size >= 0) {
                            ArrayList arrayList2 = this.f45745s;
                            if (size < arrayList2.size()) {
                                tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                            }
                        }
                        i14 = i11;
                    } else {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                    }
                }
                r4Var.b(tL_messageMediaVenue, i14, true, false);
                break;
            case 4:
                ((t4) view).setLoading(this.h);
                break;
            case 6:
                p6 p6Var = (p6) view;
                p6Var.setHasLocation(this.K != null);
                int i16 = i10 + 1;
                if (i16 < h() && j(i16) == 7) {
                    z10 = true;
                }
                p6Var.f24988s = z10;
                p6Var.invalidate();
                break;
            case 7:
                ((p6) view).setHasLocation(this.K != null);
                break;
            case 8:
                r7 r7Var = (r7) view;
                if (i13 == 6) {
                    r7Var.b(this.S, this.K, this.f45818f0);
                    break;
                } else {
                    TLRPC.TL_channelLocation tL_channelLocation = this.T;
                    long j10 = this.Q;
                    if (tL_channelLocation != null) {
                        TextView textView = r7Var.d;
                        Location location = r7Var.v;
                        n9 n9Var = r7Var.f25221a;
                        r7Var.f25230x = UserConfig.selectedAccount;
                        String str = tL_channelLocation.address;
                        r7Var.f25225f = null;
                        String userName = "";
                        if (DialogObject.isUserDialog(j10)) {
                            TLRPC.User user = MessagesController.getInstance(r7Var.f25230x).getUser(Long.valueOf(j10));
                            if (user != null) {
                                r7Var.f25225f = new y8(0, user);
                                userName = UserObject.getUserName(user);
                                n9Var.e(user, r7Var.f25225f);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(r7Var.f25230x).getChat(Long.valueOf(-j10));
                            if (chat != null) {
                                y8 y8Var = new y8(chat);
                                r7Var.f25225f = y8Var;
                                userName = chat.title;
                                n9Var.e(chat, y8Var);
                            }
                        }
                        r7Var.f25222b.l(userName, false);
                        location.setLatitude(tL_channelLocation.geo_point.lat);
                        location.setLongitude(tL_channelLocation.geo_point._long);
                        r7Var.f25224e = true;
                        textView.setSingleLine(true);
                        textView.setText(str);
                        break;
                    } else {
                        MessageObject messageObject = this.S;
                        if (messageObject != null && i10 == 1) {
                            r7Var.b(messageObject, this.K, this.f45818f0);
                            break;
                        } else {
                            int i17 = i10 - (messageObject != null ? 5 : 2);
                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(j10);
                            if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                                i17--;
                            }
                            if (i17 >= 0 && i17 < this.U.size()) {
                                nc0 nc0Var = (nc0) this.U.get(i17);
                                Location location2 = this.K;
                                TextView textView2 = r7Var.d;
                                n9 n9Var2 = r7Var.f25221a;
                                h5 h5Var = r7Var.f25222b;
                                Location location3 = r7Var.v;
                                r7Var.f25228s = nc0Var;
                                if (DialogObject.isUserDialog(nc0Var.f40729a)) {
                                    TLRPC.User user2 = MessagesController.getInstance(r7Var.f25230x).getUser(Long.valueOf(nc0Var.f40729a));
                                    if (user2 != null) {
                                        r7Var.f25225f.m(r7Var.f25230x, user2);
                                        h5Var.l(ContactsController.formatName(user2.first_name, user2.last_name), false);
                                        n9Var2.e(user2, r7Var.f25225f);
                                    }
                                } else {
                                    TLRPC.Chat chat2 = MessagesController.getInstance(r7Var.f25230x).getChat(Long.valueOf(-nc0Var.f40729a));
                                    if (chat2 != null) {
                                        r7Var.f25225f.k(r7Var.f25230x, chat2);
                                        h5Var.l(chat2.title, false);
                                        n9Var2.e(chat2, r7Var.f25225f);
                                    }
                                }
                                IMapsProvider.LatLng position = nc0Var.f40732e.getPosition();
                                location3.setLatitude(position.latitude);
                                location3.setLongitude(position.longitude);
                                TLRPC.Message message = nc0Var.f40730b;
                                int i18 = message.edit_date;
                                String locationUpdateDate = LocaleController.formatLocationUpdateDate(i18 != 0 ? i18 : message.date);
                                if (location2 == null) {
                                    textView2.setText(locationUpdateDate);
                                } else {
                                    textView2.setText(locationUpdateDate + " - " + LocaleController.formatDistance(location3.distanceTo(location2), 0));
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                view.setBackgroundColor(g6.v0(this.f45818f0 ? g6.f23143i5 : g6.f23124h5, this.X));
                break;
            case 12:
                r4 r4Var2 = (r4) view;
                if (this.f45819g0) {
                    r4Var2.b(null, 2, i10 == 1 && this.f45813a0 != null, false);
                } else if (i10 != 1) {
                    r4Var2.b(this.f45813a0, 2, false, this.Y);
                } else {
                    r4Var2.b(this.Z, 2, this.f45813a0 != null, this.Y);
                }
                break;
        }
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        ?? r10;
        ?? p6Var;
        int i11 = 17;
        long j10 = this.Q;
        c6 c6Var = this.X;
        Context context = this.H;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.f45820h0 = frameLayout;
                frameLayout.setTag(-33024);
                this.f45820h0.setLayoutParams(new f2.y0(-1, this.I));
                p6Var = frameLayout;
                break;
            case 1:
                p6Var = new p6(context, c6Var, false, false);
                break;
            case 2:
                p6Var = new j4(context, c6Var);
                break;
            case 3:
                p6Var = new r4(context, c6Var);
                break;
            case 4:
                t4 t4Var = new t4(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
                t4Var.f25668a = radialProgressView;
                t4Var.addView(radialProgressView, z5.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                t4Var.f25670c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.W5, c6Var), PorterDuff.Mode.MULTIPLY));
                t4Var.addView(imageView, z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                t4Var.f25669b = textView;
                textView.setTextColor(g6.v0(g6.X5, c6Var));
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                t4Var.addView(textView, z5.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                r10 = t4Var;
                p6Var = r10;
                break;
            case 5:
                ?? u4Var = new u4(context);
                LinearLayout linearLayout = new LinearLayout(context);
                u4Var.addView(linearLayout, z5.e(-2, -2, 17));
                TextView textViewH = y1.h(context, 1, 16.0f);
                int i12 = g6.A6;
                textViewH.setTextColor(g6.v0(i12, c6Var));
                textViewH.setText("Powered by");
                linearLayout.addView(textViewH, z5.n(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i12, c6Var), PorterDuff.Mode.MULTIPLY));
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, z5.n(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(g6.v0(i12, c6Var));
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, z5.n(-2, -2));
                r10 = u4Var;
                p6Var = r10;
                break;
            case 6:
                p6 p6Var2 = new p6(context, c6Var, true, false);
                p6Var2.setDialogId(j10);
                p6Var = p6Var2;
                break;
            case 7:
                p6 p6Var3 = new p6(context, c6Var, true, true);
                p6Var3.setDialogId(j10);
                p6Var = p6Var3;
                break;
            case 8:
                int i13 = this.P;
                p6Var = new r7((i13 == 4 || i13 == 5 || i13 == 3) ? 16 : 54, context, c6Var, true);
                break;
            case 9:
                ?? s4Var = new s4(context);
                FrameLayout frameLayout2 = new FrameLayout(context);
                s4Var.f25632a = frameLayout2;
                frameLayout2.setBackground(w5.e(new float[]{8.0f}, g6.v0(g6.Oh, c6Var)));
                s4Var.addView(frameLayout2, z5.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
                h5 h5Var = new h5(context);
                h5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                h5Var.setGravity(17);
                h5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
                h5Var.setTextColor(g6.v0(g6.Sh, c6Var));
                h5Var.setTextSize(14);
                h5Var.l(LocaleController.getString(R.string.Directions), false);
                h5Var.setLeftDrawable(R.drawable.filled_directions);
                h5Var.setTypeface(AndroidUtilities.bold());
                frameLayout2.addView(h5Var, z5.c(-1.0f, -1));
                frameLayout2.setOutlineProvider(gf.r0.f7055b);
                frameLayout2.setClipToOutline(true);
                b6.b(frameLayout2, 0.02f, 1.2f);
                s4Var.setOnButtonClick(new c5(this, i11));
                p6Var = s4Var;
                break;
            case 10:
                w6 w6Var = new w6(context, (rl) null);
                new dq(new ColorDrawable(g6.v0(g6.f22999a7, c6Var)), g6.V0(context, R.drawable.greydivider_bottom, g6.f23018b7)).f27828w = true;
                p6Var = w6Var;
                break;
            case 11:
            default:
                p6Var = new View(context);
                break;
            case 12:
                r4 r4Var = new r4(context, c6Var);
                r4Var.setAllowTextAnimation(true);
                p6Var = r4Var;
                break;
            case 13:
                p6Var = this.f45816d0;
                break;
        }
        return new lk0(p6Var);
    }

    public void K() {
    }
}
