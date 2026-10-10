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
    public final int f44583a;
    public final org.telegram.ui.ActionBar.e6 f44584b;
    public final ArrayList f44585c;
    public final fc1 d;
    public final org.telegram.ui.Components.k10 f44586e;
    public boolean f44587f;
    public final xc h;
    public boolean f44588n;
    public Utilities.Callback f44589r;
    public String f44590s;
    public TLRPC.WallPaper v;
    public final HashMap f44591w;
    public final HashMap f44592x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f44585c = new ArrayList();
        this.f44591w = new HashMap();
        this.f44592x = new HashMap();
        this.f44583a = i10;
        this.f44584b = e6Var;
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(getContext(), e6Var);
        this.f44586e = k10Var;
        k10Var.setViewType(14);
        k10Var.setVisibility(0);
        addView(k10Var, w7.x5.a(104.0f, 16.0f, 13.0f, 16.0f, 6.0f, -1, 8388611));
        fc1 fc1Var = new fc1(activity, 4, e6Var);
        this.d = fc1Var;
        fc1Var.setClipToPadding(false);
        fc1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.d0 d0Var = new s4.d0();
        d0Var.j1(0);
        fc1Var.setLayoutManager(d0Var);
        fc1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, e6Var);
        this.h = xcVar;
        fc1Var.setAdapter(xcVar);
        addView(fc1Var, w7.x5.d(130.0f, -1));
        fc1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f44588n) {
            AndroidUtilities.updateViewVisibilityAnimated(k10Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(k10Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f44590s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f44585c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.bq bqVar = (org.telegram.ui.Components.bq) arrayList.get(i11);
            if (!TextUtils.equals(this.f44590s, bqVar.a()) && (!TextUtils.isEmpty(str) || !bqVar.f25019a.f20509a)) {
                z11 = false;
            }
            bqVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        fc1 fc1Var = this.d;
        if (i10 >= 0 && !z10 && (fc1Var.getLayoutManager() instanceof s4.d0)) {
            ((s4.d0) fc1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < fc1Var.getChildCount(); i12++) {
            View childAt = fc1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.a31) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.a31) childAt).g(((org.telegram.ui.Components.bq) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new vc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f44585c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.bq) arrayList.get(0)).f25019a.f20509a) && this.f44587f) {
                arrayList.add(0, new org.telegram.ui.Components.bq(org.telegram.ui.ActionBar.c4.a(this.f44583a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f44589r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f44587f = z10;
    }
}
