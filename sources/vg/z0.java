package vg;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bi.i3;
import bi.sc;
import bi.u3;
import fi.p1;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.l71;
import org.telegram.ui.lh0;
import org.telegram.ui.zg1;
public final class z0 extends bb {
    public final fi.d X;
    public final y0 Y;
    public final z3 Z;
    public final zg.c f50281a0;
    public final Paint f50282b0;
    public final ArrayList f50283c0;
    public final ArrayList f50284d0;
    public final HashSet f50285e0;
    public final HashSet f50286f0;
    public final ArrayList f50287g0;
    public final ArrayList f50288h0;
    public final HashMap f50289i0;
    public final ArrayList f50290j0;
    public final ArrayList f50291k0;
    public final LinkedHashMap f50292l0;
    public final h6 m0;
    public String f50293n0;
    public wg.h f50294o0;
    public int f50295p0;
    public final TLRPC.Chat f50296q0;
    public int f50297r0;
    public k f50298s0;
    public int f50299t0;
    public m f50300u0;
    public final cy0 f50301v0;

    public z0(r2 r2Var, long j10) {
        super(r2Var, false);
        this.f50282b0 = new Paint(1);
        this.f50283c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f50284d0 = arrayList;
        this.f50285e0 = new HashSet();
        this.f50286f0 = new HashSet();
        this.f50287g0 = new ArrayList();
        this.f50288h0 = new ArrayList();
        this.f50289i0 = new HashMap();
        this.f50290j0 = new ArrayList();
        this.f50291k0 = new ArrayList();
        this.f50292l0 = new LinkedHashMap();
        this.f50295p0 = AndroidUtilities.dp(134.0f);
        this.f50301v0 = new cy0(this, 16);
        this.backgroundPaddingLeft = 0;
        this.f50296q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        ds dsVar = ds.h;
        this.m0 = new h6(viewGroup, 0L, 350L, dsVar);
        zg.c cVar = new zg.c(getContext(), this.resourcesProvider);
        this.f50281a0 = cVar;
        cVar.setOnCloseClickListener(new t0(this, 7));
        cVar.setText(y());
        cVar.setCloseImageVisible(true);
        cVar.f52864f.c(0.0f, false);
        y0 y0Var = new y0(this, getContext(), this.resourcesProvider);
        this.Y = y0Var;
        int i10 = y6.f23427h5;
        f7.i(i10, y0Var, this.resourcesProvider);
        y0Var.setOnSearchTextChange(new w0(this, 0));
        this.Z = new z3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, gb1.j(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(y0Var, gb1.j(-2.0f, 55, i12, 0, i12, 0));
        sc scVar = new sc(getContext(), this.resourcesProvider, (mm0) null);
        scVar.setClickable(true);
        scVar.setOrientation(1);
        scVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        f7.i(i10, scVar, this.resourcesProvider);
        fi.d dVar = new fi.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new v0(this, 1));
        scVar.addView(dVar, gb1.u(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(scVar, gb1.j(-2.0f, 87, i13, 0, i13, 0));
        wg.h hVar = this.f50294o0;
        mm0 mm0Var = this.d;
        hVar.f51199n = arrayList;
        hVar.f51198f = mm0Var;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new ml(this, 25));
        this.d.setOnItemClickListener(new org.telegram.ui.Components.voip.j1(this, 28));
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(dsVar);
        lVar.C = false;
        lVar.f47763m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new p1(this, 8));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static void P(z0 z0Var, boolean z10, Pair pair) {
        HashMap hashMap = z0Var.f50289i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            z0Var.f50290j0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new u0(z0Var, 0));
        }
        if (z0Var.f50297r0 == 3) {
            z0Var.b0(true, true);
            z0Var.X(true);
        }
    }

    public static void Q(z0 z0Var, View view) {
        long j10;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = z0Var.f50292l0;
        y0 y0Var = z0Var.Y;
        HashSet hashSet = z0Var.f50285e0;
        if (view instanceof v8) {
            linkedHashMap.clear();
            z0Var.W(true);
        } else if (view instanceof zg.l) {
            zg.l lVar = (zg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user != null) {
                j10 = user.f22176id;
            } else {
                j10 = -chat.f22027id;
            }
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                Long valueOf = Long.valueOf(j10);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && z0Var.f50297r0 == 1) || (hashSet.size() == s.f() + 1 && z0Var.f50297r0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                z0Var.Y();
                return;
            }
            y0Var.b(true, hashSet, new t0(z0Var, 1), null);
            z0Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = z0Var.f26811n.getContext();
                u6 u6Var = z0Var.resourcesProvider;
                lh0 lh0Var = new lh0(z0Var, j10, 4);
                t0 t0Var = new t0(z0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f22368a.R = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f22368a.T = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new zg1(19, atomicBoolean, t0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new d(0));
                alertDialog$Builder.j(new u3(18, atomicBoolean, lh0Var));
                alertDialog$Builder.p();
            } else if (chat != null) {
                z0Var.R();
            }
        }
        if (view instanceof zg.b) {
            long hashCode = ((zg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && z0Var.f50297r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                z0Var.Y();
                return;
            }
            y0Var.b(true, hashSet, new t0(z0Var, 3), z0Var.f50291k0);
            if (!TextUtils.isEmpty(z0Var.f50293n0)) {
                z0Var.f50293n0 = null;
                y0Var.setText("");
                z0Var.b0(false, false);
                z0Var.b0(true, true);
                return;
            }
            z0Var.b0(true, false);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (c3.h0.t(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !vh.u(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || vh.u(" ", str, lowerCase2)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        y0 y0Var;
        boolean z10;
        this.f50299t0 = i10;
        zg.c cVar = this.f50281a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        this.Y.setTranslationY(translationY);
        this.d.setTranslationY((y0Var.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int w02 = y6.w0(y6.f23427h5, this.resourcesProvider);
        Paint paint = this.f50282b0;
        paint.setColor(w02);
        int max = Math.max(0, i10);
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        h6 h6Var = this.m0;
        int lerp = AndroidUtilities.lerp(max, 0, h6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - h6Var.f28811c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void R() {
        if (!TextUtils.isEmpty(this.f50293n0)) {
            this.f50293n0 = null;
            this.Y.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f50301v0);
            ArrayList arrayList = this.f50287g0;
            arrayList.clear();
            arrayList.addAll(s.e(this.f50296q0.f22027id));
            b0(false, false);
            b0(true, true);
        }
    }

    public final boolean S() {
        String string;
        HashSet hashSet = this.f50285e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f50286f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f50297r0;
        Context context = getContext();
        u6 u6Var = this.resourcesProvider;
        t0 t0Var = new t0(this, 0);
        t0 t0Var2 = new t0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        alertDialog$Builder.f22368a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = "";
                } else {
                    string = LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries);
                }
            } else {
                string = LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels);
            }
        } else {
            string = LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        }
        alertDialog$Builder.f22368a.T = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new org.telegram.ui.Components.voip.j1(t0Var, 27));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new org.telegram.ui.Components.voip.j1(t0Var2, 24));
        alertDialog$Builder.p();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f50296q0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                x0 x0Var = new x0(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
                    country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new bi.i0(x0Var, 24));
                return;
            }
            long j10 = chat.f22027id;
            w0 w0Var = new w0(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f22073q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new i3(messagesController, j10, w0Var, 7));
            return;
        }
        long j11 = chat.f22027id;
        x0 x0Var2 = new x0(this, z10, 0);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = messagesController2.getInputChannel(j11);
        if (str == null) {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsRecent();
        } else {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
        if (str == null) {
            str = "";
        }
        tL_channelParticipantsSearch.f22026q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new l71(11, messagesController2, x0Var2));
    }

    public final void V(int i10, List list) {
        long j10;
        this.f50297r0 = i10;
        this.f50293n0 = null;
        HashSet hashSet = this.f50286f0;
        hashSet.clear();
        HashSet hashSet2 = this.f50285e0;
        hashSet2.clear();
        ArrayList arrayList = this.f50287g0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f50292l0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(s.e(this.f50296q0.f22027id));
            }
        } else {
            arrayList.addAll(this.f50288h0);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if (tLObject instanceof TLRPC.TL_inputPeerChat) {
                    j10 = -((TLRPC.TL_inputPeerChat) tLObject).chat_id;
                } else {
                    j10 = 0;
                }
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j10 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).f22027id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f22176id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j10 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j10));
                linkedHashMap.put(Long.valueOf(j10), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        y0 y0Var = this.Y;
        y0Var.setText("");
        y0Var.d.b(false);
        y0Var.b(false, hashSet2, new t0(this, 4), this.f50291k0);
        c0();
        b0(false, true);
        this.f50281a0.setText(y());
        Z(false);
        X(false);
    }

    public final void W(boolean z10) {
        n nVar;
        HashSet hashSet = this.f50285e0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f50297r0;
            LinkedHashMap linkedHashMap = this.f50292l0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f50291k0;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                            if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                                arrayList.add(tL_help_country);
                            }
                        }
                        m mVar = this.f50300u0;
                        if (mVar != null) {
                            mVar.f50202c.f50207b.E(0);
                            a0 a0Var = mVar.f50200a;
                            ArrayList arrayList3 = a0Var.f50122e0;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            a0Var.a0(false, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (hashSet.contains(Long.valueOf(-chat.f22027id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                m mVar2 = this.f50300u0;
                if (mVar2 != null) {
                    mVar2.f50202c.f50207b.E(0);
                    a0 a0Var2 = mVar2.f50200a;
                    ArrayList arrayList5 = a0Var2.f50120c0;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    a0Var2.a0(!nVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f22176id))) {
                        arrayList6.add(user);
                    }
                }
            }
            m mVar3 = this.f50300u0;
            if (mVar3 != null) {
                mVar3.f50202c.f50207b.E(0);
                a0 a0Var3 = mVar3.f50200a;
                ArrayList arrayList7 = a0Var3.f50121d0;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = xg.d.v;
                    a0Var3.f50126i0 = 0;
                } else {
                    int i13 = xg.d.v;
                    a0Var3.f50126i0 = 1;
                }
                a0Var3.f50130n0 = 0;
                a0Var3.a0(false, true);
                a0Var3.Z(true);
                a0Var3.N();
            }
        }
    }

    public final void X(boolean z10) {
        mm0 mm0Var = this.d;
        if (z10) {
            mi.n nVar = new mi.n(getContext(), 2, 0.6f);
            nVar.f47680a = 1;
            nVar.f18556p = AndroidUtilities.dp(38.0f);
            mm0Var.getLayoutManager().w0(nVar);
            return;
        }
        mm0Var.v0(0);
    }

    public final void Y() {
        String string;
        int i10 = this.f50297r0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = "";
                } else {
                    string = LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                }
            } else {
                string = LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) s.f(), new Object[0]);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        m mVar = this.f50300u0;
        if (mVar != null) {
            new wc(mVar.f50202c.container, mVar.f50201b).R(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void Z(boolean z10) {
        String string;
        fi.d dVar = this.X;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f50297r0;
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.Save);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSaveRecipients);
        }
        dVar.i(string, z10, true);
        HashSet hashSet = this.f50285e0;
        dVar.b(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        wg.h hVar;
        ArrayList arrayList = this.f50283c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f50284d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f50297r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            wg.g gVar = new wg.g(9, false);
            gVar.f51188i = 1;
            gVar.f51189j = i11;
            gVar.f51187g = string;
            arrayList2.add(gVar);
        }
        wg.g gVar2 = new wg.g(10, false);
        z3 z3Var = this.Z;
        gVar2.f51196q = z3Var;
        arrayList2.add(gVar2);
        int i12 = this.f50297r0;
        HashSet hashSet = this.f50285e0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f50290j0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f50289i0.get(str)) {
                    if (TextUtils.isEmpty(this.f50293n0) || U(tL_help_country, AndroidUtilities.translitSafe(this.f50293n0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        wg.g gVar3 = new wg.g(6, true);
                        gVar3.f51186f = tL_help_country;
                        gVar3.f51190k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    wg.g gVar4 = new wg.g(7, false);
                    gVar4.f51187g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f50287g0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            wg.g gVar5 = new wg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.f51185c = null;
            gVar5.e = null;
            gVar5.f51190k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new wg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        wg.g gVar6 = new wg.g(-1, false);
        gVar6.f51191l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f50297r0 != 3) {
            z3Var.a(LocaleController.getString(R.string.UsersDeselectAll), new v0(this, 0));
        } else if (z10) {
            z3Var.setRightText(null);
        } else {
            y3 y3Var = z3Var.f25782b;
            y3Var.c(null, false, true);
            y3Var.setOnClickListener(null);
            y3Var.setVisibility(0);
        }
        if (z11 && (hVar = this.f50294o0) != null) {
            if (z10) {
                hVar.E(arrayList, arrayList2);
            } else {
                hVar.l();
            }
        }
    }

    public final void b0(boolean z10, boolean z11) {
        a0(z10, z11);
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.d;
            if (i10 < mm0Var.getChildCount()) {
                View childAt = mm0Var.getChildAt(i10);
                if (childAt instanceof zg.l) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.f50284d0;
                        if (R < arrayList.size()) {
                            wg.g gVar = (wg.g) arrayList.get(R);
                            zg.l lVar = (zg.l) childAt;
                            lVar.c(gVar.f51190k, z10);
                            TLRPC.Chat chat = gVar.e;
                            float f7 = 1.0f;
                            if (chat != null) {
                                if (this.f50294o0.F(chat) > 200) {
                                    f7 = 0.3f;
                                }
                                lVar.i(f7, z10);
                            } else {
                                lVar.i(1.0f, z10);
                            }
                        }
                    }
                    i10++;
                }
                if (childAt instanceof zg.b) {
                    zg.b bVar = (zg.b) childAt;
                    bVar.c(this.f50285e0.contains(Long.valueOf(bVar.getCountry().default_name.hashCode())), true);
                }
                i10++;
            } else {
                Z(z10);
                return;
            }
        }
    }

    public final void c0() {
        String str;
        String formatPluralStringComma;
        int i10 = this.f50297r0;
        z3 z3Var = this.Z;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    formatPluralStringComma = "";
                } else {
                    formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                    z3Var.setLayerHeight(1);
                }
            } else {
                formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) s.f(), new Object[0]);
                z3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f50296q0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f50294o0.F(chat) - 1));
            z3Var.setLayerHeight(32);
        }
        z3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        k kVar = this.f50298s0;
        if (kVar != null) {
            kVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f50301v0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        wg.h hVar = new wg.h(getContext(), this.resourcesProvider, true);
        this.f50294o0 = hVar;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f50297r0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "";
                }
                return LocaleController.getString(R.string.BoostingSelectCountry);
            }
            return LocaleController.getString(R.string.BoostingAddChannelOrGroup);
        }
        return LocaleController.getString(R.string.GiftPremium);
    }
}
