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
    public final int f40113a;
    public final org.telegram.ui.ActionBar.d6 f40114b;
    public final ArrayList f40115c;
    public final wb1 d;
    public final org.telegram.ui.Components.u00 e;
    public boolean f40116f;
    public final wc h;
    public boolean f40117n;
    public Utilities.Callback f40118r;
    public String f40119s;
    public TLRPC.WallPaper v;
    public final HashMap f40120w;
    public final HashMap f40121x;

    public yc(int i10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.f40115c = new ArrayList();
        this.f40120w = new HashMap();
        this.f40121x = new HashMap();
        this.f40113a = i10;
        this.f40114b = d6Var;
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(getContext(), d6Var);
        this.e = u00Var;
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        addView(u00Var, w7.y5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        wb1 wb1Var = new wb1(activity, 4, d6Var);
        this.d = wb1Var;
        wb1Var.setClipToPadding(false);
        wb1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        wb1Var.setLayoutManager(c0Var);
        wb1Var.setAlpha(0.0f);
        wc wcVar = new wc(this, i10, d6Var);
        this.h = wcVar;
        wb1Var.setAdapter(wcVar);
        addView(wb1Var, w7.y5.c(130.0f, -1));
        wb1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new xc(this, i10), true);
        if (!this.f40117n) {
            AndroidUtilities.updateViewVisibilityAnimated(u00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(u00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f40119s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f40115c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) arrayList.get(i11);
            if (!TextUtils.equals(this.f40119s, mpVar.a()) && (!TextUtils.isEmpty(str) || !mpVar.f26565a.f18757a)) {
                z11 = false;
            }
            mpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        wb1 wb1Var = this.d;
        if (i10 >= 0 && !z10 && (wb1Var.getLayoutManager() instanceof s4.c0)) {
            ((s4.c0) wb1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < wb1Var.getChildCount(); i12++) {
            View childAt = wb1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.h21) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.h21) childAt).g(((org.telegram.ui.Components.mp) arrayList.get(R)).d, true);
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
            ArrayList arrayList = this.f40115c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.mp) arrayList.get(0)).f26565a.f18757a) && this.f40116f) {
                arrayList.add(0, new org.telegram.ui.Components.mp(org.telegram.ui.ActionBar.b4.a(this.f40113a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f40118r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f40116f = z10;
    }
}
