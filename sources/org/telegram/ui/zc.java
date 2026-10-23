package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int f44107a;
    public final org.telegram.ui.ActionBar.g6 f44108b;
    public final ArrayList f44109c;
    public final xa1 d;
    public final org.telegram.ui.Components.b10 e;
    public boolean f44110f;
    public final xc h;
    public boolean f44111n;
    public Utilities.Callback f44112r;
    public String f44113s;
    public TLRPC.WallPaper v;
    public final HashMap f44114w;
    public final HashMap f44115x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f44109c = new ArrayList();
        this.f44114w = new HashMap();
        this.f44115x = new HashMap();
        this.f44107a = i10;
        this.f44108b = g6Var;
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(getContext(), g6Var);
        this.e = b10Var;
        b10Var.setViewType(14);
        b10Var.setVisibility(0);
        addView(b10Var, w7.z5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        xa1 xa1Var = new xa1(activity, 4, g6Var);
        this.d = xa1Var;
        xa1Var.setClipToPadding(false);
        xa1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        xa1Var.setLayoutManager(b0Var);
        xa1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, g6Var);
        this.h = xcVar;
        xa1Var.setAdapter(xcVar);
        addView(xa1Var, w7.z5.c(130.0f, -1));
        xa1Var.setOnItemClickListener(new h(this, 3));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f44111n) {
            AndroidUtilities.updateViewVisibilityAnimated(b10Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(b10Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f44113s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f44109c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList.get(i11);
            if (!TextUtils.equals(this.f44113s, vpVar.a()) && (!TextUtils.isEmpty(str) || !vpVar.f32035a.f20884a)) {
                z11 = false;
            }
            vpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        xa1 xa1Var = this.d;
        if (i10 >= 0 && !z10 && (xa1Var.getLayoutManager() instanceof s4.b0)) {
            ((s4.b0) xa1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < xa1Var.getChildCount(); i12++) {
            View childAt = xa1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.v21) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.v21) childAt).g(((org.telegram.ui.Components.vp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new uc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f44109c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.vp) arrayList.get(0)).f32035a.f20884a) && this.f44110f) {
                arrayList.add(0, new org.telegram.ui.Components.vp(org.telegram.ui.ActionBar.f4.a(this.f44107a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f44112r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f44110f = z10;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        xc xcVar;
        org.telegram.ui.ActionBar.g6 g6Var = this.f44108b;
        if (g6Var != null) {
            r02 = g6Var.a();
        } else {
            r02 = org.telegram.ui.ActionBar.k6.I.q();
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f44109c;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList.get(i10);
            if (vpVar.f32037c != r02) {
                vpVar.f32037c = r02;
                z10 = true;
            }
            i10++;
        }
        xa1 xa1Var = this.d;
        if (xa1Var != null) {
            AndroidUtilities.forEachViews((RecyclerView) xa1Var, (Utilities.Callback<View>) new uc(this, 0));
            if (z10 && (xcVar = this.h) != null) {
                xcVar.l();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
