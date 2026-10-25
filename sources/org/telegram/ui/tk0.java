package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
public final class tk0 extends org.telegram.ui.ActionBar.r2 implements org.telegram.ui.Components.ek, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public rk0 G;
    public boolean H;
    public final SparseArray I;
    public org.telegram.ui.Components.po J;
    public long K;
    public int L;
    public rk0 M;
    public org.telegram.ui.Components.ti N;
    public Ringtone O;
    public long P;
    public int Q;
    public int R;
    public final ArrayList f43853a;
    public final ArrayList f43854b;
    public final ArrayList f43855c;
    public org.telegram.ui.Components.mm0 d;
    public qk0 e;
    public final org.telegram.ui.ActionBar.u6 f43856f;
    public int h;
    public int f43857n;
    public int f43858r;
    public int f43859s;
    public int v;
    public int f43860w;
    public int f43861x;
    public int f43862y;

    public tk0(Bundle bundle, org.telegram.ui.ActionBar.u6 u6Var) {
        super(bundle);
        this.f43853a = new ArrayList();
        this.f43854b = new ArrayList();
        this.f43855c = new ArrayList();
        this.F = 100;
        this.I = new SparseArray();
        this.L = -1;
        this.P = 0L;
        this.f43856f = u6Var;
    }

    public static void V(org.telegram.ui.tk0 r9, android.content.Context r10, android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tk0.V(org.telegram.ui.tk0, android.content.Context, android.view.View, int):void");
    }

    public static void X(tk0 tk0Var) {
        tk0Var.I.clear();
        qk0 qk0Var = tk0Var.e;
        qk0Var.q(0, qk0Var.f42861c.h);
        tk0Var.d0();
    }

    public static void b0(View view, int i10, int i11) {
        if (view instanceof org.telegram.ui.Cells.e2) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            for (int i12 = 0; i12 < e2Var.getChildCount(); i12++) {
                View childAt = e2Var.getChildAt(i12);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.ar) {
                        org.telegram.ui.Components.ar arVar = (org.telegram.ui.Components.ar) imageView.getDrawable();
                        Drawable drawable = arVar.f26590a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = arVar.f26591b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String c0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        if (TextUtils.isEmpty(str) && document != null) {
            return LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
        }
        return str;
    }

    public final void a0(rk0 rk0Var) {
        int i10 = rk0Var.f43176c;
        SparseArray sparseArray = this.I;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(rk0Var.f43176c);
        } else if (rk0Var.f43174a) {
            sparseArray.put(rk0Var.f43176c, rk0Var);
        } else {
            return;
        }
        d0();
        qk0 qk0Var = this.e;
        qk0Var.q(0, qk0Var.f42861c.h);
    }

    @Override
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new pk0(this, context));
        if (this.K == 0) {
            int i10 = this.L;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundPrivate));
            } else if (i10 == 0) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundGroup));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundChannels));
            } else if (i10 == 3) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundStories));
            } else if (i10 == 5 || i10 == 4) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundReactions));
            }
        } else {
            this.J = new org.telegram.ui.Components.po(context, null, false, this.f43856f);
            if (this.K < 0) {
                if (this.P != 0) {
                    TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.K, this.P);
                    pg.d.p(this.J.getAvatarImageView(), findTopic, false, true, this.f43856f);
                    this.simpleActionBar.setTitle(findTopic.title);
                } else {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.K));
                    this.J.setChatAvatar(chat);
                    this.simpleActionBar.setTitle(chat.title);
                }
            } else {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.K));
                if (user != null) {
                    this.J.setUserAvatar(user);
                    this.simpleActionBar.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            }
            this.simpleActionBar.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
            AndroidUtilities.removeFromParent(this.J.e);
            this.simpleActionBar.addView(this.J.e, org.telegram.ui.Components.gb1.h(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.x5 h = this.simpleActionBar.h();
        h.c(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        h.c(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.d = mm0Var;
        mm0Var.u1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        qk0 qk0Var = new qk0(this);
        this.e = qk0Var;
        qk0Var.C(true);
        this.d.setAdapter(this.e);
        ((s4.l) this.d.getItemAnimator()).f47760m = false;
        ((s4.l) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new s4.c0());
        this.d.setOnItemClickListener(new di.x4(20, this, context));
        this.d.setOnItemLongClickListener(new qt(this, 28));
        getMediaDataController().ringtoneDataStore.g(false);
        this.f43853a.clear();
        this.f43854b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.e.size(); i11++) {
            xf.b bVar = (xf.b) getMediaDataController().ringtoneDataStore.e.get(i11);
            ?? obj = new Object();
            int i12 = this.F;
            this.F = i12 + 1;
            obj.f43176c = i12;
            obj.f43174a = true;
            obj.d = bVar.f51738c;
            TLRPC.Document document3 = bVar.f51736a;
            String str = document3.file_name_fixed;
            obj.f43177f = str;
            obj.e = document3;
            obj.f43177f = c0(document3, str);
            obj.f43178g = bVar.f51737b;
            rk0 rk0Var = this.M;
            if (rk0Var != null && (document = rk0Var.e) != null && (document2 = bVar.f51736a) != null && document.f22033id == document2.f22033id) {
                this.M = null;
                this.G = obj;
            }
            this.f43853a.add(obj);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ?? obj2 = new Object();
        int i13 = this.F;
        this.F = i13 + 1;
        obj2.f43176c = i13;
        obj2.f43177f = LocaleController.getString(R.string.NoSound);
        this.f43854b.add(obj2);
        ?? obj3 = new Object();
        int i14 = this.F;
        this.F = i14 + 1;
        obj3.f43176c = i14;
        obj3.f43177f = LocaleController.getString(R.string.DefaultRingtone);
        obj3.f43175b = true;
        this.f43854b.add(obj3);
        rk0 rk0Var2 = this.M;
        if (rk0Var2 != null && rk0Var2.e == null && rk0Var2.f43178g.equals("NoSound")) {
            this.M = null;
            this.G = obj2;
        }
        rk0 rk0Var3 = this.M;
        if (rk0Var3 != null && rk0Var3.e == null && rk0Var3.f43178g.equals("Default")) {
            this.M = null;
            this.G = obj3;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ?? obj4 = new Object();
            int i15 = this.F;
            this.F = i15 + 1;
            obj4.f43176c = i15;
            obj4.f43177f = string;
            obj4.f43178g = str2;
            rk0 rk0Var4 = this.M;
            if (rk0Var4 != null && rk0Var4.e == null && rk0Var4.f43178g.equals(str2)) {
                this.M = null;
                this.G = obj4;
            }
            this.f43854b.add(obj4);
        }
        if (getMediaDataController().ringtoneDataStore.f51744f && this.G == null) {
            this.G = obj3;
            this.H = true;
        }
        e0();
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        SparseArray sparseArray = this.I;
        if (sparseArray.size() > 0) {
            this.simpleActionBar.t(sparseArray.size(), this.simpleActionBar.o());
            this.simpleActionBar.x();
            return;
        }
        this.simpleActionBar.n();
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
                arrayList = this.f43853a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((rk0) arrayList.get(i12)).d), (rk0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                xf.b bVar = (xf.b) getMediaDataController().ringtoneDataStore.e.get(i13);
                ?? obj = new Object();
                rk0 rk0Var = (rk0) hashMap.get(Integer.valueOf(bVar.f51738c));
                if (rk0Var != null) {
                    if (rk0Var == this.G) {
                        this.G = obj;
                    }
                    obj.f43176c = rk0Var.f43176c;
                } else {
                    int i14 = this.F;
                    this.F = i14 + 1;
                    obj.f43176c = i14;
                }
                obj.f43174a = true;
                obj.d = bVar.f51738c;
                TLRPC.Document document3 = bVar.f51736a;
                if (document3 != null) {
                    obj.f43177f = document3.file_name_fixed;
                } else {
                    obj.f43177f = new File(bVar.f51737b).getName();
                }
                TLRPC.Document document4 = bVar.f51736a;
                obj.e = document4;
                obj.f43177f = c0(document4, obj.f43177f);
                obj.f43178g = bVar.f51737b;
                rk0 rk0Var2 = this.M;
                if (rk0Var2 != null && (document = rk0Var2.e) != null && (document2 = bVar.f51736a) != null && document.f22033id == document2.f22033id) {
                    this.M = null;
                    this.G = obj;
                }
                arrayList.add(obj);
            }
            e0();
            this.e.l();
            if (getMediaDataController().ringtoneDataStore.f51744f && this.G == null) {
                ArrayList arrayList2 = this.f43854b;
                if (arrayList2.size() > 0) {
                    this.M = null;
                    this.G = (rk0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0() {
        this.f43857n = -1;
        this.f43858r = -1;
        this.f43859s = -1;
        this.v = -1;
        this.f43861x = -1;
        this.f43862y = -1;
        this.E = -1;
        this.h = 1;
        ArrayList arrayList = this.f43853a;
        if (!arrayList.isEmpty()) {
            int i10 = this.h;
            this.f43857n = i10;
            int size = arrayList.size() + i10;
            this.h = size;
            this.f43858r = size;
        }
        int i11 = this.h;
        this.f43859s = i11;
        this.h = i11 + 2;
        this.v = i11 + 1;
        ArrayList arrayList2 = this.f43854b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.h;
            int i13 = i12 + 1;
            this.h = i13;
            this.f43861x = i12;
            this.f43862y = i13;
            int size2 = arrayList2.size() + i13;
            this.h = size2;
            this.E = size2;
        }
        int i14 = this.h;
        this.h = i14 + 1;
        this.f43860w = i14;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.f43856f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            getMediaDataController().uploadRingtone((String) arrayList.get(i11));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 21 && intent != null && this.N != null) {
            boolean z10 = true;
            boolean z11 = false;
            if (intent.getData() != null) {
                String path = AndroidUtilities.getPath(intent.getData());
                if (path != null) {
                    if (path.startsWith("content://")) {
                        path = MediaController.copyFileToCache(intent.getData(), "mp3");
                    }
                    if (this.N.f33047p0.P(new File(path))) {
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
                    if (this.N.f33047p0.P(new File(uri2))) {
                        getMediaDataController().uploadRingtone(uri2);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                this.N.dismiss();
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.K = getArguments().getLong("dialog_id", 0L);
            this.P = getArguments().getLong("topic_id", 0L);
            this.L = getArguments().getInt("type", -1);
        }
        long j10 = this.K;
        if (j10 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.P);
            str2 = org.telegram.ui.Components.b10.j("sound_document_id_", sharedPrefKey);
            str = org.telegram.ui.Components.b10.j("sound_path_", sharedPrefKey);
        } else {
            int i10 = this.L;
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
        long j11 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        ?? obj = new Object();
        this.M = obj;
        if (j11 != 0) {
            obj.e = new TLRPC.TL_document();
            this.M.e.f22033id = j11;
        } else {
            obj.f43178g = string;
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
        if (this.G != null && this.H) {
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            if (this.K != 0) {
                str = org.telegram.messenger.t.j(this.K, this.P, new StringBuilder("sound_"));
                str2 = org.telegram.messenger.t.j(this.K, this.P, new StringBuilder("sound_path_"));
                str3 = org.telegram.messenger.t.j(this.K, this.P, new StringBuilder("sound_document_id_"));
                edit.putBoolean(org.telegram.messenger.t.j(this.K, this.P, new StringBuilder("sound_enabled_")), true);
            } else {
                int i10 = this.L;
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
            rk0 rk0Var = this.G;
            if (rk0Var.f43174a && (document = rk0Var.e) != null) {
                edit.putLong(str3, document.f22033id);
                edit.putString(str, this.G.f43177f);
                edit.putString(str2, "NoSound");
            } else if (rk0Var.f43178g != null) {
                edit.putString(str, rk0Var.f43177f);
                edit.putString(str2, this.G.f43178g);
                edit.remove(str3);
            } else if (rk0Var.f43175b) {
                edit.putString(str, "Default");
                edit.putString(str2, "Default");
                edit.remove(str3);
            } else {
                edit.putString(str, "NoSound");
                edit.putString(str2, "NoSound");
                edit.remove(str3);
            }
            edit.apply();
            if (this.K != 0) {
                getNotificationsController().updateServerNotificationsSettings(this.K, this.P);
                return;
            }
            getNotificationsController().updateServerNotificationsSettings(this.L);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
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
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.u6 u6Var = this.f43856f;
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.N6, u6Var);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23483k7, u6Var);
            if (this.d != null) {
                if (w02 == this.Q && w03 == this.R) {
                    return;
                }
                this.Q = w02;
                this.R = w03;
                for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                    b0(this.d.getChildAt(i10), w02, w03);
                }
                for (int i11 = 0; i11 < this.d.getCachedChildCount(); i11++) {
                    b0(this.d.P(i11), w02, w03);
                }
                for (int i12 = 0; i12 < this.d.getHiddenChildCount(); i12++) {
                    b0(this.d.V(i12), w02, w03);
                }
                for (int i13 = 0; i13 < this.d.getAttachedScrapChildCount(); i13++) {
                    b0(this.d.O(i13), w02, w03);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void x() {
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
    public final void P() {
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
