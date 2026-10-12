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
public abstract class w7 extends FrameLayout implements org.telegram.ui.Components.ld0 {
    public final ArrayList f41170a;
    public final org.telegram.ui.Components.j91 f41171b;
    public final View f41172c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final ArrayList e;
    public ai.c f41173f;
    public final org.telegram.ui.Components.k91 h;
    public final v7[] f41174n;
    public l7 f41175r;
    public int f41176s;
    public m7 v;

    public w7(Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context);
        this.f41170a = new ArrayList();
        this.e = new ArrayList();
        v7[] v7VarArr = new v7[5];
        this.f41174n = v7VarArr;
        this.d = m2Var;
        v7VarArr[0] = new v7(LocaleController.getString(R.string.FilterChats), 0, new n7(this));
        v7VarArr[1] = new v7(LocaleController.getString(R.string.MediaTab), 1, new s7(this));
        v7VarArr[2] = new v7(LocaleController.getString(R.string.SharedFilesTab2), 2, new p7(this));
        v7VarArr[3] = new v7(LocaleController.getString(R.string.Music), 3, new u7(this));
        int i10 = 0;
        while (true) {
            v7[] v7VarArr2 = this.f41174n;
            if (i10 < v7VarArr2.length) {
                v7 v7Var = v7VarArr2[i10];
                if (v7Var != null) {
                    this.e.add(i10, v7Var);
                }
                i10++;
            } else {
                org.telegram.ui.Components.k91 k91Var = new org.telegram.ui.Components.k91(getContext(), null);
                this.h = k91Var;
                k91Var.setAllowDisallowInterceptTouch(false);
                addView(k91Var, w7.a6.a(-1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                org.telegram.ui.Components.j91 n10 = k91Var.n(3, true);
                this.f41171b = n10;
                addView(n10, w7.a6.d(48.0f, -1));
                View view = new View(getContext());
                this.f41172c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19902d7, false));
                addView(view, w7.a6.a(1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                view.getLayoutParams().height = 1;
                k91Var.setAdapter(new i7(this, context, m2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.a6.d(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(true);
                imageView.setImageDrawable(f2Var);
                int i11 = org.telegram.ui.ActionBar.g6.f20290y8;
                f2Var.a(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.g6.f20307z8;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f41170a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final w7 f35474b;

                    {
                        this.f35474b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f35474b.v.i1();
                                return;
                            default:
                                this.f35474b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, true, true);
                s6Var.setTextSize(AndroidUtilities.dp(18.0f));
                s6Var.setTypeface(AndroidUtilities.bold());
                s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                linearLayout.addView(s6Var, w7.a6.m(1.0f, 0, -1, 18, 0, 0));
                this.f41170a.add(s6Var);
                org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, org.telegram.ui.ActionBar.g6.x0(null, i12, false), org.telegram.ui.ActionBar.g6.x0(null, i11, false), false, null);
                u0Var.setIcon(R.drawable.msg_clear);
                u0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                u0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(u0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f41170a.add(u0Var);
                u0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final w7 f35474b;

                    {
                        this.f35474b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f35474b.v.i1();
                                return;
                            default:
                                this.f35474b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(w7 w7Var, q7 q7Var, s7 s7Var, org.telegram.ui.Components.mm0 mm0Var) {
        ArrayList arrayList = s7Var.e;
        PhotoViewer.t1().K2(null, w7Var.d, null);
        if (w7Var.f41175r == null) {
            w7Var.f41175r = new l7(w7Var);
        }
        w7Var.f41175r.f37860a = mm0Var;
        if (arrayList.indexOf(q7Var) >= 0) {
            PhotoViewer.t1().g2(s7Var.f39979r, arrayList.indexOf(q7Var), -1, false, w7Var.f41175r, null);
        }
    }

    public static void b(w7 w7Var, ai.b bVar, o7 o7Var) {
        org.telegram.ui.ActionBar.m2 m2Var = w7Var.d;
        org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) w7Var.h.getCurrentView();
        if (o7Var.e == 2) {
            if (mm0Var.getAdapter() instanceof p7) {
                p7 p7Var = (p7) mm0Var.getAdapter();
                PhotoViewer.t1().K2(null, m2Var, null);
                if (w7Var.f41175r == null) {
                    w7Var.f41175r = new l7(w7Var);
                }
                w7Var.f41175r.f37860a = mm0Var;
                File file = bVar.f915a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, m2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    boolean z10 = true;
                    if (bVar.d != 1) {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().g2(arrayList, 0, -1, false, w7Var.f41175r, null);
                }
            } else {
                return;
            }
        }
        if (o7Var.e == 3) {
            if (MediaController.getInstance().isPlayingMessage(bVar.f918f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(bVar.f918f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(bVar.f918f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(bVar.f918f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.k91 k91Var = this.h;
            if (i10 < k91Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.mm0) k91Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.mm0 getListView() {
        org.telegram.ui.Components.k91 k91Var = this.h;
        if (k91Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.mm0) k91Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f41176s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.k91 k91Var = this.h;
            if (i11 < k91Var.getViewPages().length) {
                org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) k91Var.getViewPages()[i11];
                if (mm0Var != null) {
                    mm0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(ai.c cVar) {
        this.f41173f = cVar;
        c();
    }

    public void setDelegate(m7 m7Var) {
        this.v = m7Var;
    }
}
