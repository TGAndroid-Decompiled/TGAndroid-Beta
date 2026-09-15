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
public final class yk0 extends org.telegram.ui.ActionBar.n2 implements org.telegram.ui.Components.fk, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public wk0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.eo K;
    public long L;
    public int M;
    public wk0 N;
    public org.telegram.ui.Components.vi O;
    public Ringtone P;
    public long Q;
    public final ArrayList f39924a;
    public final ArrayList f39925b;
    public final ArrayList f39926c;
    public NumberTextView d;
    public org.telegram.ui.Components.ll0 e;
    public vk0 f39927f;
    public final org.telegram.ui.ActionBar.e6 h;
    public int f39928n;
    public int f39929r;
    public int f39930s;
    public int v;
    public int f39931w;
    public int f39932x;
    public int f39933y;

    public yk0(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.f39924a = new ArrayList();
        this.f39925b = new ArrayList();
        this.f39926c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.h = e6Var;
    }

    public static void U(org.telegram.ui.yk0 r9, android.content.Context r10, android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yk0.U(org.telegram.ui.yk0, android.content.Context, android.view.View, int):void");
    }

    public static void W(yk0 yk0Var) {
        yk0Var.J.clear();
        vk0 vk0Var = yk0Var.f39927f;
        vk0Var.q(0, vk0Var.f38640c.f39928n);
        yk0Var.b0();
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

    public final void Z(wk0 wk0Var) {
        int i10 = wk0Var.f39254c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(wk0Var.f39254c);
        } else if (wk0Var.f39252a) {
            sparseArray.put(wk0Var.f39254c, wk0Var);
        } else {
            return;
        }
        b0();
        vk0 vk0Var = this.f39927f;
        vk0Var.q(0, vk0Var.f38640c.f39928n);
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
        this.f39929r = -1;
        this.f39930s = -1;
        this.v = -1;
        this.f39931w = -1;
        this.f39933y = -1;
        this.E = -1;
        this.F = -1;
        this.f39928n = 1;
        ArrayList arrayList = this.f39924a;
        if (!arrayList.isEmpty()) {
            int i10 = this.f39928n;
            this.f39929r = i10;
            int size = arrayList.size() + i10;
            this.f39928n = size;
            this.f39930s = size;
        }
        int i11 = this.f39928n;
        this.v = i11;
        this.f39928n = i11 + 2;
        this.f39931w = i11 + 1;
        ArrayList arrayList2 = this.f39925b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f39928n;
            int i13 = i12 + 1;
            this.f39928n = i13;
            this.f39933y = i12;
            this.E = i13;
            int size2 = arrayList2.size() + i13;
            this.f39928n = size2;
            this.F = size2;
        }
        int i14 = this.f39928n;
        this.f39928n = i14 + 1;
        this.f39932x = i14;
    }

    @Override
    public final View createView(Context context) {
        float f7;
        TLRPC.Document document;
        TLRPC.Document document2;
        this.actionBar.A(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18873f8, this.h), false);
        this.actionBar.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19168v8, this.h), false);
        hg.k0.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new uk0(this, context));
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
            org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(context, null, false, this.h);
            this.K = eoVar;
            eoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            org.telegram.ui.Components.eo eoVar2 = this.K;
            if (!this.inPreviewMode) {
                f7 = 56.0f;
            } else {
                f7 = 0.0f;
            }
            kVar.addView(eoVar2, 0, w7.x5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
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
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.d = numberTextView;
        numberTextView.setTextSize(18);
        this.d.setTypeface(AndroidUtilities.bold());
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19220y8, this.h));
        j3.addView(this.d, w7.x5.m(1.0f, 0, -1, 72, 0, 0));
        this.d.setOnTouchListener(new bi.d(2));
        j3.h(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        j3.h(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18780a7, this.h));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.e = ll0Var;
        ll0Var.p1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, w7.x5.c(-1.0f, -1));
        vk0 vk0Var = new vk0(this);
        this.f39927f = vk0Var;
        vk0Var.C(true);
        this.e.setAdapter(this.f39927f);
        ((s4.j) this.e.getItemAnimator()).f42710m = false;
        ((s4.j) this.e.getItemAnimator()).C = false;
        this.e.setLayoutManager(new s4.c0());
        this.e.setOnItemClickListener(new ai.o6(20, this, context));
        this.e.setOnItemLongClickListener(new hu(this, 27));
        getMediaDataController().ringtoneDataStore.g(false);
        this.f39924a.clear();
        this.f39925b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.e.size(); i11++) {
            uf.b bVar = (uf.b) getMediaDataController().ringtoneDataStore.e.get(i11);
            ?? obj = new Object();
            int i12 = this.G;
            this.G = i12 + 1;
            obj.f39254c = i12;
            obj.f39252a = true;
            obj.d = bVar.f43692c;
            TLRPC.Document document3 = bVar.f43690a;
            String str = document3.file_name_fixed;
            obj.f39255f = str;
            obj.e = document3;
            obj.f39255f = a0(document3, str);
            obj.f39256g = bVar.f43691b;
            wk0 wk0Var = this.N;
            if (wk0Var != null && (document = wk0Var.e) != null && (document2 = bVar.f43690a) != null && document.f18118id == document2.f18118id) {
                this.N = null;
                this.H = obj;
            }
            this.f39924a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i13 = this.G;
        this.G = i13 + 1;
        obj2.f39254c = i13;
        obj2.f39255f = LocaleController.getString(R.string.NoSound);
        this.f39925b.add(obj2);
        ?? obj3 = new Object();
        int i14 = this.G;
        this.G = i14 + 1;
        obj3.f39254c = i14;
        obj3.f39255f = LocaleController.getString(R.string.DefaultRingtone);
        obj3.f39253b = true;
        this.f39925b.add(obj3);
        wk0 wk0Var2 = this.N;
        if (wk0Var2 != null && wk0Var2.e == null && wk0Var2.f39256g.equals("NoSound")) {
            this.N = null;
            this.H = obj2;
        }
        wk0 wk0Var3 = this.N;
        if (wk0Var3 != null && wk0Var3.e == null && wk0Var3.f39256g.equals("Default")) {
            this.N = null;
            this.H = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i15 = this.G;
            this.G = i15 + 1;
            obj4.f39254c = i15;
            obj4.f39255f = string;
            obj4.f39256g = str2;
            wk0 wk0Var4 = this.N;
            if (wk0Var4 != null && wk0Var4.e == null && wk0Var4.f39256g.equals(str2)) {
                this.N = null;
                this.H = obj4;
            }
            this.f39925b.add(obj4);
        }
        if (getMediaDataController().ringtoneDataStore.f43698f && this.H == null) {
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
                arrayList = this.f39924a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((wk0) arrayList.get(i12)).d), (wk0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                uf.b bVar = (uf.b) getMediaDataController().ringtoneDataStore.e.get(i13);
                ?? obj = new Object();
                wk0 wk0Var = (wk0) hashMap.get(Integer.valueOf(bVar.f43692c));
                if (wk0Var != null) {
                    if (wk0Var == this.H) {
                        this.H = obj;
                    }
                    obj.f39254c = wk0Var.f39254c;
                } else {
                    int i14 = this.G;
                    this.G = i14 + 1;
                    obj.f39254c = i14;
                }
                obj.f39252a = true;
                obj.d = bVar.f43692c;
                TLRPC.Document document3 = bVar.f43690a;
                if (document3 != null) {
                    obj.f39255f = document3.file_name_fixed;
                } else {
                    obj.f39255f = new File(bVar.f43691b).getName();
                }
                TLRPC.Document document4 = bVar.f43690a;
                obj.e = document4;
                obj.f39255f = a0(document4, obj.f39255f);
                obj.f39256g = bVar.f43691b;
                wk0 wk0Var2 = this.N;
                if (wk0Var2 != null && (document = wk0Var2.e) != null && (document2 = bVar.f43690a) != null && document.f18118id == document2.f18118id) {
                    this.N = null;
                    this.H = obj;
                }
                arrayList.add(obj);
            }
            c0();
            this.f39927f.l();
            if (getMediaDataController().ringtoneDataStore.f43698f && this.H == null) {
                ArrayList arrayList2 = this.f39925b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (wk0) arrayList2.get(0);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
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
                    if (this.O.f28779p0.M(new File(path))) {
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
                    if (this.O.f28779p0.M(new File(uri2))) {
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
            str2 = org.telegram.ui.Cells.p6.i("sound_document_id_", sharedPrefKey);
            str = org.telegram.ui.Cells.p6.i("sound_path_", sharedPrefKey);
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
            this.N.e.f18118id = j10;
        } else {
            obj.f39256g = string;
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
                str = org.telegram.messenger.w1.i(this.L, this.Q, new StringBuilder("sound_"));
                str2 = org.telegram.messenger.w1.i(this.L, this.Q, new StringBuilder("sound_path_"));
                str3 = org.telegram.messenger.w1.i(this.L, this.Q, new StringBuilder("sound_document_id_"));
                edit.putBoolean(org.telegram.messenger.w1.i(this.L, this.Q, new StringBuilder("sound_enabled_")), true);
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
            wk0 wk0Var = this.H;
            if (wk0Var.f39252a && (document = wk0Var.e) != null) {
                edit.putLong(str3, document.f18118id);
                edit.putString(str, this.H.f39255f);
                edit.putString(str2, "NoSound");
            } else if (wk0Var.f39256g != null) {
                edit.putString(str, wk0Var.f39255f);
                edit.putString(str2, this.H.f39256g);
                edit.remove(str3);
            } else if (wk0Var.f39253b) {
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
