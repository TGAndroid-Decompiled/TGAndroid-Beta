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
public final class yc extends FrameLayout {
    public final int f39837a;
    public final org.telegram.ui.ActionBar.e6 f39838b;
    public final ArrayList f39839c;
    public final dc1 d;
    public final org.telegram.ui.Components.t00 e;
    public boolean f39840f;
    public final wc h;
    public boolean f39841n;
    public Utilities.Callback f39842r;
    public String f39843s;
    public TLRPC.WallPaper v;
    public final HashMap f39844w;
    public final HashMap f39845x;

    public yc(int i10, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f39839c = new ArrayList();
        this.f39844w = new HashMap();
        this.f39845x = new HashMap();
        this.f39837a = i10;
        this.f39838b = e6Var;
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getContext(), e6Var);
        this.e = t00Var;
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        dc1 dc1Var = new dc1(activity, 4, e6Var);
        this.d = dc1Var;
        dc1Var.setClipToPadding(false);
        dc1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        dc1Var.setLayoutManager(c0Var);
        dc1Var.setAlpha(0.0f);
        wc wcVar = new wc(this, i10, e6Var);
        this.h = wcVar;
        dc1Var.setAdapter(wcVar);
        addView(dc1Var, w7.x5.c(130.0f, -1));
        dc1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new xc(this, i10), true);
        if (!this.f39841n) {
            AndroidUtilities.updateViewVisibilityAnimated(t00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(t00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f39843s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f39839c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(i11);
            if (!TextUtils.equals(this.f39843s, lpVar.a()) && (!TextUtils.isEmpty(str) || !lpVar.f25994a.f18589a)) {
                z11 = false;
            }
            lpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        dc1 dc1Var = this.d;
        if (i10 >= 0 && !z10 && (dc1Var.getLayoutManager() instanceof s4.c0)) {
            ((s4.c0) dc1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < dc1Var.getChildCount(); i12++) {
            View childAt = dc1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.u11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.u11) childAt).g(((org.telegram.ui.Components.lp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (e2.h) new uc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f39839c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.lp) arrayList.get(0)).f25994a.f18589a) && this.f39840f) {
                arrayList.add(0, new org.telegram.ui.Components.lp(org.telegram.ui.ActionBar.d4.a(this.f39837a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f39842r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f39840f = z10;
    }
}
