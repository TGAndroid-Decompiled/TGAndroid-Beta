package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xy0 extends rg.b {
    public final SaveToGallerySettingsActivity d;

    public xy0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 == 1 || i7 == 2 || i7 == 4 || i7 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f43265s.size();
    }

    @Override
    public final int d(int i7) {
        return ((yy0) this.d.f43265s.get(i7)).f56015a;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        String str;
        View view = e1Var.f58535a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f43265s;
        boolean z10 = false;
        if (((yy0) arrayList.get(i7)).f56015a == 1) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (saveToGallerySettingsActivity.f43266w.size() > 0) {
                z10 = true;
            }
            l8Var.setNeedDivider(z10);
        } else if (((yy0) arrayList.get(i7)).f56015a == 6) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            org.telegram.messenger.pv c02 = saveToGallerySettingsActivity.c0();
            if (i7 == saveToGallerySettingsActivity.f43261e) {
                q8Var.f(org.telegram.messenger.hd.M0(2131745920, null), c02.f25992a, true);
                int i10 = org.telegram.ui.ActionBar.j6.ck;
                q8Var.c(saveToGallerySettingsActivity.getThemedColor(i10), 2131232139);
                SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, q8Var, i10);
                return;
            }
            q8Var.f(org.telegram.messenger.hd.M0(2131745913, null), c02.f25993b, false);
            int i11 = org.telegram.ui.ActionBar.j6.Zj;
            q8Var.c(saveToGallerySettingsActivity.getThemedColor(i11), 2131232142);
            SaveToGallerySettingsActivity.b0(saveToGallerySettingsActivity, q8Var, i11);
        } else if (((yy0) arrayList.get(i7)).f56015a == 7) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i7 == saveToGallerySettingsActivity.h) {
                long j3 = saveToGallerySettingsActivity.c0().f25994c;
                if (saveToGallerySettingsActivity.f43260c != null) {
                    y8Var.setText(org.telegram.messenger.hd.a0("SaveToGalleryVideoHintCurrent", null, 2131745916, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f43258a;
                if (i12 == 1) {
                    y8Var.setText(org.telegram.messenger.hd.a0("SaveToGalleryVideoHintUser", null, 2131745914, new Object[0]));
                    return;
                } else if (i12 == 4) {
                    y8Var.setText(org.telegram.messenger.hd.a0("SaveToGalleryVideoHintChannels", null, 2131745917, new Object[0]));
                    return;
                } else if (i12 == 2) {
                    y8Var.setText(org.telegram.messenger.hd.a0("SaveToGalleryVideoHintGroup", null, 2131745915, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            y8Var.setText(((yy0) arrayList.get(i7)).d);
        } else if (((yy0) arrayList.get(i7)).f56015a == 5) {
            ((org.telegram.ui.Cells.n4) view).setText(((yy0) arrayList.get(i7)).d);
        } else if (((yy0) arrayList.get(i7)).f56015a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            org.telegram.messenger.ov ovVar = ((yy0) arrayList.get(i7)).f53749c;
            TLObject e22 = saveToGallerySettingsActivity.getMessagesController().e2(ovVar.d);
            if (e22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) e22;
                if (user.self) {
                    str = org.telegram.messenger.hd.M0(2131745901, null);
                } else {
                    str = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                }
            } else if (e22 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) e22).title;
            } else {
                str = null;
            }
            paVar.setSelfAsSavedMessages(true);
            StringBuilder sb2 = new StringBuilder();
            if (ovVar.a()) {
                if (ovVar.f25992a) {
                    sb2.append(org.telegram.messenger.hd.M0(2131745920, null));
                }
                if (ovVar.f25993b) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    long j10 = ovVar.f25994c;
                    if (j10 > 0 && j10 < 4194304000L) {
                        sb2.append(org.telegram.messenger.hd.a0("SaveToGalleryVideosUpTo", null, 2131745912, org.telegram.messenger.g0.i0(j10, true, false)));
                    } else {
                        sb2.append(org.telegram.messenger.hd.a0("SaveToGalleryVideos", null, 2131745913, new Object[0]));
                    }
                }
            } else {
                sb2.append(org.telegram.messenger.hd.M0(2131745921, null));
            }
            if (i7 == arrayList.size() - 1 || ((yy0) arrayList.get(i7 + 1)).f56015a == 2) {
                z10 = true;
            }
            paVar.d(e22, str, sb2, z10);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        LinearLayout linearLayout;
        float f10;
        int i10;
        TLObject M0;
        int i11;
        org.telegram.ui.Cells.oa oaVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i7) {
            case 1:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.o(2131232100, org.telegram.messenger.hd.M0(2131747923, null), true);
                l8Var.g(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var, null);
                view = l8Var;
                break;
            case 2:
                View paVar = new org.telegram.ui.Cells.pa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, paVar, null);
                linearLayout = paVar;
                view = linearLayout;
                break;
            case 3:
                oaVar = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.y0) null);
                view = oaVar;
                break;
            case 4:
                org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var2.k(org.telegram.messenger.hd.M0(2131747915, null), false);
                l8Var2.g(-1, org.telegram.ui.ActionBar.j6.f29070p7);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var2, null);
                oaVar = l8Var2;
                view = oaVar;
                break;
            case 5:
                View n4Var = new org.telegram.ui.Cells.n4(viewGroup.getContext());
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, null);
                oaVar = n4Var;
                view = oaVar;
                break;
            case 6:
                View q8Var = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, q8Var, null);
                oaVar = q8Var;
                view = oaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.y8(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                zy0 zy0Var = new zy0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                zy0Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
                zy0Var.setText(org.telegram.messenger.g0.i0(524288L, true, false));
                frameLayout.addView(zy0Var, c8.ja.e(-2, -2, 83));
                zy0 zy0Var2 = new zy0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                zy0Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
                frameLayout.addView(zy0Var2, c8.ja.e(-2, -2, 81));
                zy0 zy0Var3 = new zy0(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                zy0Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
                zy0Var3.setText(org.telegram.messenger.g0.i0(4194304000L, true, false));
                frameLayout.addView(zy0Var3, c8.ja.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, c8.ja.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(qm0Var, c8.ja.t(-1, 38, 0, 5, 0, 5, 4));
                long j3 = saveToGallerySettingsActivity.c0().f25994c;
                if (j3 < 0 || j3 > 4194304000L) {
                    j3 = 4194304000L;
                }
                qm0Var.setReportChanges(true);
                qm0Var.setDelegate(new a8.r7(this, qm0Var, zy0Var, zy0Var2, zy0Var3));
                if (((float) j3) > ((float) 104857600) * 0.7f) {
                    f10 = com.google.android.gms.internal.vision.e2.c((float) (j3 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f10 = (((float) (j3 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                qm0Var.setProgress(f10);
                qm0Var.f38725y.l(false, qm0Var.getProgress());
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, linearLayout2, null);
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.oa oaVar2 = new org.telegram.ui.Cells.oa(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (org.telegram.messenger.m5.E(saveToGallerySettingsActivity.f43259b)) {
                    i11 = ((org.telegram.ui.ActionBar.e2) saveToGallerySettingsActivity).currentAccount;
                    M0 = org.telegram.messenger.np.s1(i11).a2(Long.valueOf(saveToGallerySettingsActivity.f43259b));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.e2) saveToGallerySettingsActivity).currentAccount;
                    M0 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-saveToGallerySettingsActivity.f43259b));
                }
                oaVar2.a(null, M0);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, oaVar2, saveToGallerySettingsActivity.getResourceProvider());
                oaVar = oaVar2;
                view = oaVar;
                break;
            case 10:
                oaVar = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.y0) null);
                view = oaVar;
                break;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
