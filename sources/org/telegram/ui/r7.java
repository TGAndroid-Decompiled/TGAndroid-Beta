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
public abstract class r7 extends FrameLayout implements org.telegram.ui.Components.sb0 {
    public final ArrayList f42290a;
    public final org.telegram.ui.Components.m71 f42291b;
    public final View f42292c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final ArrayList f42293e;
    public hh.b f42294f;
    public final org.telegram.ui.Components.n71 h;
    public final q7[] f42295n;
    public g7 f42296r;
    public int f42297s;
    public h7 v;

    public r7(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        this.f42290a = new ArrayList();
        this.f42293e = new ArrayList();
        q7[] q7VarArr = new q7[5];
        this.f42295n = q7VarArr;
        this.d = o2Var;
        q7VarArr[0] = new q7(LocaleController.getString(R.string.FilterChats), 0, new i7(this));
        q7VarArr[1] = new q7(LocaleController.getString(R.string.MediaTab), 1, new n7(this));
        q7VarArr[2] = new q7(LocaleController.getString(R.string.SharedFilesTab2), 2, new k7(this));
        q7VarArr[3] = new q7(LocaleController.getString(R.string.Music), 3, new p7(this));
        int i9 = 0;
        while (true) {
            q7[] q7VarArr2 = this.f42295n;
            if (i9 < q7VarArr2.length) {
                q7 q7Var = q7VarArr2[i9];
                if (q7Var != null) {
                    this.f42293e.add(i9, q7Var);
                }
                i9++;
            } else {
                org.telegram.ui.Components.n71 n71Var = new org.telegram.ui.Components.n71(getContext(), null);
                this.h = n71Var;
                n71Var.setAllowDisallowInterceptTouch(false);
                addView(n71Var, g7.e6.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.m71 n10 = n71Var.n(3, true);
                this.f42291b = n10;
                addView(n10, g7.e6.c(48.0f, -1));
                View view = new View(getContext());
                this.f42292c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23002d7, false));
                addView(view, g7.e6.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                n71Var.setAdapter(new d7(this, context, o2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, g7.e6.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
                imageView.setImageDrawable(h2Var);
                int i10 = org.telegram.ui.ActionBar.f6.f23371y8;
                h2Var.a(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                int i11 = org.telegram.ui.ActionBar.f6.f23388z8;
                imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i11, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f42290a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final r7 f45040b;

                    {
                        this.f45040b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f45040b.v.H1();
                                return;
                            default:
                                this.f45040b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
                j6Var.setTextSize(AndroidUtilities.dp(18.0f));
                j6Var.setTypeface(AndroidUtilities.bold());
                j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                linearLayout.addView(j6Var, g7.e6.m(1.0f, 0, -1, 18, 0, 0));
                this.f42290a.add(j6Var);
                org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.f6.w0(null, i11, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false), false, null);
                w0Var.setIcon(R.drawable.msg_clear);
                w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                w0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f42290a.add(w0Var);
                w0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final r7 f45040b;

                    {
                        this.f45040b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f45040b.v.H1();
                                return;
                            default:
                                this.f45040b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(r7 r7Var, l7 l7Var, n7 n7Var, org.telegram.ui.Components.wk0 wk0Var) {
        ArrayList arrayList = n7Var.f37834e;
        PhotoViewer.t1().K2(null, r7Var.d, null);
        if (r7Var.f42296r == null) {
            r7Var.f42296r = new g7(r7Var);
        }
        r7Var.f42296r.f38432a = wk0Var;
        if (arrayList.indexOf(l7Var) >= 0) {
            PhotoViewer.t1().f2(n7Var.f40606r, arrayList.indexOf(l7Var), -1, false, r7Var.f42296r, null);
        }
    }

    public static void b(r7 r7Var, hh.a aVar, j7 j7Var) {
        boolean z10;
        org.telegram.ui.ActionBar.o2 o2Var = r7Var.d;
        org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) r7Var.h.getCurrentView();
        if (j7Var.f39389e == 2) {
            if (wk0Var.getAdapter() instanceof k7) {
                k7 k7Var = (k7) wk0Var.getAdapter();
                PhotoViewer.t1().K2(null, o2Var, null);
                if (r7Var.f42296r == null) {
                    r7Var.f42296r = new g7(r7Var);
                }
                r7Var.f42296r.f38432a = wk0Var;
                File file = aVar.f10780a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, o2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (aVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().f2(arrayList, 0, -1, false, r7Var.f42296r, null);
                }
            } else {
                return;
            }
        }
        if (j7Var.f39389e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f10784f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f10784f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f10784f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f10784f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r7.c():void");
    }

    public final void d() {
        int i9 = 0;
        while (true) {
            org.telegram.ui.Components.n71 n71Var = this.h;
            if (i9 < n71Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.wk0) n71Var.getViewPages()[i9]);
                i9++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.wk0 getListView() {
        org.telegram.ui.Components.n71 n71Var = this.h;
        if (n71Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.wk0) n71Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public void setBottomPadding(int i9) {
        this.f42297s = i9;
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.n71 n71Var = this.h;
            if (i10 < n71Var.getViewPages().length) {
                org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) n71Var.getViewPages()[i10];
                if (wk0Var != null) {
                    wk0Var.setPadding(0, 0, 0, i9);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(hh.b bVar) {
        this.f42294f = bVar;
        c();
    }

    public void setDelegate(h7 h7Var) {
        this.v = h7Var;
    }
}
