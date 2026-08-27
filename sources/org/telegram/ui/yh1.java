package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class yh1 extends org.telegram.ui.Components.yk0 {

    public final Context f44839c;
    public final WallpapersListActivity d;

    public yh1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.f44839c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 0;
    }

    @Override
    public final int h() {
        return this.d.f36304a;
    }

    @Override
    public final int j(int i10) {
        WallpapersListActivity wallpapersListActivity = this.d;
        if (i10 == wallpapersListActivity.uploadImageRow || i10 == wallpapersListActivity.f36316r || i10 == wallpapersListActivity.f36306b || i10 == wallpapersListActivity.h) {
            return 0;
        }
        if (i10 == wallpapersListActivity.f36308c || i10 == wallpapersListActivity.f36313f) {
            return 1;
        }
        return (i10 == wallpapersListActivity.f36315n || i10 == wallpapersListActivity.f36317s) ? 3 : 2;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        long j10;
        Object obj;
        String str;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.f36305a0;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (i10 == wallpapersListActivity.uploadImageRow) {
                l8Var.m(R.drawable.msg_photos, LocaleController.getString(R.string.SelectFromGallery), true);
                return;
            }
            if (i10 == wallpapersListActivity.f36306b) {
                l8Var.m(R.drawable.msg_palette, LocaleController.getString(R.string.SetColor), true);
                return;
            }
            if (i10 == wallpapersListActivity.h) {
                l8Var.i(LocaleController.getString(R.string.ResetChatBackgrounds), false);
                return;
            } else {
                if (i10 == wallpapersListActivity.f36316r) {
                    l8Var.m(R.drawable.msg_background, "Choose from gallery", false);
                    l8Var.h(10);
                    return;
                }
                return;
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == wallpapersListActivity.f36315n) {
                x8Var.setText(LocaleController.getString(R.string.ResetChatBackgroundsInfo));
                return;
            } else {
                if (i10 == wallpapersListActivity.f36317s) {
                    x8Var.setText("Upload your own background for the channel.");
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
        int i12 = i10 - wallpapersListActivity.d;
        int i13 = wallpapersListActivity.N;
        int i14 = i12 * i13;
        waVar.d(i13, i14 == 0, i14 / i13 == wallpapersListActivity.f36311e - 1);
        for (int i15 = 0; i15 < wallpapersListActivity.N; i15++) {
            int i16 = i14 + i15;
            Object obj2 = i16 < arrayList.size() ? arrayList.get(i16) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.g6.I.f22949e0;
                obj = (wallpapersListActivity.O.equals(tL_wallPaper.slug) && (!wallpapersListActivity.O.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.P == org.telegram.ui.ActionBar.g6.X0(wallPaperSettings.background_color) && wallpapersListActivity.Q == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.R == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.S == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.Q == 0 || wallpapersListActivity.R != 0 || wallpapersListActivity.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(org.telegram.ui.ActionBar.g6.R0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.U) <= 0.001f)))) ? tL_wallPaper : null;
                j10 = tL_wallPaper.f22532id;
            } else if (obj2 instanceof wh1) {
                wh1 wh1Var = (wh1) obj2;
                if ("d".equals(wh1Var.f44120a) && (str = wallpapersListActivity.O) != null && str.equals(wh1Var.f44120a)) {
                    obj = obj2;
                } else {
                    if (wh1Var.f44121b == wallpapersListActivity.P) {
                        int i17 = wh1Var.f44122c;
                        int i18 = wallpapersListActivity.Q;
                        if (i17 == i18 && wh1Var.d == wallpapersListActivity.R && wh1Var.f44123e == wallpapersListActivity.S && ((i18 == 0 || wh1Var.f44124f == wallpapersListActivity.T) && ((!"c".equals(wallpapersListActivity.O) || wh1Var.f44120a == null) && ("c".equals(wallpapersListActivity.O) || (TextUtils.equals(wallpapersListActivity.O, wh1Var.f44120a) && ((int) (wh1Var.h * 100.0f)) == ((int) (wallpapersListActivity.U * 100.0f))))))) {
                            obj = obj2;
                        }
                    }
                    obj = null;
                }
                TLRPC.WallPaper wallPaper = wh1Var.f44129l;
                j10 = wallPaper != null ? wallPaper.f22532id : 0L;
            } else if (obj2 instanceof xh1) {
                obj = wallpapersListActivity.O.equals(((xh1) obj2).f44467a) ? obj2 : null;
            } else {
                j10 = 0;
                obj = null;
            }
            waVar.e(wallpapersListActivity.v, obj2, obj, i15);
            if (((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar.t()) {
                waVar.c(i15, wallpapersListActivity.f36312e0.indexOfKey(j10) >= 0, !wallpapersListActivity.f36314f0);
            } else {
                waVar.c(i15, false, !wallpapersListActivity.f36314f0);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View l8Var;
        Context context = this.f44839c;
        if (i10 == 0) {
            l8Var = new org.telegram.ui.Cells.l8(context);
        } else if (i10 != 1) {
            l8Var = i10 != 3 ? new org.telegram.ui.Components.ti(this, context, 1) : new org.telegram.ui.Cells.x8(context);
        } else {
            l8Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        }
        return new org.telegram.ui.Components.lk0(l8Var);
    }
}
