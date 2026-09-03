package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zc extends FrameLayout {
    public final int f43891a;
    public final org.telegram.ui.ActionBar.g6 f43892b;
    public final ArrayList f43893c;
    public final qb1 d;
    public final org.telegram.ui.Components.u00 f43894e;
    public boolean f43895f;
    public final wc h;
    public boolean f43896n;
    public Utilities.Callback f43897r;
    public String f43898s;
    public TLRPC.WallPaper v;
    public final HashMap f43899w;
    public final HashMap f43900x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f43893c = new ArrayList();
        this.f43899w = new HashMap();
        this.f43900x = new HashMap();
        this.f43891a = i10;
        this.f43892b = g6Var;
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(getContext(), g6Var);
        this.f43894e = u00Var;
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        addView(u00Var, k7.c6.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        qb1 qb1Var = new qb1(activity, 3, g6Var);
        this.d = qb1Var;
        qb1Var.setClipToPadding(false);
        qb1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        qb1Var.setLayoutManager(j0Var);
        qb1Var.setAlpha(0.0f);
        wc wcVar = new wc(this, i10, g6Var);
        this.h = wcVar;
        qb1Var.setAdapter(wcVar);
        addView(qb1Var, k7.c6.c(130.0f, -1));
        qb1Var.setOnItemClickListener(new j(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f43896n) {
            AndroidUtilities.updateViewVisibilityAnimated(u00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(u00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z4) {
        ArrayList arrayList;
        int R;
        this.f43898s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f43893c;
            boolean z10 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(i11);
            if (!TextUtils.equals(this.f43898s, lpVar.a()) && (!TextUtils.isEmpty(str) || !lpVar.f28819a.f21360a)) {
                z10 = false;
            }
            lpVar.d = z10;
            if (z10) {
                i10 = i11;
            }
            i11++;
        }
        qb1 qb1Var = this.d;
        if (i10 >= 0 && !z4 && (qb1Var.getLayoutManager() instanceof f2.j0)) {
            ((f2.j0) qb1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < qb1Var.getChildCount(); i12++) {
            View childAt = qb1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.w11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.w11) childAt).g(((org.telegram.ui.Components.lp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (h5.d) new uc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f43893c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.lp) arrayList.get(0)).f28819a.f21360a) && this.f43895f) {
                arrayList.add(0, new org.telegram.ui.Components.lp(org.telegram.ui.ActionBar.f4.a(this.f43891a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f43897r = callback;
    }

    public void setWithRemovedStub(boolean z4) {
        this.f43895f = z4;
    }
}
