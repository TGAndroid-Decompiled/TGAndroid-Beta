package tg;

import ai.n8;
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
import ci.r1;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.o20;
import org.telegram.ui.ui1;
import w7.z5;
public final class z0 extends cb {
    public final ci.d X;
    public final y0 Y;
    public final v3 Z;
    public final xg.c f47128a0;
    public final Paint f47129b0;
    public final ArrayList f47130c0;
    public final ArrayList f47131d0;
    public final HashSet f47132e0;
    public final HashSet f47133f0;
    public final ArrayList f47134g0;
    public final ArrayList f47135h0;
    public final HashMap f47136i0;
    public final ArrayList f47137j0;
    public final ArrayList f47138k0;
    public final LinkedHashMap f47139l0;
    public final e6 m0;
    public String f47140n0;
    public ug.h f47141o0;
    public int f47142p0;
    public final TLRPC.Chat f47143q0;
    public int f47144r0;
    public j f47145s0;
    public int f47146t0;
    public l f47147u0;
    public final pg.c1 f47148v0;

    public z0(n2 n2Var, long j3) {
        super(n2Var, false);
        this.f47129b0 = new Paint(1);
        this.f47130c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f47131d0 = arrayList;
        this.f47132e0 = new HashSet();
        this.f47133f0 = new HashSet();
        this.f47134g0 = new ArrayList();
        this.f47135h0 = new ArrayList();
        this.f47136i0 = new HashMap();
        this.f47137j0 = new ArrayList();
        this.f47138k0 = new ArrayList();
        this.f47139l0 = new LinkedHashMap();
        this.f47142p0 = AndroidUtilities.dp(134.0f);
        this.f47148v0 = new pg.c1(this, 4);
        this.backgroundPaddingLeft = 0;
        this.f47143q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        ((ViewGroup) this.f25307e.getParent()).removeView(this.f25307e);
        ViewGroup viewGroup = this.containerView;
        tr trVar = tr.h;
        this.m0 = new e6(viewGroup, 0L, 350L, trVar);
        xg.c cVar = new xg.c(getContext(), this.resourcesProvider);
        this.f47128a0 = cVar;
        cVar.setOnCloseClickListener(new t0(this, 7));
        cVar.setText(y());
        cVar.setCloseImageVisible(true);
        cVar.f49845e.c(0.0f, false);
        y0 y0Var = new y0(this, getContext(), this.resourcesProvider);
        this.Y = y0Var;
        int i10 = i6.f20894h5;
        y0Var.setBackgroundColor(getThemedColor(i10));
        y0Var.setOnSearchTextChange(new w0(this, 0));
        this.Z = new v3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, z5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(y0Var, z5.f(-2.0f, 55, i12, 0, i12, 0));
        o20 o20Var = new o20(getContext(), this.resourcesProvider, (zl0) null);
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(i6.v0(i10, this.resourcesProvider));
        ci.d dVar = new ci.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new v0(this, 1));
        o20Var.addView(dVar, z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(o20Var, z5.f(-2.0f, 87, i13, 0, i13, 0));
        ug.h hVar = this.f47141o0;
        zl0 zl0Var = this.d;
        hVar.f47678n = arrayList;
        hVar.f47677f = zl0Var;
        int i14 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new xb0(this, 14));
        this.d.setOnItemClickListener(new r2.s(this, 11));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(trVar);
        jVar.C = false;
        jVar.f46570m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new r1(this, 8));
        b0(false, true);
        R(1, null, true);
        R(3, null, true);
    }

    public static void N(z0 z0Var, boolean z10, Pair pair) {
        HashMap hashMap = z0Var.f47136i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            z0Var.f47137j0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new u0(z0Var, 0));
        }
        if (z0Var.f47144r0 == 3) {
            z0Var.b0(true, true);
            z0Var.W(true);
        }
    }

    public static void O(z0 z0Var, View view) {
        long j3;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = z0Var.f47139l0;
        y0 y0Var = z0Var.Y;
        HashSet hashSet = z0Var.f47132e0;
        if (view instanceof r8) {
            linkedHashMap.clear();
            z0Var.U(true);
        } else if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user != null) {
                j3 = user.f20189id;
            } else {
                j3 = -chat.f20042id;
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
            if ((hashSet.size() == 11 && z0Var.f47144r0 == 1) || (hashSet.size() == s.f() + 1 && z0Var.f47144r0 == 2)) {
                hashSet.remove(Long.valueOf(j3));
                z0Var.X();
                return;
            }
            y0Var.b(true, hashSet, new t0(z0Var, 1), null);
            z0Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j3))) {
                Context context = z0Var.f25309n.getContext();
                d6 d6Var = z0Var.resourcesProvider;
                ai.j jVar = new ai.j(z0Var, j3, 29);
                t0 t0Var = new t0(z0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f20372a.R = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f20372a.T = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new rg.x(2, atomicBoolean, t0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(24));
                alertDialog$Builder.j(new ei.f0(15, atomicBoolean, jVar));
                alertDialog$Builder.o();
            } else if (chat != null) {
                z0Var.P();
            }
        }
        if (view instanceof xg.b) {
            long hashCode = ((xg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && z0Var.f47144r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                z0Var.X();
                return;
            }
            y0Var.b(true, hashSet, new t0(z0Var, 3), z0Var.f47138k0);
            if (!TextUtils.isEmpty(z0Var.f47140n0)) {
                z0Var.f47140n0 = null;
                y0Var.setText("");
                z0Var.b0(false, false);
                z0Var.b0(true, true);
                return;
            }
            z0Var.b0(true, false);
        }
    }

    public static boolean S(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (e2.u(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !bi.u(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || bi.u(" ", str, lowerCase2)) {
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
    public final void B(Canvas canvas, int i10) {
        boolean z10;
        this.f47146t0 = i10;
        xg.c cVar = this.f47128a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        y0 y0Var = this.Y;
        y0Var.setTranslationY(translationY);
        this.d.setTranslationY((y0Var.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int v02 = i6.v0(i6.f20894h5, this.resourcesProvider);
        Paint paint = this.f47129b0;
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
        float dp = (1.0f - e6Var.f25939c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void P() {
        if (!TextUtils.isEmpty(this.f47140n0)) {
            this.f47140n0 = null;
            this.Y.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f47148v0);
            ArrayList arrayList = this.f47134g0;
            arrayList.clear();
            arrayList.addAll(s.e(this.f47143q0.f20042id));
            b0(false, false);
            b0(true, true);
        }
    }

    public final boolean Q() {
        String string;
        HashSet hashSet = this.f47132e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f47133f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f47144r0;
        Context context = getContext();
        d6 d6Var = this.resourcesProvider;
        t0 t0Var = new t0(this, 0);
        t0 t0Var2 = new t0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.f20372a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
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
        alertDialog$Builder.f20372a.T = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new r2.s(t0Var, 10));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new r2.s(t0Var2, 7));
        alertDialog$Builder.o();
        return true;
    }

    public final void R(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f47143q0;
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
                connectionsManager.sendRequest(tL_help_getCountriesList, new n8(x0Var, 19));
                return;
            }
            long j3 = chat.f20042id;
            w0 w0Var = new w0(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f20088q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new u1(messagesController, j3, w0Var, 4));
            return;
        }
        long j10 = chat.f20042id;
        x0 x0Var2 = new x0(this, z10, 0);
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
        tL_channelParticipantsSearch.f20041q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new ui1(2, messagesController2, x0Var2));
    }

    public final void T(int i10, List list) {
        long j3;
        this.f47144r0 = i10;
        this.f47140n0 = null;
        HashSet hashSet = this.f47133f0;
        hashSet.clear();
        HashSet hashSet2 = this.f47132e0;
        hashSet2.clear();
        ArrayList arrayList = this.f47134g0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f47139l0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(s.e(this.f47143q0.f20042id));
            }
        } else {
            arrayList.addAll(this.f47135h0);
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
                    j3 = -((TLRPC.Chat) tLObject).f20042id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f20189id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j3 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j3));
                linkedHashMap.put(Long.valueOf(j3), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        y0 y0Var = this.Y;
        y0Var.setText("");
        y0Var.d.b(false);
        y0Var.b(false, hashSet2, new t0(this, 4), this.f47138k0);
        c0();
        b0(false, true);
        this.f47128a0.setText(y());
        Y(false);
        W(false);
    }

    public final void U(boolean z10) {
        HashSet hashSet = this.f47132e0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f47144r0;
            LinkedHashMap linkedHashMap = this.f47139l0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f47138k0;
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
                        l lVar = this.f47147u0;
                        if (lVar != null) {
                            lVar.f47042c.f47046b.E(0);
                            a0 a0Var = lVar.f47040a;
                            ArrayList arrayList3 = a0Var.f46962e0;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            a0Var.Z(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f20042id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                l lVar2 = this.f47147u0;
                if (lVar2 != null) {
                    m mVar = lVar2.f47042c;
                    mVar.f47046b.E(0);
                    a0 a0Var2 = lVar2.f47040a;
                    ArrayList arrayList5 = a0Var2.f46960c0;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    a0Var2.Z(!mVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f20189id))) {
                        arrayList6.add(user);
                    }
                }
            }
            l lVar3 = this.f47147u0;
            if (lVar3 != null) {
                lVar3.f47042c.f47046b.E(0);
                a0 a0Var3 = lVar3.f47040a;
                ArrayList arrayList7 = a0Var3.f46961d0;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = vg.d.f48301s;
                    a0Var3.f46966i0 = 0;
                } else {
                    int i13 = vg.d.f48301s;
                    a0Var3.f46966i0 = 1;
                }
                a0Var3.f46970n0 = 0;
                a0Var3.Z(false, true);
                a0Var3.Y(true);
                a0Var3.L();
            }
        }
    }

    public final void W(boolean z10) {
        zl0 zl0Var = this.d;
        if (z10) {
            ji.o oVar = new ji.o(getContext(), 2, 0.6f);
            oVar.f46699a = 1;
            oVar.f14237p = AndroidUtilities.dp(38.0f);
            zl0Var.getLayoutManager().w0(oVar);
            return;
        }
        zl0Var.v0(0);
    }

    public final void X() {
        String string;
        int i10 = this.f47144r0;
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
        l lVar = this.f47147u0;
        if (lVar != null) {
            new yc(lVar.f47042c.container, lVar.f47041b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void Y(boolean z10) {
        String string;
        ci.d dVar = this.X;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f47144r0;
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
        HashSet hashSet = this.f47132e0;
        dVar.b(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void Z(boolean z10, boolean z11) {
        int i10;
        ug.h hVar;
        ArrayList arrayList = this.f47130c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f47131d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f47144r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            ug.g gVar = new ug.g(9, false);
            gVar.f47666i = 1;
            gVar.f47667j = i11;
            gVar.f47665g = string;
            arrayList2.add(gVar);
        }
        ug.g gVar2 = new ug.g(10, false);
        v3 v3Var = this.Z;
        gVar2.f47674q = v3Var;
        arrayList2.add(gVar2);
        int i12 = this.f47144r0;
        HashSet hashSet = this.f47132e0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f47137j0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f47136i0.get(str)) {
                    if (TextUtils.isEmpty(this.f47140n0) || S(tL_help_country, AndroidUtilities.translitSafe(this.f47140n0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        ug.g gVar3 = new ug.g(6, true);
                        gVar3.f47664f = tL_help_country;
                        gVar3.f47668k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    ug.g gVar4 = new ug.g(7, false);
                    gVar4.f47665g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f47134g0;
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
            gVar5.f47662c = null;
            gVar5.f47663e = null;
            gVar5.f47668k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ug.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        ug.g gVar6 = new ug.g(-1, false);
        gVar6.f47669l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f47144r0 != 3) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new v0(this, 0));
        } else if (z10) {
            v3Var.setRightText(null);
        } else {
            u3 u3Var = v3Var.f23552b;
            u3Var.c(null, false, true);
            u3Var.setOnClickListener(null);
            u3Var.setVisibility(0);
        }
        if (z11 && (hVar = this.f47141o0) != null) {
            if (z10) {
                hVar.E(arrayList, arrayList2);
            } else {
                hVar.l();
            }
        }
    }

    public final void b0(boolean z10, boolean z11) {
        Z(z10, z11);
        int i10 = 0;
        while (true) {
            zl0 zl0Var = this.d;
            if (i10 < zl0Var.getChildCount()) {
                View childAt = zl0Var.getChildAt(i10);
                if (childAt instanceof xg.l) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.f47131d0;
                        if (R < arrayList.size()) {
                            ug.g gVar = (ug.g) arrayList.get(R);
                            xg.l lVar = (xg.l) childAt;
                            lVar.c(gVar.f47668k, z10);
                            TLRPC.Chat chat = gVar.f47663e;
                            float f7 = 1.0f;
                            if (chat != null) {
                                if (this.f47141o0.F(chat) > 200) {
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
                    bVar.c(this.f47132e0.contains(Long.valueOf(bVar.getCountry().default_name.hashCode())), true);
                }
                i10++;
            } else {
                Y(z10);
                return;
            }
        }
    }

    public final void c0() {
        String str;
        String formatPluralStringComma;
        int i10 = this.f47144r0;
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
            TLRPC.Chat chat = this.f47143q0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f47141o0.F(chat) - 1));
            v3Var.setLayerHeight(32);
        }
        v3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        j jVar = this.f47145s0;
        if (jVar != null) {
            jVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f47148v0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Z(false, true);
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        ug.h hVar = new ug.h(getContext(), this.resourcesProvider, true);
        this.f47141o0 = hVar;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f47144r0;
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
