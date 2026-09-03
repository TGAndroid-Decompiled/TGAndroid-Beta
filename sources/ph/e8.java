package ph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.gk;
import org.telegram.ui.sz;
public final class e8 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f41620a0 = 0;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public final ArrayList G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public HashMap M;
    public int N;
    public final Paint O;
    public ArrayList P;
    public m7 Q;
    public Utilities.Callback R;
    public r7 S;
    public Utilities.Callback T;
    public h8 U;
    public final boolean V;
    public boolean W;
    public boolean X;
    public BitmapDrawable Y;
    public g8 Z;
    public gk f41621b;
    public TLRPC.InputPeer f41622c;
    public final ArrayList d;
    public final HashMap e;
    public int f41623f;
    public final ArrayList h;
    public final ArrayList f41624n;
    public final HashMap f41625r;
    public int f41626s;
    public final HashSet v;
    public boolean f41627w;
    public boolean f41628x;
    public boolean f41629y;

    public e8(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true, false);
        char c3 = 0;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        this.f41623f = 0;
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f41624n = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.f41625r = hashMap2;
        this.f41626s = 0;
        this.v = new HashSet();
        this.f41627w = true;
        this.f41628x = true;
        this.f41629y = false;
        this.B = true;
        this.C = true;
        this.D = false;
        this.E = 0;
        this.F = 1;
        this.G = new ArrayList();
        this.J = 1;
        this.K = 4;
        this.M = new HashMap();
        this.N = 86400;
        this.O = new Paint(1);
        this.V = true;
        this.W = false;
        this.N = i10;
        String string = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_contacts", null);
        if (string != null) {
            String[] split = string.split(",");
            arrayList3.clear();
            for (String str : split) {
                try {
                    arrayList3.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        String string2 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i11 = 0;
            while (i11 < split2.length) {
                String[] split3 = split2[i11].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c3]);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i12 = 1; i12 < split3.length; i12++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i12])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i11++;
                    c3 = 0;
                }
                i11++;
                c3 = 0;
            }
        }
        String string3 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] split4 = string3.split(",");
            arrayList.clear();
            for (String str2 : split4) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (String str3 : split5) {
                String[] split6 = str3.split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (int i13 = 1; i13 < split6.length; i13++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[i13])));
                        }
                        hashMap.put(Long.valueOf(parseLong2), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = MessagesController.getInstance(this.currentAccount).getMainSettings().getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] split7 = string5.split(",");
            arrayList2.clear();
            for (String str4 : split7) {
                try {
                    arrayList2.add(Long.valueOf(Long.parseLong(str4)));
                } catch (Exception unused5) {
                }
            }
        }
        this.f41626s = l1(arrayList3, hashMap2).size();
        this.f41623f = l1(arrayList, hashMap).size();
        this.f41628x = !MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_noforwards", false);
        this.f41629y = MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("story_keep", true);
        j1(context);
        this.f41621b.setAdapter(new g7(this, context, 0));
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new e6(4, this, messagesStorage));
        MessagesController.getInstance(this.currentAccount).getStoriesController().P();
        MessagesController.getInstance(this.currentAccount).getStoriesController().R();
    }

    public static void D(e8 e8Var) {
        super.dismiss();
    }

    public static int F(e8 e8Var) {
        return e8Var.currentAccount;
    }

    public static ArrayList J0(e8 e8Var) {
        ArrayList h12 = e8Var.h1();
        int i10 = 0;
        while (i10 < h12.size()) {
            TLObject tLObject = (TLObject) h12.get(i10);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                h12.remove(i10);
                i10--;
            }
            i10++;
        }
        return h12;
    }

    public static int W(e8 e8Var) {
        return e8Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.f6 X(e8 e8Var) {
        return e8Var.resourcesProvider;
    }

    public static org.telegram.ui.ActionBar.f6 Y(e8 e8Var) {
        return e8Var.resourcesProvider;
    }

    public static ArrayList Y0(e8 e8Var) {
        TLRPC.Chat chat;
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(e8Var.currentAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (messagesController.canAddToForward(dialog)) {
                if (DialogObject.isUserDialog(dialog.f19163id)) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(dialog.f19163id));
                    if (user != null && !user.bot && user.f19306id != 777000 && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else if (DialogObject.isChatDialog(dialog.f19163id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f19163id))) != null && !ChatObject.isForum(chat)) {
                    arrayList.add(chat);
                }
            }
        }
        return arrayList;
    }

    public static int Z(e8 e8Var) {
        return e8Var.currentAccount;
    }

    public static ArrayList Z0(e8 e8Var, boolean z4, boolean z10) {
        TLRPC.User user;
        TLRPC.Chat chat;
        MessagesController messagesController = MessagesController.getInstance(e8Var.currentAccount);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        ConcurrentHashMap<Long, TLRPC.TL_contact> concurrentHashMap = ContactsController.getInstance(e8Var.currentAccount).contactsDict;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            if (!e8Var.X) {
                ContactsController.getInstance(e8Var.currentAccount).loadContacts(false, 0L);
            }
            e8Var.X = true;
        }
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (DialogObject.isUserDialog(dialog.f19163id)) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(dialog.f19163id));
                if (user2 != null && !user2.bot && user2.f19306id != 777000 && !UserObject.isUserSelf(user2) && !user2.deleted && (!z4 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(user2.f19306id)) != null))) {
                    hashMap.put(Long.valueOf(user2.f19306id), Boolean.TRUE);
                    arrayList.add(user2);
                }
            } else if (z10 && DialogObject.isChatDialog(dialog.f19163id) && (chat = messagesController.getChat(Long.valueOf(-dialog.f19163id))) != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                hashMap.put(Long.valueOf(-chat.f19159id), Boolean.TRUE);
                arrayList.add(chat);
            }
        }
        if (concurrentHashMap != null) {
            for (Map.Entry<Long, TLRPC.TL_contact> entry : concurrentHashMap.entrySet()) {
                Long key = entry.getKey();
                key.getClass();
                if (!hashMap.containsKey(key) && (user = messagesController.getUser(key)) != null && !user.bot && user.f19306id != 777000 && !UserObject.isUserSelf(user)) {
                    arrayList.add(user);
                    hashMap.put(Long.valueOf(user.f19306id), Boolean.TRUE);
                }
            }
        }
        return arrayList;
    }

    public static int b0(e8 e8Var) {
        return e8Var.currentAccount;
    }

    public static ViewGroup c0(e8 e8Var) {
        return e8Var.containerView;
    }

    public static boolean d0(e8 e8Var) {
        return e8Var.keyboardVisible;
    }

    public static int d1(e8 e8Var, TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(e8Var.currentAccount).getChatFull(chat.f19159id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = e8Var.M;
        if (hashMap != null && (num = (Integer) hashMap.get(Long.valueOf(chat.f19159id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public static HashSet l1(ArrayList arrayList, HashMap hashMap) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        if (hashMap != null) {
            for (ArrayList arrayList2 : hashMap.values()) {
                hashSet.addAll(arrayList2);
            }
        }
        return hashSet;
    }

    public static org.telegram.ui.ActionBar.f6 r0(e8 e8Var) {
        return e8Var.resourcesProvider;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f41621b.getCurrentView();
        if (currentView instanceof y7) {
            return ((y7) currentView).P;
        }
        return true;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gk gkVar = this.f41621b;
        if (gkVar != null) {
            int i12 = 0;
            if (i10 == NotificationCenter.contactsDidLoad) {
                View[] viewPages = gkVar.getViewPages();
                View view = viewPages[0];
                if (view instanceof y7) {
                    ((y7) view).g(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof y7) {
                    ((y7) view2).g(true);
                }
            } else if (i10 == NotificationCenter.storiesBlocklistUpdate) {
                View[] viewPages2 = gkVar.getViewPages();
                while (i12 < viewPages2.length) {
                    View view3 = viewPages2[i12];
                    if (view3 instanceof y7) {
                        y7 y7Var = (y7) view3;
                        int i13 = y7Var.f42658a;
                        if (i13 == 6) {
                            y7Var.a(true);
                        } else if (i13 == 0) {
                            y7Var.g(true);
                        }
                    }
                    i12++;
                }
            } else if (i10 == NotificationCenter.storiesSendAsUpdate) {
                View[] viewPages3 = gkVar.getViewPages();
                while (i12 < viewPages3.length) {
                    View view4 = viewPages3[i12];
                    if (view4 instanceof y7) {
                        y7 y7Var2 = (y7) view4;
                        if (y7Var2.f42658a == 0) {
                            y7Var2.g(true);
                        }
                    }
                    i12++;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        c8 c8Var;
        Utilities.Callback callback = this.R;
        ArrayList arrayList = this.h;
        HashMap hashMap = this.e;
        ArrayList arrayList2 = this.d;
        HashMap hashMap2 = this.f41625r;
        ArrayList arrayList3 = this.f41624n;
        if (callback != null) {
            int i10 = this.K;
            if (i10 == 3) {
                c8Var = new c8(this.K, this.currentAccount, new ArrayList(l1(arrayList3, hashMap2)));
                ArrayList arrayList4 = c8Var.f41439c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = c8Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i10 == 4) {
                c8Var = new c8(this.K, this.currentAccount, new ArrayList(l1(arrayList2, hashMap)));
                ArrayList arrayList5 = c8Var.f41439c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = c8Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else if (i10 == 2) {
                c8Var = new c8(i10, this.currentAccount, arrayList);
            } else {
                c8Var = new c8(i10, this.currentAccount, (ArrayList) null);
            }
            this.R.run(c8Var);
            this.R = null;
        }
        ic.h(this.container);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(entry.getKey());
            sb.append(",");
            sb.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry2.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb2.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.f41628x).putBoolean("story_keep", this.f41629y).apply();
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
        super.dismissInternal();
    }

    public final void e1(boolean z4) {
        View[] viewPages;
        this.B = z4;
        gk gkVar = this.f41621b;
        if (gkVar != null) {
            for (View view : gkVar.getViewPages()) {
                if (view instanceof y7) {
                    ((y7) view).e(false);
                }
            }
        }
    }

    public final void f1() {
        View[] viewPages;
        s7 s7Var;
        for (View view : this.f41621b.getViewPages()) {
            if ((view instanceof y7) && (s7Var = ((y7) view).f42666x) != null) {
                AndroidUtilities.hideKeyboard(s7Var.f41332a);
            }
        }
    }

    public final void g1(c8 c8Var, Runnable runnable, boolean z4) {
        ArrayList arrayList = new ArrayList();
        if (this.P != null) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            for (int i10 = 0; i10 < this.P.size(); i10++) {
                String str = (String) this.P.get(i10);
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(user.f19306id));
                    if (user2 != null) {
                        user = user2;
                    }
                    if (!user.bot && !c8Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        d dVar = null;
        if (!arrayList.isEmpty() && !z4) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < Math.min(2, arrayList.size()); i11++) {
                if (i11 > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i11)));
                spannableString.setSpan(new f51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.StoryRestrictions);
            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryRestrictionsInfo), spannableStringBuilder);
            alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new l1(this, c8Var, runnable, 1));
            kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
            return;
        }
        View view = this.f41621b.getViewPages()[0];
        if (view instanceof y7) {
            dVar = ((y7) view).v;
        }
        if (dVar != null) {
            dVar.setLoading(true);
        }
        m7 m7Var = this.Q;
        if (m7Var != null) {
            m7Var.d(c8Var, this.f41627w, this.f41628x, this.f41629y, this.D, this.f41622c, this.E, new e6(6, dVar, runnable), new org.telegram.ui.web.q0(dVar, 23));
        } else {
            runnable.run();
        }
    }

    public final ArrayList h1() {
        TLRPC.User user;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(this.currentAccount).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(this.currentAccount).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i10);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && !UserObject.isUserSelf(user) && !user.bot && user.f19306id != 777000) {
                    arrayList.add(user);
                }
            }
        }
        return arrayList;
    }

    public final nh.t6 i1() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }

    public final void j1(Context context) {
        ic.a(this.container, new gg.w(12));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesSendAsUpdate);
        int i10 = org.telegram.ui.ActionBar.j6.f19952h5;
        this.O.setColor(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider));
        this.containerView = new sz(this, context);
        gk gkVar = new gk(this, context, 7);
        this.f41621b = gkVar;
        int i11 = this.backgroundPaddingLeft;
        gkVar.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.f41621b, k7.b6.e(-1, -1, 119));
    }

    public final void k1(boolean z4) {
        View[] viewPages;
        this.W = z4;
        gk gkVar = this.f41621b;
        if (gkVar != null) {
            for (View view : gkVar.getViewPages()) {
                if (view instanceof y7) {
                    y7 y7Var = (y7) view;
                    y7Var.g(false);
                    y7Var.e(false);
                }
            }
        }
    }

    public final void m1(int i10) {
        View[] viewPages;
        this.F = i10;
        gk gkVar = this.f41621b;
        if (gkVar != null) {
            for (View view : gkVar.getViewPages()) {
                if (view instanceof y7) {
                    ((y7) view).e(false);
                }
            }
        }
    }

    public final void n1(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        View[] viewPages;
        if (bitmap == null) {
            bitmapDrawable = null;
        } else {
            bitmapDrawable = new BitmapDrawable(bitmap);
        }
        this.Y = bitmapDrawable;
        gk gkVar = this.f41621b;
        if (gkVar != null) {
            for (View view : gkVar.getViewPages()) {
                if (view instanceof y7) {
                    y7 y7Var = (y7) view;
                    y7Var.g(false);
                    y7Var.e(false);
                }
            }
        }
    }

    public final void o1() {
        this.H = true;
        View[] viewPages = this.f41621b.getViewPages();
        View view = viewPages[0];
        if (view instanceof y7) {
            y7 y7Var = (y7) view;
            y7Var.b(y7Var.f42658a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof y7) {
            y7 y7Var2 = (y7) view2;
            y7Var2.b(y7Var2.f42658a);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f41621b.getCurrentPosition() > 0) {
            f1();
            gk gkVar = this.f41621b;
            gkVar.D(gkVar.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    public final void p1(TLRPC.InputPeer inputPeer) {
        this.f41622c = inputPeer;
        this.v.clear();
        View[] viewPages = this.f41621b.getViewPages();
        View view = viewPages[0];
        if (view instanceof y7) {
            y7 y7Var = (y7) view;
            y7Var.b(y7Var.f42658a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof y7) {
            y7 y7Var2 = (y7) view2;
            y7Var2.b(y7Var2.f42658a);
        }
    }

    public final void q1(c8 c8Var) {
        if (c8Var != null) {
            HashMap hashMap = c8Var.d;
            int i10 = c8Var.f41437a;
            ArrayList arrayList = c8Var.f41439c;
            this.K = i10;
            if (i10 == 2) {
                ArrayList arrayList2 = this.h;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i10 == 3) {
                ArrayList arrayList3 = this.f41624n;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.f41625r;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.f41626s = l1(arrayList3, hashMap2).size();
            } else if (i10 == 4) {
                ArrayList arrayList4 = this.d;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.e;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.f41623f = l1(arrayList4, hashMap3).size();
            }
            if (i10 == 5) {
                this.L = true;
                this.J = 5;
                ArrayList arrayList5 = this.G;
                arrayList5.clear();
                arrayList5.addAll(c8Var.f41440f);
                this.f41621b.setPosition(1);
            }
            View[] viewPages = this.f41621b.getViewPages();
            View view = viewPages[0];
            if (view instanceof y7) {
                y7 y7Var = (y7) view;
                y7Var.b(y7Var.f42658a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof y7) {
                y7 y7Var2 = (y7) view2;
                y7Var2.b(y7Var2.f42658a);
            }
        }
    }

    public e8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true, false);
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f41623f = 0;
        this.h = new ArrayList();
        this.f41624n = new ArrayList();
        this.f41625r = new HashMap();
        this.f41626s = 0;
        this.v = new HashSet();
        this.f41627w = true;
        this.f41628x = true;
        this.f41629y = false;
        this.B = true;
        this.C = true;
        this.D = false;
        this.E = 0;
        this.F = 1;
        this.G = new ArrayList();
        this.J = 1;
        this.K = 4;
        this.M = new HashMap();
        this.N = 86400;
        this.O = new Paint(1);
        this.V = true;
        this.W = false;
        j1(context);
        this.f41621b.setAdapter(new g7(this, context, 1));
    }
}
