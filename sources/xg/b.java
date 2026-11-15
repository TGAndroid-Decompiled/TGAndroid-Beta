package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import di.ua;
import fi.w3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.r1;
import org.telegram.messenger.t3;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.uj0;
import ug.p1;
import ug.t1;
import v4.e1;
import wg.s;
import yg.d0;
import yg.l;
import yg.r;
import yg.u;
import yg.v;
import yg.w;
import yg.x;
import yg.y;
public final class b extends rg.b {
    public final e6 d;
    public uj0 f59904f;
    public s h;
    public s f59905n;
    public r f59906r;
    public s f59907s;
    public TLRPC.Chat f59908w;
    public ArrayList f59903e = new ArrayList();
    public final HashMap f59909x = new HashMap();

    public b(e6 e6Var) {
        this.d = e6Var;
        p1 p1Var = new p1(this, 5);
        vr a02 = vr.a0(m10.f24934t0);
        a02.f27220a.c(new t1(7, a02, p1Var));
    }

    @Override
    public final boolean D(e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 2 && i7 != 11 && i7 != 8 && i7 != 10 && i7 != 15 && i7 != 12 && i7 != 17 && i7 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = np.s1(m10.f24934t0).N0(chat.f28051id);
        if (N0 != null && (i7 = N0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.f59909x;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f28051id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i7 = 0; i7 < this.f59903e.size(); i7++) {
            if (((a) this.f59903e.get(i7)).f56015a == 7) {
                g(i7);
            }
        }
    }

    @Override
    public final int b() {
        return this.f59903e.size();
    }

    @Override
    public final int d(int i7) {
        return ((a) this.f59903e.get(i7)).f56015a;
    }

    @Override
    public final void t(e1 e1Var, int i7) {
        boolean z10;
        int i10;
        int i11;
        long j3;
        boolean z11;
        int i12 = e1Var.f58539f;
        View view = e1Var.f58535a;
        a aVar = (a) this.f59903e.get(i7);
        if (i12 != 0) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
            if (i12 != 2) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        if (i12 != 7) {
                            String str = "";
                            switch (i12) {
                                case 9:
                                    yg.g gVar = (yg.g) view;
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat M0 = np.s1(m10.f24934t0).M0(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(M0, aVar.f59898i, aVar.f59897g, F(M0));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat M02 = np.s1(m10.f24934t0).M0(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(M02, aVar.f59898i, aVar.f59897g, F(M02));
                                        }
                                    } else {
                                        TLRPC.Chat chat = aVar.f59895e;
                                        gVar.f(chat, aVar.f59898i, aVar.f59897g, F(chat));
                                    }
                                    gVar.setChatDeleteListener(this.f59905n);
                                    return;
                                case 10:
                                    ((yg.h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    u uVar = (u) view;
                                    int i13 = aVar.f59901l;
                                    boolean z12 = aVar.f56016b;
                                    boolean z13 = aVar.f59897g;
                                    List list = (List) aVar.f59896f;
                                    TLRPC.Chat chat2 = this.f59908w;
                                    w3 w3Var = uVar.d;
                                    uVar.f60702s = i13;
                                    boolean V = t3.V(chat2);
                                    if (i13 == 0) {
                                        if (V) {
                                            i11 = 2131753598;
                                        } else {
                                            i11 = 2131753599;
                                        }
                                        w3Var.k(hd.a0(null, null, i11, new Object[0]));
                                    } else if (i13 == 1) {
                                        if (V) {
                                            i10 = 2131753336;
                                        } else {
                                            i10 = 2131753337;
                                        }
                                        w3Var.k(hd.a0(null, null, i10, new Object[0]));
                                    }
                                    uVar.f60647f.a(z12, false);
                                    uVar.setDivider(z13);
                                    q6.X(uVar.f60646e, j6.f29030n5, uVar.f60643a);
                                    if (list.size() == 0) {
                                        uVar.setSubtitle(uVar.e(hd.M0(2131753522, null)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries1", null, 2131753521, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries2", null, 2131753520, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            uVar.setSubtitle(uVar.e(hd.a0("BoostingFromAllCountries3", null, 2131753519, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        uVar.setSubtitle(uVar.e(hd.G(list.size(), "BoostingFromCountriesCount", new Object[0])));
                                        return;
                                    }
                                case 12:
                                    yg.i iVar = (yg.i) view;
                                    TLObject tLObject = aVar.f59902m;
                                    int i14 = aVar.f59898i;
                                    int i15 = aVar.f59899j;
                                    long j10 = aVar.h;
                                    CharSequence charSequence = aVar.f59894c;
                                    boolean z14 = aVar.f59897g;
                                    boolean z15 = aVar.f56016b;
                                    w3 w3Var2 = iVar.d;
                                    iVar.f60672w = tLObject;
                                    if (i14 >= 12) {
                                        w3Var2.k(hd.G(1, "Years", new Object[0]));
                                    } else {
                                        w3Var2.k(hd.G(i14, "Months", new Object[0]));
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    r1 i16 = r1.i();
                                    if (i15 > 0) {
                                        j3 = j10 / i15;
                                    } else {
                                        j3 = j10;
                                    }
                                    sb2.append(i16.f(j3, charSequence.toString()));
                                    sb2.append(" x ");
                                    sb2.append(i15);
                                    iVar.setSubtitle(sb2.toString());
                                    j5 j5Var = iVar.f60671s;
                                    r1 i17 = r1.i();
                                    if (i15 <= 0) {
                                        j10 = 0;
                                    }
                                    j5Var.l(i17.f(j10, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f60647f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f59894c);
                                    int i18 = aVar.f59898i;
                                    h6 h6Var = xVar.f60714r;
                                    if (i18 > 0) {
                                        str = hd.G(i18, "BoostingBoostsCountTitle", Integer.valueOf(i18));
                                    }
                                    h6Var.a();
                                    h6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((yg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f59896f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f59894c;
                                    boolean z16 = aVar.f56016b;
                                    boolean z17 = aVar.f59897g;
                                    yVar.L = aVar.f59901l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f59898i);
                                    lVar.setAfterTextChangedListener(this.f59907s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f59902m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i19 = aVar.f59898i;
                                    long j11 = aVar.h;
                                    boolean z18 = aVar.f56016b;
                                    TextView textView = wVar.f60709f;
                                    h6 h6Var2 = wVar.d;
                                    h6 h6Var3 = wVar.f60708e;
                                    if (wVar.f60711r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f60705a.a(z18, z11);
                                    wVar.f60711r = tL_starsGiveawayOption;
                                    if (z11) {
                                        h6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        h6Var2.c(wVar.h, false, true);
                                        h6Var3.c(wVar.f60710n, z11, true);
                                        textView.setText("");
                                    } else {
                                        h6Var2.c(hd.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                                        h6Var3.c(hd.H(',', "BoostingStarOptionPerUser", (int) j11), z11, true);
                                        textView.setText(r1.i().f(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i20 = i19 + 1;
                                    wVar.f60712s = i20;
                                    if (!z11) {
                                        wVar.f60713w.e(true, i20);
                                    }
                                    wVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        d0 d0Var = (d0) view;
                        d0Var.setText(aVar.f59894c);
                        d0Var.setBackground(aVar.f59897g);
                        return;
                    }
                    ((n4) view).setText(aVar.f59894c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f59900k;
                int i21 = aVar.f59898i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i22 = 0; i22 < list2.size(); i22++) {
                    strArr[i22] = String.valueOf((Integer) list2.get(i22));
                }
                vVar.f60703a.b(i21, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            yg.d dVar = (yg.d) view;
            int i23 = aVar.f59901l;
            int i24 = aVar.f59898i;
            TLRPC.User user = (TLRPC.User) aVar.f59896f;
            boolean z19 = aVar.f56016b;
            i9 i9Var = dVar.f60645c;
            e6 e6Var = dVar.f60643a;
            w3 w3Var3 = dVar.d;
            j5 j5Var2 = dVar.f60646e;
            t8 t8Var = dVar.f60644b;
            if (dVar.f60662s == i23) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f60662s = i23;
            if (i23 == 0) {
                w3Var3.k(hd.M0(2131753541, null));
                dVar.setSubtitle(hd.M0(2131753167, null));
                q6.X(j5Var2, j6.f29107r5, e6Var);
                t8Var.g(16);
                t8Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                q6.Z(dVar, dVar.getContext(), 2131231230, j6.f28813b7);
            } else if (i23 == 1) {
                w3Var3.k(hd.M0(2131753593, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(org.telegram.messenger.j6.m(q10.p(user), j5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(hd.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(hd.M0(2131753285, null)));
                }
                q6.X(j5Var2, j6.f29030n5, e6Var);
                t8Var.g(6);
                t8Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                q6.Z(dVar, dVar.getContext(), 2131231231, j6.f28813b7);
            } else if (i23 == 2) {
                w3Var3.k(hd.M0(2131753332, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(org.telegram.messenger.j6.m(q10.p(user), j5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(hd.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(hd.M0(2131753167, null)));
                }
                q6.X(j5Var2, j6.f29030n5, e6Var);
                t8Var.g(25);
                t8Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                q6.Z(dVar, dVar.getContext(), 2131231230, j6.f28813b7);
            } else if (i23 == 3) {
                w3Var3.k(l8.b(hd.M0(2131753257, null)));
                dVar.setSubtitle(hd.M0(2131753167, null));
                q6.X(j5Var2, j6.f29107r5, e6Var);
                t8Var.g(26);
                t8Var.i(-146917, -625593);
                dVar.setDivider(false);
                q6.Z(dVar, dVar.getContext(), 2131231231, j6.f28813b7);
            }
            dVar.f60647f.a(z19, z10);
            i9Var.setImageDrawable(t8Var);
            i9Var.setRoundRadius(g0.L(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f59906r = rVar;
        rVar.setBoostViaGifsText(this.f59908w);
        this.f59906r.setStars(aVar.f59897g);
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i7) {
        ua uaVar;
        boolean z10;
        Context context = viewGroup.getContext();
        e6 e6Var = this.d;
        switch (i7) {
            case 2:
                uaVar = new yg.d(context, e6Var);
                break;
            case 3:
                uaVar = new View(context);
                break;
            case 4:
                int i10 = j6.f28792a7;
                View x6Var = new x6(context, j6.w0(i10, e6Var), 0);
                q6.h(i10, x6Var, e6Var);
                uaVar = x6Var;
                break;
            case 5:
                uaVar = new v(context, e6Var);
                break;
            case 6:
                View n4Var = new n4(context, j6.L6, 21, 15, 3, false, false, this.d);
                q6.h(j6.f28922h5, n4Var, e6Var);
                uaVar = n4Var;
                break;
            case 7:
                uaVar = new d0(context, e6Var);
                break;
            case 8:
                uaVar = new yg.b(context, e6Var);
                break;
            case 9:
                uaVar = new yg.g(context, e6Var);
                break;
            case 10:
                uaVar = new yg.h(context, e6Var);
                break;
            case 11:
                yg.c cVar = new yg.c(context, e6Var);
                cVar.f60645c.setVisibility(8);
                uaVar = cVar;
                break;
            case 12:
                uaVar = new yg.i(context, e6Var);
                break;
            case 13:
                View xVar = new x(context, e6Var);
                q6.h(j6.f28922h5, xVar, e6Var);
                uaVar = xVar;
                break;
            case 14:
                uaVar = new yg.d(context, e6Var);
                break;
            case 15:
                q8 q8Var = new q8(context, e6Var);
                q8Var.setHeight(50);
                uaVar = q8Var;
                break;
            case 16:
                uaVar = new l(context, e6Var);
                break;
            case 17:
                uaVar = new w(context, e6Var);
                break;
            case 18:
                ua uaVar2 = new ua(context);
                String M0 = hd.M0(2131747836, null);
                if (uaVar2.f9547c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                uaVar2.f9547c = -1;
                h6 h6Var = uaVar2.f9545a;
                h6Var.c(M0, z10, true);
                int i11 = j6.f29049o6;
                j6.v0(i11);
                q6.Y(h6Var, i11, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = uaVar2.f9546b;
                q6.s(imageView, i11, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(er.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                uaVar2.d = false;
                uaVar2.setWillNotDraw(true);
                uaVar = uaVar2;
                break;
            default:
                uaVar = new r(context, e6Var);
                break;
        }
        return i5.c.q(uaVar, uaVar, -1, -2);
    }
}
