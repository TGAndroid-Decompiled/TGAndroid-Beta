package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public abstract class u7 extends FrameLayout implements org.telegram.ui.Components.pd0 {
    public final ArrayList f42380a;
    public final org.telegram.ui.Components.t91 f42381b;
    public final View f42382c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final ArrayList f42383e;
    public zh.b f42384f;
    public final org.telegram.ui.Components.u91 h;
    public final t7[] f42385n;
    public j7 f42386r;
    public int f42387s;
    public k7 v;

    public u7(Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context);
        this.f42380a = new ArrayList();
        this.f42383e = new ArrayList();
        t7[] t7VarArr = new t7[5];
        this.f42385n = t7VarArr;
        this.d = m2Var;
        t7VarArr[0] = new t7(LocaleController.getString(R.string.FilterChats), 0, new l7(this));
        t7VarArr[1] = new t7(LocaleController.getString(R.string.MediaTab), 1, new q7(this));
        t7VarArr[2] = new t7(LocaleController.getString(R.string.SharedFilesTab2), 2, new n7(this));
        t7VarArr[3] = new t7(LocaleController.getString(R.string.Music), 3, new s7(this));
        int i10 = 0;
        while (true) {
            t7[] t7VarArr2 = this.f42385n;
            if (i10 < t7VarArr2.length) {
                t7 t7Var = t7VarArr2[i10];
                if (t7Var != null) {
                    this.f42383e.add(i10, t7Var);
                }
                i10++;
            } else {
                org.telegram.ui.Components.u91 u91Var = new org.telegram.ui.Components.u91(getContext(), null);
                this.h = u91Var;
                u91Var.setAllowDisallowInterceptTouch(false);
                addView(u91Var, w7.w5.a(-1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                org.telegram.ui.Components.t91 n10 = u91Var.n(3, true);
                this.f42381b = n10;
                addView(n10, w7.w5.d(48.0f, -1));
                View view = new View(getContext());
                this.f42382c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20561d7, false));
                addView(view, w7.w5.a(1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                view.getLayoutParams().height = 1;
                u91Var.setAdapter(new g7(this, context, m2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.w5.d(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(true);
                imageView.setImageDrawable(f2Var);
                int i11 = org.telegram.ui.ActionBar.h6.f20948y8;
                f2Var.a(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.h6.f20966z8;
                imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f42380a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final u7 f36345b;

                    {
                        this.f36345b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f36345b.v.g1();
                                return;
                            default:
                                this.f36345b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, true, true);
                r6Var.setTextSize(AndroidUtilities.dp(18.0f));
                r6Var.setTypeface(AndroidUtilities.bold());
                r6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                linearLayout.addView(r6Var, w7.w5.m(1.0f, 0, -1, 18, 0, 0));
                this.f42380a.add(r6Var);
                org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, org.telegram.ui.ActionBar.h6.x0(null, i12, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false), false, null);
                u0Var.setIcon(R.drawable.msg_clear);
                u0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                u0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(u0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f42380a.add(u0Var);
                u0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final u7 f36345b;

                    {
                        this.f36345b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f36345b.v.g1();
                                return;
                            default:
                                this.f36345b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(u7 u7Var, o7 o7Var, q7 q7Var, org.telegram.ui.Components.wm0 wm0Var) {
        ArrayList arrayList = q7Var.f38270e;
        PhotoViewer.t1().K2(null, u7Var.d, null);
        if (u7Var.f42386r == null) {
            u7Var.f42386r = new j7(u7Var);
        }
        u7Var.f42386r.f39110a = wm0Var;
        if (arrayList.indexOf(o7Var) >= 0) {
            PhotoViewer.t1().g2(q7Var.f41203r, arrayList.indexOf(o7Var), -1, false, u7Var.f42386r, null);
        }
    }

    public static void b(u7 u7Var, zh.a aVar, m7 m7Var) {
        org.telegram.ui.ActionBar.m2 m2Var = u7Var.d;
        org.telegram.ui.Components.wm0 wm0Var = (org.telegram.ui.Components.wm0) u7Var.h.getCurrentView();
        if (m7Var.f39938e == 2) {
            if (wm0Var.getAdapter() instanceof n7) {
                n7 n7Var = (n7) wm0Var.getAdapter();
                PhotoViewer.t1().K2(null, m2Var, null);
                if (u7Var.f42386r == null) {
                    u7Var.f42386r = new j7(u7Var);
                }
                u7Var.f42386r.f39110a = wm0Var;
                File file = aVar.f54926a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, m2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    boolean z10 = true;
                    if (aVar.d != 1) {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().g2(arrayList, 0, -1, false, u7Var.f42386r, null);
                }
            } else {
                return;
            }
        }
        if (m7Var.f39938e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f54930f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f54930f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f54930f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f54930f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.u91 u91Var = this.h;
            if (i10 < u91Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.wm0) u91Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.wm0 getListView() {
        org.telegram.ui.Components.u91 u91Var = this.h;
        if (u91Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.wm0) u91Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f42387s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.u91 u91Var = this.h;
            if (i11 < u91Var.getViewPages().length) {
                org.telegram.ui.Components.wm0 wm0Var = (org.telegram.ui.Components.wm0) u91Var.getViewPages()[i11];
                if (wm0Var != null) {
                    wm0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(zh.b bVar) {
        this.f42384f = bVar;
        c();
    }

    public void setDelegate(k7 k7Var) {
        this.v = k7Var;
    }
}
