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
import bi.v7;
import com.google.android.gms.internal.vision.e2;
import di.r1;
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
import org.telegram.messenger.w1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.cj1;
import org.telegram.ui.o20;
import rg.p2;
import w7.x5;
public final class a1 extends bb {
    public final di.d X;
    public final z0 Y;
    public final u3 Z;
    public final yg.c f47071a0;
    public final Paint f47072b0;
    public final ArrayList f47073c0;
    public final ArrayList f47074d0;
    public final HashSet f47075e0;
    public final HashSet f47076f0;
    public final ArrayList f47077g0;
    public final ArrayList f47078h0;
    public final HashMap f47079i0;
    public final ArrayList f47080j0;
    public final ArrayList f47081k0;
    public final LinkedHashMap f47082l0;
    public final e6 m0;
    public String f47083n0;
    public vg.g f47084o0;
    public int f47085p0;
    public final TLRPC.Chat f47086q0;
    public int f47087r0;
    public k f47088s0;
    public int f47089t0;
    public m f47090u0;
    public final rg.b0 f47091v0;

    public a1(n2 n2Var, long j3) {
        super(n2Var, false);
        this.f47072b0 = new Paint(1);
        this.f47073c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f47074d0 = arrayList;
        this.f47075e0 = new HashSet();
        this.f47076f0 = new HashSet();
        this.f47077g0 = new ArrayList();
        this.f47078h0 = new ArrayList();
        this.f47079i0 = new HashMap();
        this.f47080j0 = new ArrayList();
        this.f47081k0 = new ArrayList();
        this.f47082l0 = new LinkedHashMap();
        this.f47085p0 = AndroidUtilities.dp(134.0f);
        this.f47091v0 = new rg.b0(this, 4);
        this.backgroundPaddingLeft = 0;
        this.f47086q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        ((ViewGroup) this.f24674e.getParent()).removeView(this.f24674e);
        ViewGroup viewGroup = this.containerView;
        pr prVar = pr.h;
        this.m0 = new e6(viewGroup, 0L, 350L, prVar);
        yg.c cVar = new yg.c(getContext(), this.resourcesProvider);
        this.f47071a0 = cVar;
        cVar.setOnCloseClickListener(new u0(this, 7));
        cVar.setText(y());
        cVar.setCloseImageVisible(true);
        cVar.f50194e.c(0.0f, false);
        z0 z0Var = new z0(this, getContext(), this.resourcesProvider);
        this.Y = z0Var;
        int i10 = j6.f20761h5;
        z0Var.setBackgroundColor(getThemedColor(i10));
        z0Var.setOnSearchTextChange(new x0(this, 0));
        this.Z = new u3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, x5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(z0Var, x5.f(-2.0f, 55, i12, 0, i12, 0));
        o20 o20Var = new o20(getContext(), this.resourcesProvider, (ll0) null);
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(j6.v0(i10, this.resourcesProvider));
        di.d dVar = new di.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new w0(this, 1));
        o20Var.addView(dVar, x5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(o20Var, x5.f(-2.0f, 87, i13, 0, i13, 0));
        vg.g gVar = this.f47084o0;
        ll0 ll0Var = this.d;
        gVar.f47853n = arrayList;
        gVar.f47852f = ll0Var;
        int i14 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new lb0(this, 13));
        this.d.setOnItemClickListener(new p2(this, 9));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(prVar);
        jVar.C = false;
        jVar.f45805m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new r1(this, 8));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static void P(a1 a1Var, boolean z10, Pair pair) {
        HashMap hashMap = a1Var.f47079i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            a1Var.f47080j0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new v0(a1Var, 0));
        }
        if (a1Var.f47087r0 == 3) {
            a1Var.b0(true, true);
            a1Var.X(true);
        }
    }

    public static void Q(a1 a1Var, View view) {
        long j3;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = a1Var.f47082l0;
        z0 z0Var = a1Var.Y;
        HashSet hashSet = a1Var.f47075e0;
        if (view instanceof r8) {
            linkedHashMap.clear();
            a1Var.W(true);
        } else if (view instanceof yg.l) {
            yg.l lVar = (yg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user != null) {
                j3 = user.f20043id;
            } else {
                j3 = -chat.f19896id;
            }
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                Long valueOf = Long.valueOf(j3);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && a1Var.f47087r0 == 1) || (hashSet.size() == t.f() + 1 && a1Var.f47087r0 == 2)) {
                hashSet.remove(Long.valueOf(j3));
                a1Var.Y();
                return;
            }
            z0Var.b(true, hashSet, new u0(a1Var, 1), null);
            a1Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j3))) {
                Context context = a1Var.f24676n.getContext();
                f6 f6Var = a1Var.resourcesProvider;
                bi.g gVar = new bi.g(a1Var, j3, 29);
                u0 u0Var = new u0(a1Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f20225a.R = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f20225a.T = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new sg.x(2, atomicBoolean, u0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new t0.a(5));
                alertDialog$Builder.j(new fi.e0(15, atomicBoolean, gVar));
                alertDialog$Builder.o();
            } else if (chat != null) {
                a1Var.R();
            }
        }
        if (view instanceof yg.b) {
            long hashCode = ((yg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && a1Var.f47087r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                a1Var.Y();
                return;
            }
            z0Var.b(true, hashSet, new u0(a1Var, 3), a1Var.f47081k0);
            if (!TextUtils.isEmpty(a1Var.f47083n0)) {
                a1Var.f47083n0 = null;
                z0Var.setText("");
                a1Var.b0(false, false);
                a1Var.b0(true, true);
                return;
            }
            a1Var.b0(true, false);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (e2.u(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !w1.w(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || w1.w(" ", str, lowerCase2)) {
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
        boolean z10;
        this.f47089t0 = i10;
        yg.c cVar = this.f47071a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        z0 z0Var = this.Y;
        z0Var.setTranslationY(translationY);
        this.d.setTranslationY((z0Var.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int v02 = j6.v0(j6.f20761h5, this.resourcesProvider);
        Paint paint = this.f47072b0;
        paint.setColor(v02);
        int max = Math.max(0, i10);
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        e6 e6Var = this.m0;
        int lerp = AndroidUtilities.lerp(max, 0, e6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - e6Var.f25592c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void R() {
        if (!TextUtils.isEmpty(this.f47083n0)) {
            this.f47083n0 = null;
            this.Y.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f47091v0);
            ArrayList arrayList = this.f47077g0;
            arrayList.clear();
            arrayList.addAll(t.e(this.f47086q0.f19896id));
            b0(false, false);
            b0(true, true);
        }
    }

    public final boolean S() {
        String string;
        HashSet hashSet = this.f47075e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f47076f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f47087r0;
        Context context = getContext();
        f6 f6Var = this.resourcesProvider;
        u0 u0Var = new u0(this, 0);
        u0 u0Var2 = new u0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.f20225a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
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
        alertDialog$Builder.f20225a.T = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new p2(u0Var, 8));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new p2(u0Var2, 5));
        alertDialog$Builder.o();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f47086q0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                y0 y0Var = new y0(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
                    country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new v7(y0Var, 21));
                return;
            }
            long j3 = chat.f19896id;
            x0 x0Var = new x0(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f19942q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new bi.l1(messagesController, j3, x0Var, 4));
            return;
        }
        long j10 = chat.f19896id;
        y0 y0Var2 = new y0(this, z10, 0);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = messagesController2.getInputChannel(j10);
        if (str == null) {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsRecent();
        } else {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
        if (str == null) {
            str = "";
        }
        tL_channelParticipantsSearch.f19895q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new cj1(2, messagesController2, y0Var2));
    }

    public final void V(int i10, List list) {
        long j3;
        this.f47087r0 = i10;
        this.f47083n0 = null;
        HashSet hashSet = this.f47076f0;
        hashSet.clear();
        HashSet hashSet2 = this.f47075e0;
        hashSet2.clear();
        ArrayList arrayList = this.f47077g0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f47082l0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(t.e(this.f47086q0.f19896id));
            }
        } else {
            arrayList.addAll(this.f47078h0);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if (tLObject instanceof TLRPC.TL_inputPeerChat) {
                    j3 = -((TLRPC.TL_inputPeerChat) tLObject).chat_id;
                } else {
                    j3 = 0;
                }
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j3 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) tLObject).f19896id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f20043id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j3 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j3));
                linkedHashMap.put(Long.valueOf(j3), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        z0 z0Var = this.Y;
        z0Var.setText("");
        z0Var.d.b(false);
        z0Var.b(false, hashSet2, new u0(this, 4), this.f47081k0);
        c0();
        b0(false, true);
        this.f47071a0.setText(y());
        Z(false);
        X(false);
    }

    public final void W(boolean z10) {
        HashSet hashSet = this.f47075e0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f47087r0;
            LinkedHashMap linkedHashMap = this.f47082l0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f47081k0;
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
                        m mVar = this.f47090u0;
                        if (mVar != null) {
                            mVar.f47178c.f47182b.D(0);
                            b0 b0Var = mVar.f47176a;
                            ArrayList arrayList3 = b0Var.f47100e0;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            b0Var.a0(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f19896id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                m mVar2 = this.f47090u0;
                if (mVar2 != null) {
                    n nVar = mVar2.f47178c;
                    nVar.f47182b.D(0);
                    b0 b0Var2 = mVar2.f47176a;
                    ArrayList arrayList5 = b0Var2.f47098c0;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    b0Var2.a0(!nVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f20043id))) {
                        arrayList6.add(user);
                    }
                }
            }
            m mVar3 = this.f47090u0;
            if (mVar3 != null) {
                mVar3.f47178c.f47182b.D(0);
                b0 b0Var3 = mVar3.f47176a;
                ArrayList arrayList7 = b0Var3.f47099d0;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = wg.d.f48551s;
                    b0Var3.f47104i0 = 0;
                } else {
                    int i13 = wg.d.f48551s;
                    b0Var3.f47104i0 = 1;
                }
                b0Var3.f47108n0 = 0;
                b0Var3.a0(false, true);
                b0Var3.Z(true);
                b0Var3.N();
            }
        }
    }

    public final void X(boolean z10) {
        ll0 ll0Var = this.d;
        if (z10) {
            ki.p pVar = new ki.p(getContext(), 2, 0.6f);
            pVar.f45934a = 1;
            pVar.f15068p = AndroidUtilities.dp(38.0f);
            ll0Var.getLayoutManager().w0(pVar);
            return;
        }
        ll0Var.u0(0);
    }

    public final void Y() {
        String string;
        int i10 = this.f47087r0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = "";
                } else {
                    string = LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                }
            } else {
                string = LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) t.f(), new Object[0]);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        m mVar = this.f47090u0;
        if (mVar != null) {
            new yc(mVar.f47178c.container, mVar.f47177b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void Z(boolean z10) {
        String string;
        di.d dVar = this.X;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f47087r0;
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
        HashSet hashSet = this.f47075e0;
        dVar.b(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        vg.g gVar;
        ArrayList arrayList = this.f47073c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f47074d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f47087r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            vg.f fVar = new vg.f(9, false);
            fVar.f47841i = 1;
            fVar.f47842j = i11;
            fVar.f47840g = string;
            arrayList2.add(fVar);
        }
        vg.f fVar2 = new vg.f(10, false);
        u3 u3Var = this.Z;
        fVar2.f47849q = u3Var;
        arrayList2.add(fVar2);
        int i12 = this.f47087r0;
        HashSet hashSet = this.f47075e0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f47080j0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f47079i0.get(str)) {
                    if (TextUtils.isEmpty(this.f47083n0) || U(tL_help_country, AndroidUtilities.translitSafe(this.f47083n0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        vg.f fVar3 = new vg.f(6, true);
                        fVar3.f47839f = tL_help_country;
                        fVar3.f47843k = contains;
                        arrayList4.add(fVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    vg.f fVar4 = new vg.f(7, false);
                    fVar4.f47840g = upperCase;
                    arrayList2.add(fVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f47077g0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            vg.f fVar5 = new vg.f(3, true);
            fVar5.d = inputPeer;
            fVar5.f47837c = null;
            fVar5.f47838e = null;
            fVar5.f47843k = contains2;
            arrayList2.add(fVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new vg.f(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        vg.f fVar6 = new vg.f(-1, false);
        fVar6.f47844l = max;
        arrayList2.add(fVar6);
        if (hashSet.size() > 0 && this.f47087r0 != 3) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new w0(this, 0));
        } else if (z10) {
            u3Var.setRightText(null);
        } else {
            t3 t3Var = u3Var.f23344b;
            t3Var.c(null, false, true);
            t3Var.setOnClickListener(null);
            t3Var.setVisibility(0);
        }
        if (z11 && (gVar = this.f47084o0) != null) {
            if (z10) {
                gVar.E(arrayList, arrayList2);
            } else {
                gVar.l();
            }
        }
    }

    public final void b0(boolean z10, boolean z11) {
        a0(z10, z11);
        int i10 = 0;
        while (true) {
            ll0 ll0Var = this.d;
            if (i10 < ll0Var.getChildCount()) {
                View childAt = ll0Var.getChildAt(i10);
                if (childAt instanceof yg.l) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.f47074d0;
                        if (R < arrayList.size()) {
                            vg.f fVar = (vg.f) arrayList.get(R);
                            yg.l lVar = (yg.l) childAt;
                            lVar.c(fVar.f47843k, z10);
                            TLRPC.Chat chat = fVar.f47838e;
                            float f7 = 1.0f;
                            if (chat != null) {
                                if (this.f47084o0.F(chat) > 200) {
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
                    bVar.c(this.f47075e0.contains(Long.valueOf(bVar.getCountry().default_name.hashCode())), true);
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
        int i10 = this.f47087r0;
        u3 u3Var = this.Z;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    formatPluralStringComma = "";
                } else {
                    formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                    u3Var.setLayerHeight(1);
                }
            } else {
                formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) t.f(), new Object[0]);
                u3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f47086q0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f47084o0.F(chat) - 1));
            u3Var.setLayerHeight(32);
        }
        u3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        k kVar = this.f47088s0;
        if (kVar != null) {
            kVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f47091v0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        vg.g gVar = new vg.g(getContext(), this.resourcesProvider, true);
        this.f47084o0 = gVar;
        return gVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f47087r0;
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
