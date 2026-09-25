package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.NumberTextView;
public final class sk0 extends org.telegram.ui.ActionBar.m2 implements org.telegram.ui.Components.gk, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public qk0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.fo K;
    public long L;
    public int M;
    public qk0 N;
    public org.telegram.ui.Components.wi O;
    public Ringtone P;
    public long Q;
    public final ArrayList f37810a;
    public final ArrayList f37811b;
    public final ArrayList f37812c;
    public NumberTextView d;
    public org.telegram.ui.Components.wl0 e;
    public pk0 f37813f;
    public final org.telegram.ui.ActionBar.d6 h;
    public int f37814n;
    public int f37815r;
    public int f37816s;
    public int v;
    public int f37817w;
    public int f37818x;
    public int f37819y;

    public sk0(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.f37810a = new ArrayList();
        this.f37811b = new ArrayList();
        this.f37812c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.h = d6Var;
    }

    public static void U(org.telegram.ui.sk0 r9, android.content.Context r10, android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sk0.U(org.telegram.ui.sk0, android.content.Context, android.view.View, int):void");
    }

    public static void W(sk0 sk0Var) {
        sk0Var.J.clear();
        pk0 pk0Var = sk0Var.f37813f;
        pk0Var.q(0, pk0Var.f36572c.f37814n);
        sk0Var.b0();
    }

    public static String a0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        if (TextUtils.isEmpty(str) && document != null) {
            return LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
        }
        return str;
    }

    public final void Z(qk0 qk0Var) {
        int i10 = qk0Var.f36938c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(qk0Var.f36938c);
        } else if (qk0Var.f36936a) {
            sparseArray.put(qk0Var.f36938c, qk0Var);
        } else {
            return;
        }
        b0();
        pk0 pk0Var = this.f37813f;
        pk0Var.q(0, pk0Var.f36572c.f37814n);
    }

    public final void b0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() > 0) {
            this.d.a(sparseArray.size(), this.actionBar.s());
            this.actionBar.O(null, null);
            return;
        }
        this.actionBar.r();
    }

    public final void c0() {
        this.f37815r = -1;
        this.f37816s = -1;
        this.v = -1;
        this.f37817w = -1;
        this.f37819y = -1;
        this.E = -1;
        this.F = -1;
        this.f37814n = 1;
        ArrayList arrayList = this.f37810a;
        if (!arrayList.isEmpty()) {
            int i10 = this.f37814n;
            this.f37815r = i10;
            int size = arrayList.size() + i10;
            this.f37814n = size;
            this.f37816s = size;
        }
        int i11 = this.f37814n;
        this.v = i11;
        this.f37814n = i11 + 2;
        this.f37817w = i11 + 1;
        ArrayList arrayList2 = this.f37811b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f37814n;
            int i13 = i12 + 1;
            this.f37814n = i13;
            this.f37819y = i12;
            this.E = i13;
            int size2 = arrayList2.size() + i13;
            this.f37814n = size2;
            this.F = size2;
        }
        int i14 = this.f37814n;
        this.f37814n = i14 + 1;
        this.f37818x = i14;
    }

    @Override
    public final View createView(Context context) {
        float f7;
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.A(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19097f8, this.h), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19393v8, this.h), false);
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new ok0(this, context));
        if (this.L == 0) {
            int i10 = this.M;
            if (i10 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundPrivate));
            } else if (i10 == 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundGroup));
            } else if (i10 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundChannels));
            } else if (i10 == 3) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundStories));
            } else if (i10 == 5 || i10 == 4) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundReactions));
            }
        } else {
            org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(context, null, false, this.h);
            this.K = foVar;
            foVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            org.telegram.ui.Components.fo foVar2 = this.K;
            if (!this.inPreviewMode) {
                f7 = 56.0f;
            } else {
                f7 = 0.0f;
            }
            kVar.addView(foVar2, 0, w7.y5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
            if (this.L < 0) {
                if (this.Q != 0) {
                    TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.L, this.Q);
                    ng.d.p(this.K.getAvatarImageView(), findTopic, false, true, this.h);
                    this.K.setTitle(findTopic.title);
                } else {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.L));
                    this.K.setChatAvatar(chat);
                    this.K.setTitle(chat.title);
                }
            } else {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.L));
                if (user != null) {
                    this.K.setUserAvatar(user);
                    this.K.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            }
            this.K.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
        }
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19445y8, this.h));
        j3.addView(this.d, w7.y5.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new bi.d(2));
        j3.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        j3.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19004a7, this.h));
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.e = wl0Var;
        wl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, w7.y5.c(-1.0f, -1));
        pk0 pk0Var = new pk0(this);
        this.f37813f = pk0Var;
        pk0Var.C(true);
        this.e.setAdapter(this.f37813f);
        ((s4.j) this.e.getItemAnimator()).f42996m = false;
        ((s4.j) this.e.getItemAnimator()).C = false;
        this.e.setLayoutManager(new s4.c0());
        this.e.setOnItemClickListener(new ai.n6(20, this, context));
        this.e.setOnItemLongClickListener(new du(this, 27));
        getMediaDataController().ringtoneDataStore.g(false);
        this.f37810a.clear();
        this.f37811b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.e.size(); i11++) {
            uf.b bVar = (uf.b) getMediaDataController().ringtoneDataStore.e.get(i11);
            ?? obj = new Object();
            int i12 = this.G;
            this.G = i12 + 1;
            obj.f36938c = i12;
            obj.f36936a = true;
            obj.d = bVar.f43978c;
            TLRPC.Document document3 = bVar.f43976a;
            String str = document3.file_name_fixed;
            obj.f36939f = str;
            obj.e = document3;
            obj.f36939f = a0(document3, str);
            obj.f36940g = bVar.f43977b;
            qk0 qk0Var = this.N;
            if (qk0Var != null && (document = qk0Var.e) != null && (document2 = bVar.f43976a) != null && document.f18342id == document2.f18342id) {
                this.N = null;
                this.H = obj;
            }
            this.f37810a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i13 = this.G;
        this.G = i13 + 1;
        obj2.f36938c = i13;
        obj2.f36939f = LocaleController.getString(R.string.NoSound);
        this.f37811b.add(obj2);
        ?? obj3 = new Object();
        int i14 = this.G;
        this.G = i14 + 1;
        obj3.f36938c = i14;
        obj3.f36939f = LocaleController.getString(R.string.DefaultRingtone);
        obj3.f36937b = true;
        this.f37811b.add(obj3);
        qk0 qk0Var2 = this.N;
        if (qk0Var2 != null && qk0Var2.e == null && qk0Var2.f36940g.equals("NoSound")) {
            this.N = null;
            this.H = obj2;
        }
        qk0 qk0Var3 = this.N;
        if (qk0Var3 != null && qk0Var3.e == null && qk0Var3.f36940g.equals("Default")) {
            this.N = null;
            this.H = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i15 = this.G;
            this.G = i15 + 1;
            obj4.f36938c = i15;
            obj4.f36939f = string;
            obj4.f36940g = str2;
            qk0 qk0Var4 = this.N;
            if (qk0Var4 != null && qk0Var4.e == null && qk0Var4.f36940g.equals(str2)) {
                this.N = null;
                this.H = obj4;
            }
            this.f37811b.add(obj4);
        }
        if (getMediaDataController().ringtoneDataStore.f43984f && this.H == null) {
            this.H = obj3;
            this.I = true;
        }
        c0();
        c0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i10 == NotificationCenter.onUserRingtonesUpdated) {
            HashMap hashMap = new HashMap();
            int i12 = 0;
            while (true) {
                arrayList = this.f37810a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((qk0) arrayList.get(i12)).d), (qk0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                uf.b bVar = (uf.b) getMediaDataController().ringtoneDataStore.e.get(i13);
                ?? obj = new Object();
                qk0 qk0Var = (qk0) hashMap.get(Integer.valueOf(bVar.f43978c));
                if (qk0Var != null) {
                    if (qk0Var == this.H) {
                        this.H = obj;
                    }
                    obj.f36938c = qk0Var.f36938c;
                } else {
                    int i14 = this.G;
                    this.G = i14 + 1;
                    obj.f36938c = i14;
                }
                obj.f36936a = true;
                obj.d = bVar.f43978c;
                TLRPC.Document document3 = bVar.f43976a;
                if (document3 != null) {
                    obj.f36939f = document3.file_name_fixed;
                } else {
                    obj.f36939f = new File(bVar.f43977b).getName();
                }
                TLRPC.Document document4 = bVar.f43976a;
                obj.e = document4;
                obj.f36939f = a0(document4, obj.f36939f);
                obj.f36940g = bVar.f43977b;
                qk0 qk0Var2 = this.N;
                if (qk0Var2 != null && (document = qk0Var2.e) != null && (document2 = bVar.f43976a) != null && document.f18342id == document2.f18342id) {
                    this.N = null;
                    this.H = obj;
                }
                arrayList.add(obj);
            }
            c0();
            this.f37813f.l();
            if (getMediaDataController().ringtoneDataStore.f43984f && this.H == null) {
                ArrayList arrayList2 = this.f37811b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (qk0) arrayList2.get(0);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.h;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            getMediaDataController().uploadRingtone((String) arrayList.get(i11));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 21 && intent != null && this.O != null) {
            boolean z10 = true;
            boolean z11 = false;
            if (intent.getData() != null) {
                String path = AndroidUtilities.getPath(intent.getData());
                if (path != null) {
                    if (path.startsWith("content://")) {
                        path = MediaController.copyFileToCache(intent.getData(), "mp3");
                    }
                    if (this.O.f30035p0.M(new File(path))) {
                        getMediaDataController().uploadRingtone(path);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        z11 = z10;
                    }
                }
                z10 = false;
                z11 = z10;
            } else if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                boolean z12 = false;
                for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                    Uri uri = clipData.getItemAt(i12).getUri();
                    String uri2 = uri.toString();
                    if (uri2.startsWith("content://")) {
                        uri2 = MediaController.copyFileToCache(uri, "mp3");
                    }
                    if (this.O.f30035p0.M(new File(uri2))) {
                        getMediaDataController().uploadRingtone(uri2);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                this.O.dismiss();
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.L = getArguments().getLong("dialog_id", 0L);
            this.Q = getArguments().getLong("topic_id", 0L);
            this.M = getArguments().getInt("type", -1);
        }
        long j3 = this.L;
        if (j3 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, this.Q);
            str2 = v7.j.g("sound_document_id_", sharedPrefKey);
            str = v7.j.g("sound_path_", sharedPrefKey);
        } else {
            int i10 = this.M;
            if (i10 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i10 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i10 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i10 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else if (i10 != 4 && i10 != 5) {
                throw new RuntimeException("Unsupported type");
            } else {
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j10 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        ?? obj = new Object();
        this.N = obj;
        if (j10 != 0) {
            obj.e = new TLRPC.TL_document();
            this.N.e.f18342id = j10;
        } else {
            obj.f36940g = string;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.H != null && this.I) {
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            if (this.L != 0) {
                str = org.telegram.messenger.f0.i(this.L, this.Q, new StringBuilder("sound_"));
                str2 = org.telegram.messenger.f0.i(this.L, this.Q, new StringBuilder("sound_path_"));
                str3 = org.telegram.messenger.f0.i(this.L, this.Q, new StringBuilder("sound_document_id_"));
                edit.putBoolean(org.telegram.messenger.f0.i(this.L, this.Q, new StringBuilder("sound_enabled_")), true);
            } else {
                int i10 = this.M;
                if (i10 == 1) {
                    str = "GlobalSound";
                    str2 = "GlobalSoundPath";
                    str3 = "GlobalSoundDocId";
                } else if (i10 == 0) {
                    str = "GroupSound";
                    str2 = "GroupSoundPath";
                    str3 = "GroupSoundDocId";
                } else if (i10 == 2) {
                    str = "ChannelSound";
                    str2 = "ChannelSoundPath";
                    str3 = "ChannelSoundDocId";
                } else if (i10 == 3) {
                    str = "StoriesSound";
                    str2 = "StoriesSoundPath";
                    str3 = "StoriesSoundDocId";
                } else if (i10 != 5 && i10 != 4) {
                    throw new RuntimeException("Unsupported type");
                } else {
                    str = "ReactionSound";
                    str2 = "ReactionSoundPath";
                    str3 = "ReactionSoundDocId";
                }
            }
            qk0 qk0Var = this.H;
            if (qk0Var.f36936a && (document = qk0Var.e) != null) {
                edit.putLong(str3, document.f18342id);
                edit.putString(str, this.H.f36939f);
                edit.putString(str2, "NoSound");
            } else if (qk0Var.f36940g != null) {
                edit.putString(str, qk0Var.f36939f);
                edit.putString(str2, this.H.f36940g);
                edit.remove(str3);
            } else if (qk0Var.f36937b) {
                edit.putString(str, "Default");
                edit.putString(str2, "Default");
                edit.remove(str3);
            } else {
                edit.putString(str, "NoSound");
                edit.putString(str2, "NoSound");
                edit.remove(str3);
            }
            edit.apply();
            if (this.L != 0) {
                getNotificationsController().updateServerNotificationsSettings(this.L, this.Q);
                return;
            }
            getNotificationsController().updateServerNotificationsSettings(this.M);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.e.setClipToPadding(false);
        this.e.setPadding(0, 0, 0, i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override
    public final void onResume() {
        super.onResume();
        getNotificationCenter().addObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void O() {
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
