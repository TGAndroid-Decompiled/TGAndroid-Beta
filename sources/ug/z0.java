package ug;

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
import bi.z7;
import com.google.android.gms.internal.play_billing.k3;
import di.q1;
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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.lj1;
import org.telegram.ui.s20;
import w7.a6;
public final class z0 extends db {
    public final di.d X;
    public final y0 Y;
    public final v3 Z;
    public final yg.c f46414a0;
    public final Paint f46415b0;
    public final ArrayList f46416c0;
    public final ArrayList f46417d0;
    public final HashSet f46418e0;
    public final HashSet f46419f0;
    public final ArrayList f46420g0;
    public final ArrayList f46421h0;
    public final HashMap f46422i0;
    public final ArrayList f46423j0;
    public final ArrayList f46424k0;
    public final LinkedHashMap f46425l0;
    public final g6 m0;
    public String f46426n0;
    public vg.h f46427o0;
    public int f46428p0;
    public final TLRPC.Chat f46429q0;
    public int f46430r0;
    public k f46431s0;
    public int f46432t0;
    public m f46433u0;
    public final m5 f46434v0;

    public z0(m2 m2Var, long j10) {
        super(m2Var, false);
        this.f46415b0 = new Paint(1);
        this.f46416c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f46417d0 = arrayList;
        this.f46418e0 = new HashSet();
        this.f46419f0 = new HashSet();
        this.f46420g0 = new ArrayList();
        this.f46421h0 = new ArrayList();
        this.f46422i0 = new HashMap();
        this.f46423j0 = new ArrayList();
        this.f46424k0 = new ArrayList();
        this.f46425l0 = new LinkedHashMap();
        this.f46428p0 = AndroidUtilities.dp(134.0f);
        this.f46434v0 = new m5(this, 8);
        this.backgroundPaddingLeft = 0;
        this.f46429q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        es esVar = es.h;
        this.m0 = new g6(viewGroup, 0L, 350L, esVar);
        yg.c cVar = new yg.c(getContext(), this.resourcesProvider);
        this.f46414a0 = cVar;
        cVar.setOnCloseClickListener(new t0(this, 7));
        cVar.setText(A());
        cVar.setCloseImageVisible(true);
        cVar.e.c(0.0f, false);
        y0 y0Var = new y0(this, getContext(), this.resourcesProvider);
        this.Y = y0Var;
        int i10 = org.telegram.ui.ActionBar.g6.f19972h5;
        y0Var.setBackgroundColor(getThemedColor(i10));
        y0Var.setOnSearchTextChange(new w0(this, 0));
        this.Z = new v3(getContext(), this.resourcesProvider);
        d0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, a6.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(y0Var, a6.f(-2.0f, 55, i12, 0, i12, 0));
        s20 s20Var = new s20(getContext(), this.resourcesProvider, (mm0) null);
        s20Var.setClickable(true);
        s20Var.setOrientation(1);
        s20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        s20Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i10, this.resourcesProvider));
        di.d dVar = new di.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new v0(this, 1));
        s20Var.addView(dVar, a6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(s20Var, a6.f(-2.0f, 87, i13, 0, i13, 0));
        vg.h hVar = this.f46427o0;
        mm0 mm0Var = this.d;
        hVar.f46990n = arrayList;
        hVar.f46989f = mm0Var;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new kc0(this, 16));
        this.d.setOnItemClickListener(new rg.b0(this, 14));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(esVar);
        kVar.C = false;
        kVar.f44872m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new q1(this, 8));
        c0(false, true);
        U(1, null, true);
        U(3, null, true);
    }

    public static void Q(z0 z0Var, boolean z10, Pair pair) {
        HashMap hashMap = z0Var.f46422i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            z0Var.f46423j0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new u0(z0Var, 0));
        }
        if (z0Var.f46430r0 == 3) {
            z0Var.c0(true, true);
            z0Var.Y(true);
        }
    }

    public static void R(z0 z0Var, View view) {
        long j10;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = z0Var.f46425l0;
        y0 y0Var = z0Var.Y;
        HashSet hashSet = z0Var.f46418e0;
        if (view instanceof r8) {
            linkedHashMap.clear();
            z0Var.X(true);
        } else if (view instanceof yg.l) {
            yg.l lVar = (yg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user != null) {
                j10 = user.f19363id;
            } else {
                j10 = -chat.f19216id;
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
            if ((hashSet.size() == 11 && z0Var.f46430r0 == 1) || (hashSet.size() == s.f() + 1 && z0Var.f46430r0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                z0Var.Z();
                return;
            }
            y0Var.b(true, hashSet, new t0(z0Var, 1), null);
            z0Var.c0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = z0Var.f24345n.getContext();
                c6 c6Var = z0Var.resourcesProvider;
                org.telegram.ui.web.e0 e0Var = new org.telegram.ui.web.e0(z0Var, j10, 2);
                t0 t0Var = new t0(z0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f19548a.R = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f19548a.T = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new org.telegram.ui.web.c0(11, atomicBoolean, t0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new t0.a(8));
                alertDialog$Builder.j(new fi.d0(16, atomicBoolean, e0Var));
                alertDialog$Builder.o();
            } else if (chat != null) {
                z0Var.S();
            }
        }
        if (view instanceof yg.b) {
            long hashCode = ((yg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && z0Var.f46430r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                z0Var.Z();
                return;
            }
            y0Var.b(true, hashSet, new t0(z0Var, 3), z0Var.f46424k0);
            if (!TextUtils.isEmpty(z0Var.f46426n0)) {
                z0Var.f46426n0 = null;
                y0Var.setText("");
                z0Var.c0(false, false);
                z0Var.c0(true, true);
                return;
            }
            z0Var.c0(true, false);
        }
    }

    public static boolean V(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (k3.s(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !yh.v(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || yh.v(" ", str, lowerCase2)) {
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
    public final CharSequence A() {
        int i10 = this.f46430r0;
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

    @Override
    public final void E(Canvas canvas, int i10) {
        y0 y0Var;
        boolean z10;
        this.f46432t0 = i10;
        yg.c cVar = this.f46414a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        this.Y.setTranslationY(translationY);
        this.d.setTranslationY((y0Var.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, this.resourcesProvider);
        Paint paint = this.f46415b0;
        paint.setColor(w02);
        int max = Math.max(0, i10);
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        g6 g6Var = this.m0;
        int lerp = AndroidUtilities.lerp(max, 0, g6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - g6Var.f25190c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void S() {
        if (!TextUtils.isEmpty(this.f46426n0)) {
            this.f46426n0 = null;
            this.Y.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f46434v0);
            ArrayList arrayList = this.f46420g0;
            arrayList.clear();
            arrayList.addAll(s.e(this.f46429q0.f19216id));
            c0(false, false);
            c0(true, true);
        }
    }

    public final boolean T() {
        String string;
        HashSet hashSet = this.f46418e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f46419f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f46430r0;
        Context context = getContext();
        c6 c6Var = this.resourcesProvider;
        t0 t0Var = new t0(this, 0);
        t0 t0Var2 = new t0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        alertDialog$Builder.f19548a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
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
        alertDialog$Builder.f19548a.T = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new rg.b0(t0Var, 13));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new rg.b0(t0Var2, 10));
        alertDialog$Builder.o();
        return true;
    }

    public final void U(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f46429q0;
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
                connectionsManager.sendRequest(tL_help_getCountriesList, new z7(x0Var, 19));
                return;
            }
            long j10 = chat.f19216id;
            w0 w0Var = new w0(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f19262q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new bi.l1(messagesController, j10, w0Var, 4));
            return;
        }
        long j11 = chat.f19216id;
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
        tL_channelParticipantsSearch.f19215q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new lj1(2, messagesController2, x0Var2));
    }

    public final void W(int i10, List list) {
        long j10;
        this.f46430r0 = i10;
        this.f46426n0 = null;
        HashSet hashSet = this.f46419f0;
        hashSet.clear();
        HashSet hashSet2 = this.f46418e0;
        hashSet2.clear();
        ArrayList arrayList = this.f46420g0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f46425l0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(s.e(this.f46429q0.f19216id));
            }
        } else {
            arrayList.addAll(this.f46421h0);
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
                    j10 = -((TLRPC.Chat) tLObject).f19216id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f19363id;
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
        y0Var.b(false, hashSet2, new t0(this, 4), this.f46424k0);
        d0();
        c0(false, true);
        this.f46414a0.setText(A());
        a0(false);
        Y(false);
    }

    public final void X(boolean z10) {
        n nVar;
        HashSet hashSet = this.f46418e0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f46430r0;
            LinkedHashMap linkedHashMap = this.f46425l0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f46424k0;
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
                        m mVar = this.f46433u0;
                        if (mVar != null) {
                            mVar.f46338c.f46365b.D(0);
                            a0 a0Var = mVar.f46336a;
                            ArrayList arrayList3 = a0Var.f46258e0;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            a0Var.b0(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f19216id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                m mVar2 = this.f46433u0;
                if (mVar2 != null) {
                    mVar2.f46338c.f46365b.D(0);
                    a0 a0Var2 = mVar2.f46336a;
                    ArrayList arrayList5 = a0Var2.f46256c0;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    a0Var2.b0(!nVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f19363id))) {
                        arrayList6.add(user);
                    }
                }
            }
            m mVar3 = this.f46433u0;
            if (mVar3 != null) {
                mVar3.f46338c.f46365b.D(0);
                a0 a0Var3 = mVar3.f46336a;
                ArrayList arrayList7 = a0Var3.f46257d0;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = wg.d.v;
                    a0Var3.f46262i0 = 0;
                } else {
                    int i13 = wg.d.v;
                    a0Var3.f46262i0 = 1;
                }
                a0Var3.f46266n0 = 0;
                a0Var3.b0(false, true);
                a0Var3.a0(true);
                a0Var3.O();
            }
        }
    }

    public final void Y(boolean z10) {
        mm0 mm0Var = this.d;
        if (z10) {
            ki.o oVar = new ki.o(getContext(), 2, 0.6f);
            oVar.f44979a = 1;
            oVar.f14352p = AndroidUtilities.dp(38.0f);
            mm0Var.getLayoutManager().w0(oVar);
            return;
        }
        mm0Var.u0(0);
    }

    public final void Z() {
        String string;
        int i10 = this.f46430r0;
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
        m mVar = this.f46433u0;
        if (mVar != null) {
            new zc(mVar.f46338c.container, mVar.f46337b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void a0(boolean z10) {
        String string;
        di.d dVar = this.X;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f46430r0;
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.Save);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSaveRecipients);
        }
        dVar.g(string, z10, true);
        HashSet hashSet = this.f46418e0;
        dVar.b(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void b0(boolean z10, boolean z11) {
        int i10;
        vg.h hVar;
        ArrayList arrayList = this.f46416c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f46417d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f46430r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            vg.g gVar = new vg.g(9, false);
            gVar.f46979i = 1;
            gVar.f46980j = i11;
            gVar.f46978g = string;
            arrayList2.add(gVar);
        }
        vg.g gVar2 = new vg.g(10, false);
        v3 v3Var = this.Z;
        gVar2.f46987q = v3Var;
        arrayList2.add(gVar2);
        int i12 = this.f46430r0;
        HashSet hashSet = this.f46418e0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f46423j0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f46422i0.get(str)) {
                    if (TextUtils.isEmpty(this.f46426n0) || V(tL_help_country, AndroidUtilities.translitSafe(this.f46426n0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        vg.g gVar3 = new vg.g(6, true);
                        gVar3.f46977f = tL_help_country;
                        gVar3.f46981k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    vg.g gVar4 = new vg.g(7, false);
                    gVar4.f46978g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f46420g0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            vg.g gVar5 = new vg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.f46976c = null;
            gVar5.e = null;
            gVar5.f46981k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new vg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        vg.g gVar6 = new vg.g(-1, false);
        gVar6.f46982l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f46430r0 != 3) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new v0(this, 0));
        } else if (z10) {
            v3Var.setRightText(null);
        } else {
            u3 u3Var = v3Var.f22562b;
            u3Var.c(null, false, true);
            u3Var.setOnClickListener(null);
            u3Var.setVisibility(0);
        }
        if (z11 && (hVar = this.f46427o0) != null) {
            if (z10) {
                hVar.E(arrayList, arrayList2);
            } else {
                hVar.l();
            }
        }
    }

    public final void c0(boolean z10, boolean z11) {
        b0(z10, z11);
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.d;
            if (i10 < mm0Var.getChildCount()) {
                View childAt = mm0Var.getChildAt(i10);
                if (childAt instanceof yg.l) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.f46417d0;
                        if (R < arrayList.size()) {
                            vg.g gVar = (vg.g) arrayList.get(R);
                            yg.l lVar = (yg.l) childAt;
                            lVar.c(gVar.f46981k, z10);
                            TLRPC.Chat chat = gVar.e;
                            float f7 = 1.0f;
                            if (chat != null) {
                                if (this.f46427o0.F(chat) > 200) {
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
                if (childAt instanceof yg.b) {
                    yg.b bVar = (yg.b) childAt;
                    bVar.c(this.f46418e0.contains(Long.valueOf(bVar.getCountry().default_name.hashCode())), true);
                }
                i10++;
            } else {
                a0(z10);
                return;
            }
        }
    }

    public final void d0() {
        String str;
        String formatPluralStringComma;
        int i10 = this.f46430r0;
        v3 v3Var = this.Z;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    formatPluralStringComma = "";
                } else {
                    formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                    v3Var.setLayerHeight(1);
                }
            } else {
                formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) s.f(), new Object[0]);
                v3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f46429q0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f46427o0.F(chat) - 1));
            v3Var.setLayerHeight(32);
        }
        v3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        k kVar = this.f46431s0;
        if (kVar != null) {
            kVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f46434v0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b0(false, true);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, true);
        this.f46427o0 = hVar;
        return hVar;
    }
}
