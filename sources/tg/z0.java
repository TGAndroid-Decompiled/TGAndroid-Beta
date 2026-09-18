package tg;

import ai.m8;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.aj1;
import org.telegram.ui.o20;
import w7.y5;
public final class z0 extends bb {
    public final ci.d X;
    public final y0 Y;
    public final v3 Z;
    public final xg.c f43482a0;
    public final Paint f43483b0;
    public final ArrayList f43484c0;
    public final ArrayList f43485d0;
    public final HashSet f43486e0;
    public final HashSet f43487f0;
    public final ArrayList f43488g0;
    public final ArrayList f43489h0;
    public final HashMap f43490i0;
    public final ArrayList f43491j0;
    public final ArrayList f43492k0;
    public final LinkedHashMap f43493l0;
    public final e6 m0;
    public String f43494n0;
    public ug.g f43495o0;
    public int f43496p0;
    public final TLRPC.Chat f43497q0;
    public int f43498r0;
    public j f43499s0;
    public int f43500t0;
    public l f43501u0;
    public final p8.b f43502v0;

    public z0(n2 n2Var, long j3) {
        super(n2Var, false);
        this.f43483b0 = new Paint(1);
        this.f43484c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f43485d0 = arrayList;
        this.f43486e0 = new HashSet();
        this.f43487f0 = new HashSet();
        this.f43488g0 = new ArrayList();
        this.f43489h0 = new ArrayList();
        this.f43490i0 = new HashMap();
        this.f43491j0 = new ArrayList();
        this.f43492k0 = new ArrayList();
        this.f43493l0 = new LinkedHashMap();
        this.f43496p0 = AndroidUtilities.dp(134.0f);
        this.f43502v0 = new p8.b(this, 5);
        this.backgroundPaddingLeft = 0;
        this.f43497q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        qr qrVar = qr.h;
        this.m0 = new e6(viewGroup, 0L, 350L, qrVar);
        xg.c cVar = new xg.c(getContext(), this.resourcesProvider);
        this.f43482a0 = cVar;
        cVar.setOnCloseClickListener(new t0(this, 7));
        cVar.setText(y());
        cVar.setCloseImageVisible(true);
        cVar.e.c(0.0f, false);
        y0 y0Var = new y0(this, getContext(), this.resourcesProvider);
        this.Y = y0Var;
        int i10 = j6.f19133h5;
        y0Var.setBackgroundColor(getThemedColor(i10));
        y0Var.setOnSearchTextChange(new w0(this, 0));
        this.Z = new v3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, y5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(y0Var, y5.f(-2.0f, 55, i12, 0, i12, 0));
        o20 o20Var = new o20(getContext(), this.resourcesProvider, (wl0) null);
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(j6.v0(i10, this.resourcesProvider));
        ci.d dVar = new ci.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new v0(this, 1));
        o20Var.addView(dVar, y5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(o20Var, y5.f(-2.0f, 87, i13, 0, i13, 0));
        ug.g gVar = this.f43495o0;
        wl0 wl0Var = this.d;
        gVar.f43995n = arrayList;
        gVar.f43994f = wl0Var;
        int i14 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new tb0(this, 14));
        this.d.setOnItemClickListener(new r5.d(this, 9));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(qrVar);
        jVar.C = false;
        jVar.f42964m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new r1(this, 8));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static void P(z0 z0Var, boolean z10, Pair pair) {
        HashMap hashMap = z0Var.f43490i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            z0Var.f43491j0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new u0(z0Var, 0));
        }
        if (z0Var.f43498r0 == 3) {
            z0Var.b0(true, true);
            z0Var.X(true);
        }
    }

    public static void Q(z0 z0Var, View view) {
        long j3;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = z0Var.f43493l0;
        y0 y0Var = z0Var.Y;
        HashSet hashSet = z0Var.f43486e0;
        if (view instanceof r8) {
            linkedHashMap.clear();
            z0Var.W(true);
        } else if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user != null) {
                j3 = user.f18443id;
            } else {
                j3 = -chat.f18296id;
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
            if ((hashSet.size() == 11 && z0Var.f43498r0 == 1) || (hashSet.size() == s.f() + 1 && z0Var.f43498r0 == 2)) {
                hashSet.remove(Long.valueOf(j3));
                z0Var.Y();
                return;
            }
            y0Var.b(true, hashSet, new t0(z0Var, 1), null);
            z0Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j3))) {
                Context context = z0Var.f22943n.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = z0Var.resourcesProvider;
                ai.j jVar = new ai.j(z0Var, j3, 29);
                t0 t0Var = new t0(z0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f18622a.R = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f18622a.T = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new s5.e(1, atomicBoolean, t0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new s9.b(5));
                alertDialog$Builder.j(new ei.e0(15, atomicBoolean, jVar));
                alertDialog$Builder.o();
            } else if (chat != null) {
                z0Var.R();
            }
        }
        if (view instanceof xg.b) {
            long hashCode = ((xg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && z0Var.f43498r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                z0Var.Y();
                return;
            }
            y0Var.b(true, hashSet, new t0(z0Var, 3), z0Var.f43492k0);
            if (!TextUtils.isEmpty(z0Var.f43494n0)) {
                z0Var.f43494n0 = null;
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
            if (e2.u(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !wh.u(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || wh.u(" ", str, lowerCase2)) {
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
        this.f43500t0 = i10;
        xg.c cVar = this.f43482a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        y0 y0Var = this.Y;
        y0Var.setTranslationY(translationY);
        this.d.setTranslationY((y0Var.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int v02 = j6.v0(j6.f19133h5, this.resourcesProvider);
        Paint paint = this.f43483b0;
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
        float dp = (1.0f - e6Var.f23794c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void R() {
        if (!TextUtils.isEmpty(this.f43494n0)) {
            this.f43494n0 = null;
            this.Y.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f43502v0);
            ArrayList arrayList = this.f43488g0;
            arrayList.clear();
            arrayList.addAll(s.e(this.f43497q0.f18296id));
            b0(false, false);
            b0(true, true);
        }
    }

    public final boolean S() {
        String string;
        HashSet hashSet = this.f43486e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f43487f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f43498r0;
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.resourcesProvider;
        t0 t0Var = new t0(this, 0);
        t0 t0Var2 = new t0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.f18622a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
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
        alertDialog$Builder.f18622a.T = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new r5.d(t0Var, 8));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new r5.d(t0Var2, 5));
        alertDialog$Builder.o();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f43497q0;
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
                connectionsManager.sendRequest(tL_help_getCountriesList, new m8(x0Var, 19));
                return;
            }
            long j3 = chat.f18296id;
            w0 w0Var = new w0(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f18342q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new u1(messagesController, j3, w0Var, 4));
            return;
        }
        long j10 = chat.f18296id;
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
        tL_channelParticipantsSearch.f18295q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new aj1(2, messagesController2, x0Var2));
    }

    public final void V(int i10, List list) {
        long j3;
        this.f43498r0 = i10;
        this.f43494n0 = null;
        HashSet hashSet = this.f43487f0;
        hashSet.clear();
        HashSet hashSet2 = this.f43486e0;
        hashSet2.clear();
        ArrayList arrayList = this.f43488g0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f43493l0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(s.e(this.f43497q0.f18296id));
            }
        } else {
            arrayList.addAll(this.f43489h0);
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
                    j3 = -((TLRPC.Chat) tLObject).f18296id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f18443id;
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
        y0Var.b(false, hashSet2, new t0(this, 4), this.f43492k0);
        c0();
        b0(false, true);
        this.f43482a0.setText(y());
        Z(false);
        X(false);
    }

    public final void W(boolean z10) {
        HashSet hashSet = this.f43486e0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f43498r0;
            LinkedHashMap linkedHashMap = this.f43493l0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f43492k0;
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
                        l lVar = this.f43501u0;
                        if (lVar != null) {
                            lVar.f43401c.f43404b.E(0);
                            a0 a0Var = lVar.f43399a;
                            ArrayList arrayList3 = a0Var.f43325e0;
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
                        if (hashSet.contains(Long.valueOf(-chat.f18296id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                l lVar2 = this.f43501u0;
                if (lVar2 != null) {
                    m mVar = lVar2.f43401c;
                    mVar.f43404b.E(0);
                    a0 a0Var2 = lVar2.f43399a;
                    ArrayList arrayList5 = a0Var2.f43323c0;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    a0Var2.a0(!mVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f18443id))) {
                        arrayList6.add(user);
                    }
                }
            }
            l lVar3 = this.f43501u0;
            if (lVar3 != null) {
                lVar3.f43401c.f43404b.E(0);
                a0 a0Var3 = lVar3.f43399a;
                ArrayList arrayList7 = a0Var3.f43324d0;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = vg.d.f44575s;
                    a0Var3.f43329i0 = 0;
                } else {
                    int i13 = vg.d.f44575s;
                    a0Var3.f43329i0 = 1;
                }
                a0Var3.f43333n0 = 0;
                a0Var3.a0(false, true);
                a0Var3.Z(true);
                a0Var3.N();
            }
        }
    }

    public final void X(boolean z10) {
        wl0 wl0Var = this.d;
        if (z10) {
            ji.o oVar = new ji.o(getContext(), 2, 0.6f);
            oVar.f43079a = 1;
            oVar.f13105p = AndroidUtilities.dp(38.0f);
            wl0Var.getLayoutManager().w0(oVar);
            return;
        }
        wl0Var.v0(0);
    }

    public final void Y() {
        String string;
        int i10 = this.f43498r0;
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
        l lVar = this.f43501u0;
        if (lVar != null) {
            new xc(lVar.f43401c.container, lVar.f43400b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void Z(boolean z10) {
        String string;
        ci.d dVar = this.X;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f43498r0;
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
        HashSet hashSet = this.f43486e0;
        dVar.b(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        ug.g gVar;
        ArrayList arrayList = this.f43484c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f43485d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f43498r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            ug.f fVar = new ug.f(9, false);
            fVar.f43984i = 1;
            fVar.f43985j = i11;
            fVar.f43983g = string;
            arrayList2.add(fVar);
        }
        ug.f fVar2 = new ug.f(10, false);
        v3 v3Var = this.Z;
        fVar2.f43992q = v3Var;
        arrayList2.add(fVar2);
        int i12 = this.f43498r0;
        HashSet hashSet = this.f43486e0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f43491j0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f43490i0.get(str)) {
                    if (TextUtils.isEmpty(this.f43494n0) || U(tL_help_country, AndroidUtilities.translitSafe(this.f43494n0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        ug.f fVar3 = new ug.f(6, true);
                        fVar3.f43982f = tL_help_country;
                        fVar3.f43986k = contains;
                        arrayList4.add(fVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    ug.f fVar4 = new ug.f(7, false);
                    fVar4.f43983g = upperCase;
                    arrayList2.add(fVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f43488g0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            ug.f fVar5 = new ug.f(3, true);
            fVar5.d = inputPeer;
            fVar5.f43981c = null;
            fVar5.e = null;
            fVar5.f43986k = contains2;
            arrayList2.add(fVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ug.f(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        ug.f fVar6 = new ug.f(-1, false);
        fVar6.f43987l = max;
        arrayList2.add(fVar6);
        if (hashSet.size() > 0 && this.f43498r0 != 3) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new v0(this, 0));
        } else if (z10) {
            v3Var.setRightText(null);
        } else {
            u3 u3Var = v3Var.f21644b;
            u3Var.c(null, false, true);
            u3Var.setOnClickListener(null);
            u3Var.setVisibility(0);
        }
        if (z11 && (gVar = this.f43495o0) != null) {
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
            wl0 wl0Var = this.d;
            if (i10 < wl0Var.getChildCount()) {
                View childAt = wl0Var.getChildAt(i10);
                if (childAt instanceof xg.l) {
                    int S = RecyclerView.S(childAt) - 1;
                    if (S >= 0) {
                        ArrayList arrayList = this.f43485d0;
                        if (S < arrayList.size()) {
                            ug.f fVar = (ug.f) arrayList.get(S);
                            xg.l lVar = (xg.l) childAt;
                            lVar.c(fVar.f43986k, z10);
                            TLRPC.Chat chat = fVar.e;
                            float f7 = 1.0f;
                            if (chat != null) {
                                if (this.f43495o0.F(chat) > 200) {
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
                    bVar.c(this.f43486e0.contains(Long.valueOf(bVar.getCountry().default_name.hashCode())), true);
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
        int i10 = this.f43498r0;
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
            TLRPC.Chat chat = this.f43497q0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f43495o0.F(chat) - 1));
            v3Var.setLayerHeight(32);
        }
        v3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        j jVar = this.f43499s0;
        if (jVar != null) {
            jVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f43502v0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        ug.g gVar = new ug.g(getContext(), this.resourcesProvider, true);
        this.f43495o0 = gVar;
        return gVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f43498r0;
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
