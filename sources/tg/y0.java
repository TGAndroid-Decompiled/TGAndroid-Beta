package tg;

import ai.o8;
import ai.u1;
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
import ci.q1;
import com.google.android.gms.internal.vision.e2;
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
import org.telegram.messenger.ai;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.cj1;
import org.telegram.ui.l20;
import w7.x5;
public final class y0 extends db {
    public final ci.d X;
    public final x0 Y;
    public final v3 Z;
    public final xg.c f48498a0;
    public final Paint f48499b0;
    public final ArrayList f48500c0;
    public final ArrayList f48501d0;
    public final HashSet f48502e0;
    public final HashSet f48503f0;
    public final ArrayList f48504g0;
    public final ArrayList f48505h0;
    public final HashMap f48506i0;
    public final ArrayList f48507j0;
    public final ArrayList f48508k0;
    public final LinkedHashMap f48509l0;
    public final g6 m0;
    public String f48510n0;
    public ug.h f48511o0;
    public int f48512p0;
    public final TLRPC.Chat f48513q0;
    public int f48514r0;
    public j f48515s0;
    public int f48516t0;
    public l f48517u0;
    public final p5 f48518v0;

    public y0(m2 m2Var, long j3) {
        super(m2Var, false);
        this.f48499b0 = new Paint(1);
        this.f48500c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f48501d0 = arrayList;
        this.f48502e0 = new HashSet();
        this.f48503f0 = new HashSet();
        this.f48504g0 = new ArrayList();
        this.f48505h0 = new ArrayList();
        this.f48506i0 = new HashMap();
        this.f48507j0 = new ArrayList();
        this.f48508k0 = new ArrayList();
        this.f48509l0 = new LinkedHashMap();
        this.f48512p0 = AndroidUtilities.dp(134.0f);
        this.f48518v0 = new p5(this, 7);
        this.backgroundPaddingLeft = 0;
        this.f48513q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        ((ViewGroup) this.f25521e.getParent()).removeView(this.f25521e);
        ViewGroup viewGroup = this.containerView;
        is isVar = is.h;
        this.m0 = new g6(viewGroup, 0L, 350L, isVar);
        xg.c cVar = new xg.c(getContext(), this.resourcesProvider);
        this.f48498a0 = cVar;
        cVar.setOnCloseClickListener(new s0(this, 7));
        cVar.setText(B());
        cVar.setCloseImageVisible(true);
        cVar.f51216e.c(0.0f, false);
        x0 x0Var = new x0(this, getContext(), this.resourcesProvider);
        this.Y = x0Var;
        int i10 = h6.f20857h5;
        x0Var.setBackgroundColor(getThemedColor(i10));
        x0Var.setOnSearchTextChange(new v0(this, 0));
        this.Z = new v3(getContext(), this.resourcesProvider);
        d0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, x5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(x0Var, x5.f(-2.0f, 55, i12, 0, i12, 0));
        l20 l20Var = new l20(getContext(), this.resourcesProvider, (sm0) null);
        l20Var.setClickable(true);
        l20Var.setOrientation(1);
        l20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        l20Var.setBackgroundColor(h6.w0(i10, this.resourcesProvider));
        ci.d dVar = new ci.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new u0(this, 1));
        l20Var.addView(dVar, x5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(l20Var, x5.f(-2.0f, 87, i13, 0, i13, 0));
        ug.h hVar = this.f48511o0;
        sm0 sm0Var = this.d;
        hVar.f49030n = arrayList;
        hVar.f49029f = sm0Var;
        int i14 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new oh0(this, 15));
        this.d.setOnItemClickListener(new r5.d(this, 9));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(isVar);
        jVar.C = false;
        jVar.f47788m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new q1(this, 8));
        c0(false, true);
        U(1, null, true);
        U(3, null, true);
    }

    public static void Q(y0 y0Var, boolean z10, Pair pair) {
        HashMap hashMap = y0Var.f48506i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            y0Var.f48507j0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new t0(y0Var, 0));
        }
        if (y0Var.f48514r0 == 3) {
            y0Var.c0(true, true);
            y0Var.Y(true);
        }
    }

    public static void R(y0 y0Var, View view) {
        long j3;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = y0Var.f48509l0;
        x0 x0Var = y0Var.Y;
        HashSet hashSet = y0Var.f48502e0;
        if (view instanceof r8) {
            linkedHashMap.clear();
            y0Var.X(true);
        } else if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user != null) {
                j3 = user.f20179id;
            } else {
                j3 = -chat.f20032id;
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
            if ((hashSet.size() == 11 && y0Var.f48514r0 == 1) || (hashSet.size() == r.f() + 1 && y0Var.f48514r0 == 2)) {
                hashSet.remove(Long.valueOf(j3));
                y0Var.Z();
                return;
            }
            x0Var.b(true, hashSet, new s0(y0Var, 1), null);
            y0Var.c0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j3))) {
                Context context = y0Var.f25523n.getContext();
                d6 d6Var = y0Var.resourcesProvider;
                org.telegram.ui.web.d0 d0Var = new org.telegram.ui.web.d0(y0Var, j3, 1);
                s0 s0Var = new s0(y0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f20368a.R = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f20368a.T = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new q9.p(6, atomicBoolean, s0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(11));
                alertDialog$Builder.j(new ei.e0(16, atomicBoolean, d0Var));
                alertDialog$Builder.o();
            } else if (chat != null) {
                y0Var.S();
            }
        }
        if (view instanceof xg.b) {
            long hashCode = ((xg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && y0Var.f48514r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                y0Var.Z();
                return;
            }
            x0Var.b(true, hashSet, new s0(y0Var, 3), y0Var.f48508k0);
            if (!TextUtils.isEmpty(y0Var.f48510n0)) {
                y0Var.f48510n0 = null;
                x0Var.setText("");
                y0Var.c0(false, false);
                y0Var.c0(true, true);
                return;
            }
            y0Var.c0(true, false);
        }
    }

    public static boolean V(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (e2.t(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !ai.w(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || ai.w(" ", str, lowerCase2)) {
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
    public final CharSequence B() {
        int i10 = this.f48514r0;
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
        x0 x0Var;
        boolean z10;
        this.f48516t0 = i10;
        xg.c cVar = this.f48498a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        this.Y.setTranslationY(translationY);
        this.d.setTranslationY((x0Var.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int w02 = h6.w0(h6.f20857h5, this.resourcesProvider);
        Paint paint = this.f48499b0;
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
        float dp = (1.0f - g6Var.f26613c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void S() {
        if (!TextUtils.isEmpty(this.f48510n0)) {
            this.f48510n0 = null;
            this.Y.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f48518v0);
            ArrayList arrayList = this.f48504g0;
            arrayList.clear();
            arrayList.addAll(r.e(this.f48513q0.f20032id));
            c0(false, false);
            c0(true, true);
        }
    }

    public final boolean T() {
        String string;
        HashSet hashSet = this.f48502e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f48503f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f48514r0;
        Context context = getContext();
        d6 d6Var = this.resourcesProvider;
        s0 s0Var = new s0(this, 0);
        s0 s0Var2 = new s0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.f20368a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
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
        alertDialog$Builder.f20368a.T = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new r5.d(s0Var, 8));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new r5.d(s0Var2, 5));
        alertDialog$Builder.o();
        return true;
    }

    public final void U(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f48513q0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                w0 w0Var = new w0(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
                    country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new o8(w0Var, 19));
                return;
            }
            long j3 = chat.f20032id;
            v0 v0Var = new v0(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f20078q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new u1(messagesController, j3, v0Var, 4));
            return;
        }
        long j10 = chat.f20032id;
        w0 w0Var2 = new w0(this, z10, 0);
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
        tL_channelParticipantsSearch.f20031q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new cj1(2, messagesController2, w0Var2));
    }

    public final void W(int i10, List list) {
        long j3;
        this.f48514r0 = i10;
        this.f48510n0 = null;
        HashSet hashSet = this.f48503f0;
        hashSet.clear();
        HashSet hashSet2 = this.f48502e0;
        hashSet2.clear();
        ArrayList arrayList = this.f48504g0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f48509l0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(r.e(this.f48513q0.f20032id));
            }
        } else {
            arrayList.addAll(this.f48505h0);
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
                    j3 = -((TLRPC.Chat) tLObject).f20032id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f20179id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j3 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j3));
                linkedHashMap.put(Long.valueOf(j3), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        x0 x0Var = this.Y;
        x0Var.setText("");
        x0Var.d.b(false);
        x0Var.b(false, hashSet2, new s0(this, 4), this.f48508k0);
        d0();
        c0(false, true);
        this.f48498a0.setText(B());
        a0(false);
        Y(false);
    }

    public final void X(boolean z10) {
        m mVar;
        HashSet hashSet = this.f48502e0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f48514r0;
            LinkedHashMap linkedHashMap = this.f48509l0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f48508k0;
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
                        l lVar = this.f48517u0;
                        if (lVar != null) {
                            lVar.f48416c.f48420b.D(0);
                            z zVar = lVar.f48414a;
                            ArrayList arrayList3 = zVar.f48523e0;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            zVar.b0(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f20032id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                l lVar2 = this.f48517u0;
                if (lVar2 != null) {
                    lVar2.f48416c.f48420b.D(0);
                    z zVar2 = lVar2.f48414a;
                    ArrayList arrayList5 = zVar2.f48521c0;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    zVar2.b0(!mVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f20179id))) {
                        arrayList6.add(user);
                    }
                }
            }
            l lVar3 = this.f48517u0;
            if (lVar3 != null) {
                lVar3.f48416c.f48420b.D(0);
                z zVar3 = lVar3.f48414a;
                ArrayList arrayList7 = zVar3.f48522d0;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = vg.d.v;
                    zVar3.f48527i0 = 0;
                } else {
                    int i13 = vg.d.v;
                    zVar3.f48527i0 = 1;
                }
                zVar3.f48531n0 = 0;
                zVar3.b0(false, true);
                zVar3.a0(true);
                zVar3.O();
            }
        }
    }

    public final void Y(boolean z10) {
        sm0 sm0Var = this.d;
        if (z10) {
            ji.o oVar = new ji.o(getContext(), 2, 0.6f);
            oVar.f47917a = 1;
            oVar.f14272p = AndroidUtilities.dp(38.0f);
            sm0Var.getLayoutManager().w0(oVar);
            return;
        }
        sm0Var.u0(0);
    }

    public final void Z() {
        String string;
        int i10 = this.f48514r0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = "";
                } else {
                    string = LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                }
            } else {
                string = LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) r.f(), new Object[0]);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        l lVar = this.f48517u0;
        if (lVar != null) {
            new ad(lVar.f48416c.container, lVar.f48415b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void a0(boolean z10) {
        String string;
        ci.d dVar = this.X;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f48514r0;
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
        HashSet hashSet = this.f48502e0;
        dVar.b(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void b0(boolean z10, boolean z11) {
        int i10;
        ug.h hVar;
        ArrayList arrayList = this.f48500c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f48501d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f48514r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            ug.g gVar = new ug.g(9, false);
            gVar.f49018i = 1;
            gVar.f49019j = i11;
            gVar.f49017g = string;
            arrayList2.add(gVar);
        }
        ug.g gVar2 = new ug.g(10, false);
        v3 v3Var = this.Z;
        gVar2.f49026q = v3Var;
        arrayList2.add(gVar2);
        int i12 = this.f48514r0;
        HashSet hashSet = this.f48502e0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f48507j0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f48506i0.get(str)) {
                    if (TextUtils.isEmpty(this.f48510n0) || V(tL_help_country, AndroidUtilities.translitSafe(this.f48510n0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        ug.g gVar3 = new ug.g(6, true);
                        gVar3.f49016f = tL_help_country;
                        gVar3.f49020k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    ug.g gVar4 = new ug.g(7, false);
                    gVar4.f49017g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f48504g0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            ug.g gVar5 = new ug.g(3, true);
            gVar5.d = inputPeer;
            gVar5.f49014c = null;
            gVar5.f49015e = null;
            gVar5.f49020k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ug.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        ug.g gVar6 = new ug.g(-1, false);
        gVar6.f49021l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f48514r0 != 3) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new u0(this, 0));
        } else if (z10) {
            v3Var.setRightText(null);
        } else {
            u3 u3Var = v3Var.f23529b;
            u3Var.c(null, false, true);
            u3Var.setOnClickListener(null);
            u3Var.setVisibility(0);
        }
        if (z11 && (hVar = this.f48511o0) != null) {
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
            sm0 sm0Var = this.d;
            if (i10 < sm0Var.getChildCount()) {
                View childAt = sm0Var.getChildAt(i10);
                if (childAt instanceof xg.l) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.f48501d0;
                        if (R < arrayList.size()) {
                            ug.g gVar = (ug.g) arrayList.get(R);
                            xg.l lVar = (xg.l) childAt;
                            lVar.c(gVar.f49020k, z10);
                            TLRPC.Chat chat = gVar.f49015e;
                            float f7 = 1.0f;
                            if (chat != null) {
                                if (this.f48511o0.F(chat) > 200) {
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
                if (childAt instanceof xg.b) {
                    xg.b bVar = (xg.b) childAt;
                    bVar.c(this.f48502e0.contains(Long.valueOf(bVar.getCountry().default_name.hashCode())), true);
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
        int i10 = this.f48514r0;
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
                formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) r.f(), new Object[0]);
                v3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f48513q0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f48511o0.F(chat) - 1));
            v3Var.setLayerHeight(32);
        }
        v3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        j jVar = this.f48515s0;
        if (jVar != null) {
            jVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f48518v0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b0(false, true);
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        ug.h hVar = new ug.h(getContext(), this.resourcesProvider, true);
        this.f48511o0 = hVar;
        return hVar;
    }
}
