package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ci.eb;
import ei.e4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.l10;
import org.telegram.messenger.qr;
import org.telegram.messenger.r1;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import u4.d1;
import xg.u;
import zg.d0;
import zg.i;
import zg.l;
import zg.r;
import zg.v;
import zg.w;
import zg.x;
import zg.y;
public final class b extends sg.b {
    public final e6 d;
    public tj0 f59432f;
    public u h;
    public u f59433n;
    public r f59434r;
    public u f59435s;
    public TLRPC.Chat f59436w;
    public ArrayList f59431e = new ArrayList();
    public final HashMap f59437x = new HashMap();

    public b(e6 e6Var) {
        this.d = e6Var;
        xg.d dVar = new xg.d(this, 3);
        qr a02 = qr.a0(h10.f22829t0);
        a02.f24934a.c(new u9.a(25, a02, dVar));
    }

    @Override
    public final boolean D(d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 2 && i3 != 11 && i3 != 8 && i3 != 10 && i3 != 15 && i3 != 12 && i3 != 17 && i3 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i3;
        TLRPC.ChatFull N0 = hp.s1(h10.f22829t0).N0(chat.f27001id);
        if (N0 != null && (i3 = N0.participants_count) > 0) {
            return i3;
        }
        HashMap hashMap = this.f59437x;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f27001id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i3 = 0; i3 < this.f59431e.size(); i3++) {
            if (((a) this.f59431e.get(i3)).f54715a == 7) {
                g(i3);
            }
        }
    }

    @Override
    public final int b() {
        return this.f59431e.size();
    }

    @Override
    public final int d(int i3) {
        return ((a) this.f59431e.get(i3)).f54715a;
    }

    @Override
    public final void t(d1 d1Var, int i3) {
        boolean z10;
        int i10;
        int i11;
        long j10;
        boolean z11;
        int i12 = d1Var.f55544f;
        View view = d1Var.f55540a;
        a aVar = (a) this.f59431e.get(i3);
        if (i12 != 0) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
            if (i12 != 2) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        if (i12 != 7) {
                            String str = "";
                            switch (i12) {
                                case 9:
                                    zg.g gVar = (zg.g) view;
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat M0 = hp.s1(h10.f22829t0).M0(Long.valueOf(inputPeer.chat_id));
                                            gVar.f(M0, aVar.f59426i, aVar.f59425g, F(M0));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat M02 = hp.s1(h10.f22829t0).M0(Long.valueOf(inputPeer.channel_id));
                                            gVar.f(M02, aVar.f59426i, aVar.f59425g, F(M02));
                                        }
                                    } else {
                                        TLRPC.Chat chat = aVar.f59423e;
                                        gVar.f(chat, aVar.f59426i, aVar.f59425g, F(chat));
                                    }
                                    gVar.setChatDeleteListener(this.f59433n);
                                    return;
                                case 10:
                                    ((zg.h) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    zg.u uVar = (zg.u) view;
                                    int i13 = aVar.f59429l;
                                    boolean z12 = aVar.f54716b;
                                    boolean z13 = aVar.f59425g;
                                    List list = (List) aVar.f59424f;
                                    TLRPC.Chat chat2 = this.f59436w;
                                    e4 e4Var = uVar.d;
                                    uVar.f60531s = i13;
                                    boolean V = t3.V(chat2);
                                    if (i13 == 0) {
                                        if (V) {
                                            i11 = 2131753598;
                                        } else {
                                            i11 = 2131753599;
                                        }
                                        e4Var.k(bd.a0(null, null, i11, new Object[0]));
                                    } else if (i13 == 1) {
                                        if (V) {
                                            i10 = 2131753336;
                                        } else {
                                            i10 = 2131753337;
                                        }
                                        e4Var.k(bd.a0(null, null, i10, new Object[0]));
                                    }
                                    uVar.f60476f.a(z12, false);
                                    uVar.setDivider(z13);
                                    r6.Y(uVar.f60475e, k6.f28061n5, uVar.f60472a);
                                    if (list.size() == 0) {
                                        uVar.setSubtitle(uVar.e(bd.M0(2131753522, null)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            uVar.setSubtitle(uVar.e(bd.a0("BoostingFromAllCountries1", null, 2131753521, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            uVar.setSubtitle(uVar.e(bd.a0("BoostingFromAllCountries2", null, 2131753520, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            uVar.setSubtitle(uVar.e(bd.a0("BoostingFromAllCountries3", null, 2131753519, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        uVar.setSubtitle(uVar.e(bd.G(list.size(), "BoostingFromCountriesCount", new Object[0])));
                                        return;
                                    }
                                case 12:
                                    i iVar = (i) view;
                                    TLObject tLObject = aVar.f59430m;
                                    int i14 = aVar.f59426i;
                                    int i15 = aVar.f59427j;
                                    long j11 = aVar.h;
                                    CharSequence charSequence = aVar.f59422c;
                                    boolean z14 = aVar.f59425g;
                                    boolean z15 = aVar.f54716b;
                                    e4 e4Var2 = iVar.d;
                                    iVar.f60501w = tLObject;
                                    if (i14 >= 12) {
                                        e4Var2.k(bd.G(1, "Years", new Object[0]));
                                    } else {
                                        e4Var2.k(bd.G(i14, "Months", new Object[0]));
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    r1 i16 = r1.i();
                                    if (i15 > 0) {
                                        j10 = j11 / i15;
                                    } else {
                                        j10 = j11;
                                    }
                                    sb2.append(i16.f(j10, charSequence.toString()));
                                    sb2.append(" x ");
                                    sb2.append(i15);
                                    iVar.setSubtitle(sb2.toString());
                                    k5 k5Var = iVar.f60500s;
                                    r1 i17 = r1.i();
                                    if (i15 <= 0) {
                                        j11 = 0;
                                    }
                                    k5Var.l(i17.f(j11, charSequence.toString()), false);
                                    iVar.setDivider(z14);
                                    iVar.f60476f.a(z15, false);
                                    return;
                                case 13:
                                    x xVar = (x) view;
                                    xVar.setText(aVar.f59422c);
                                    int i18 = aVar.f59426i;
                                    h6 h6Var = xVar.f60543r;
                                    if (i18 > 0) {
                                        str = bd.G(i18, "BoostingBoostsCountTitle", Integer.valueOf(i18));
                                    }
                                    h6Var.a();
                                    h6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((zg.e) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f59424f);
                                    return;
                                case 15:
                                    y yVar = (y) view;
                                    CharSequence charSequence2 = aVar.f59422c;
                                    boolean z16 = aVar.f54716b;
                                    boolean z17 = aVar.f59425g;
                                    yVar.L = aVar.f59429l;
                                    yVar.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    l lVar = (l) view;
                                    lVar.setCount(aVar.f59426i);
                                    lVar.setAfterTextChangedListener(this.f59435s);
                                    return;
                                case 17:
                                    w wVar = (w) view;
                                    TLObject tLObject2 = aVar.f59430m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i19 = aVar.f59426i;
                                    long j12 = aVar.h;
                                    boolean z18 = aVar.f54716b;
                                    TextView textView = wVar.f60538f;
                                    h6 h6Var2 = wVar.d;
                                    h6 h6Var3 = wVar.f60537e;
                                    if (wVar.f60540r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    wVar.f60534a.a(z18, z11);
                                    wVar.f60540r = tL_starsGiveawayOption;
                                    if (z11) {
                                        h6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        h6Var2.c(wVar.h, false, true);
                                        h6Var3.c(wVar.f60539n, z11, true);
                                        textView.setText("");
                                    } else {
                                        h6Var2.c(bd.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                                        h6Var3.c(bd.H(',', "BoostingStarOptionPerUser", (int) j12), z11, true);
                                        textView.setText(r1.i().f(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i20 = i19 + 1;
                                    wVar.f60541s = i20;
                                    if (!z11) {
                                        wVar.f60542w.e(true, i20);
                                    }
                                    wVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        d0 d0Var = (d0) view;
                        d0Var.setText(aVar.f59422c);
                        d0Var.setBackground(aVar.f59425g);
                        return;
                    }
                    ((n4) view).setText(aVar.f59422c);
                    return;
                }
                v vVar = (v) view;
                List list2 = aVar.f59428k;
                int i21 = aVar.f59426i;
                vVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i22 = 0; i22 < list2.size(); i22++) {
                    strArr[i22] = String.valueOf((Integer) list2.get(i22));
                }
                vVar.f60532a.b(i21, null, strArr);
                vVar.setCallBack(this.h);
                return;
            }
            zg.d dVar = (zg.d) view;
            int i23 = aVar.f59429l;
            int i24 = aVar.f59426i;
            TLRPC.User user = (TLRPC.User) aVar.f59424f;
            boolean z19 = aVar.f54716b;
            k9 k9Var = dVar.f60474c;
            e6 e6Var = dVar.f60472a;
            e4 e4Var3 = dVar.d;
            k5 k5Var2 = dVar.f60475e;
            u8 u8Var = dVar.f60473b;
            if (dVar.f60491s == i23) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f60491s = i23;
            if (i23 == 0) {
                e4Var3.k(bd.M0(2131753541, null));
                dVar.setSubtitle(bd.M0(2131753167, null));
                r6.Y(k5Var2, k6.r5, e6Var);
                u8Var.g(16);
                u8Var.i(-15292942, -15630089);
                dVar.setDivider(true);
                r6.a0(dVar, dVar.getContext(), 2131231230, k6.f27843b7);
            } else if (i23 == 1) {
                e4Var3.k(bd.M0(2131753593, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(i6.m(l10.p(user), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(bd.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(bd.M0(2131753285, null)));
                }
                r6.Y(k5Var2, k6.f28061n5, e6Var);
                u8Var.g(6);
                u8Var.i(-3905294, -6923014);
                dVar.setDivider(false);
                r6.a0(dVar, dVar.getContext(), 2131231231, k6.f27843b7);
            } else if (i23 == 2) {
                e4Var3.k(bd.M0(2131753332, null));
                if (i24 == 1 && user != null) {
                    dVar.setSubtitle(dVar.e(i6.m(l10.p(user), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i24 > 0) {
                    dVar.setSubtitle(dVar.e(bd.G(i24, "Recipient", new Object[0])));
                } else {
                    dVar.setSubtitle(dVar.e(bd.M0(2131753167, null)));
                }
                r6.Y(k5Var2, k6.f28061n5, e6Var);
                u8Var.g(25);
                u8Var.i(-3905294, -6923014);
                dVar.setDivider(true);
                r6.a0(dVar, dVar.getContext(), 2131231230, k6.f27843b7);
            } else if (i23 == 3) {
                e4Var3.k(l8.b(bd.M0(2131753257, null)));
                dVar.setSubtitle(bd.M0(2131753167, null));
                r6.Y(k5Var2, k6.r5, e6Var);
                u8Var.g(26);
                u8Var.i(-146917, -625593);
                dVar.setDivider(false);
                r6.a0(dVar, dVar.getContext(), 2131231231, k6.f27843b7);
            }
            dVar.f60476f.a(z19, z10);
            k9Var.setImageDrawable(u8Var);
            k9Var.setRoundRadius(g0.L(20.0f));
            return;
        }
        r rVar = (r) view;
        this.f59434r = rVar;
        rVar.setBoostViaGifsText(this.f59436w);
        this.f59434r.setStars(aVar.f59425g);
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i3) {
        eb ebVar;
        boolean z10;
        Context context = viewGroup.getContext();
        e6 e6Var = this.d;
        switch (i3) {
            case 2:
                ebVar = new zg.d(context, e6Var);
                break;
            case 3:
                ebVar = new View(context);
                break;
            case 4:
                int i10 = k6.f27824a7;
                View x6Var = new x6(context, k6.w0(i10, e6Var), 0);
                r6.i(i10, x6Var, e6Var);
                ebVar = x6Var;
                break;
            case 5:
                ebVar = new v(context, e6Var);
                break;
            case 6:
                View n4Var = new n4(context, k6.L6, 21, 15, 3, false, false, this.d);
                r6.i(k6.f27954h5, n4Var, e6Var);
                ebVar = n4Var;
                break;
            case 7:
                ebVar = new d0(context, e6Var);
                break;
            case 8:
                ebVar = new zg.b(context, e6Var);
                break;
            case 9:
                ebVar = new zg.g(context, e6Var);
                break;
            case 10:
                ebVar = new zg.h(context, e6Var);
                break;
            case 11:
                zg.c cVar = new zg.c(context, e6Var);
                cVar.f60474c.setVisibility(8);
                ebVar = cVar;
                break;
            case 12:
                ebVar = new i(context, e6Var);
                break;
            case 13:
                View xVar = new x(context, e6Var);
                r6.i(k6.f27954h5, xVar, e6Var);
                ebVar = xVar;
                break;
            case 14:
                ebVar = new zg.d(context, e6Var);
                break;
            case 15:
                q8 q8Var = new q8(context, e6Var);
                q8Var.setHeight(50);
                ebVar = q8Var;
                break;
            case 16:
                ebVar = new l(context, e6Var);
                break;
            case 17:
                ebVar = new w(context, e6Var);
                break;
            case 18:
                eb ebVar2 = new eb(context);
                String M0 = bd.M0(2131747844, null);
                if (ebVar2.f5056c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ebVar2.f5056c = -1;
                h6 h6Var = ebVar2.f5054a;
                h6Var.c(M0, z10, true);
                int i11 = k6.f28081o6;
                k6.v0(i11);
                r6.Z(h6Var, i11, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = ebVar2.f5055b;
                r6.t(imageView, i11, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(xq.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                ebVar2.d = false;
                ebVar2.setWillNotDraw(true);
                ebVar = ebVar2;
                break;
            default:
                ebVar = new r(context, e6Var);
                break;
        }
        return p1.p(ebVar, ebVar, -1, -2);
    }
}
