package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xt extends org.telegram.ui.Components.vk0 {
    public final Context f44586c;
    public final DataAutoDownloadActivity d;

    public xt(DataAutoDownloadActivity dataAutoDownloadActivity, Context context) {
        this.d = dataAutoDownloadActivity;
        this.f44586c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int b10 = q1Var.b();
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i9 = dataAutoDownloadActivity.photosRow;
        if (b10 != i9) {
            i10 = dataAutoDownloadActivity.videosRow;
            if (b10 != i10) {
                i11 = dataAutoDownloadActivity.filesRow;
                if (b10 != i11) {
                    i12 = dataAutoDownloadActivity.storiesRow;
                    if (b10 != i12) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.f35452x;
    }

    @Override
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i10 = dataAutoDownloadActivity.autoDownloadRow;
        if (i9 == i10) {
            return 0;
        }
        if (i9 == dataAutoDownloadActivity.f35450s) {
            return 1;
        }
        if (i9 != dataAutoDownloadActivity.f35449r && i9 != dataAutoDownloadActivity.v) {
            i11 = dataAutoDownloadActivity.usageProgressRow;
            if (i9 != i11) {
                i12 = dataAutoDownloadActivity.photosRow;
                if (i9 != i12) {
                    i13 = dataAutoDownloadActivity.videosRow;
                    if (i9 != i13) {
                        i14 = dataAutoDownloadActivity.filesRow;
                        if (i9 != i14) {
                            i15 = dataAutoDownloadActivity.storiesRow;
                            if (i9 != i15) {
                                return 5;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String string;
        int i16;
        DownloadController.Preset currentRoamingPreset;
        int i17;
        int i18;
        int i19;
        StringBuilder sb2;
        StringBuilder sb3;
        int i20;
        boolean z10;
        int i21;
        boolean z11;
        boolean z12;
        int i22;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        int i23 = dataAutoDownloadActivity.f35447f;
        DownloadController.Preset preset = dataAutoDownloadActivity.C;
        int i24 = q1Var.f5505f;
        View view = q1Var.f5501a;
        int i25 = 0;
        if (i24 != 0) {
            if (i24 != 2) {
                if (i24 != 3) {
                    int i26 = -1;
                    if (i24 != 4) {
                        if (i24 == 5) {
                            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                            if (i9 == dataAutoDownloadActivity.f35451w) {
                                b9Var.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                                b9Var.setFixedSize(0);
                                b9Var.setImportantForAccessibility(1);
                                return;
                            } else if (i9 == dataAutoDownloadActivity.f35448n) {
                                if (dataAutoDownloadActivity.f35449r == -1) {
                                    if (i23 == 0) {
                                        b9Var.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                                    } else if (i23 == 1) {
                                        b9Var.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                                    } else if (i23 == 2) {
                                        b9Var.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                                    }
                                    b9Var.setImportantForAccessibility(1);
                                    return;
                                }
                                b9Var.setText(null);
                                b9Var.setFixedSize(12);
                                b9Var.setImportantForAccessibility(4);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    j5Var.setDrawLine(true);
                    i13 = dataAutoDownloadActivity.photosRow;
                    if (i9 != i13) {
                        i14 = dataAutoDownloadActivity.videosRow;
                        if (i9 != i14) {
                            i15 = dataAutoDownloadActivity.storiesRow;
                            if (i9 == i15) {
                                string = LocaleController.getString(R.string.AutoDownloadStories);
                                j5Var.setDrawLine(false);
                            } else {
                                string = LocaleController.getString(R.string.AutoDownloadFiles);
                                i26 = 8;
                            }
                        } else {
                            string = LocaleController.getString(R.string.AutoDownloadVideos);
                            i26 = 4;
                        }
                    } else {
                        string = LocaleController.getString(R.string.AutoDownloadPhotos);
                        i26 = 1;
                    }
                    if (i23 == 0) {
                        i22 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
                        currentRoamingPreset = DownloadController.getInstance(i22).getCurrentMobilePreset();
                    } else if (i23 == 1) {
                        i17 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
                        currentRoamingPreset = DownloadController.getInstance(i17).getCurrentWiFiPreset();
                    } else {
                        i16 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
                        currentRoamingPreset = DownloadController.getInstance(i16).getCurrentRoamingPreset();
                    }
                    long j10 = currentRoamingPreset.sizes[DownloadController.typeToIndex(i26)];
                    StringBuilder sb4 = new StringBuilder();
                    i18 = dataAutoDownloadActivity.storiesRow;
                    if (i9 == i18) {
                        if (currentRoamingPreset.preloadStories) {
                            sb3 = new StringBuilder(LocaleController.formatString("AutoDownloadOn", R.string.AutoDownloadOn, sb4.toString()));
                            i25 = 1;
                        } else {
                            sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOff", R.string.AutoDownloadOff, sb4.toString()));
                            sb3 = sb2;
                        }
                    } else {
                        int i27 = 0;
                        while (true) {
                            int[] iArr = currentRoamingPreset.mask;
                            if (i27 >= iArr.length) {
                                break;
                            }
                            if ((iArr[i27] & i26) != 0) {
                                if (sb4.length() != 0) {
                                    sb4.append(", ");
                                }
                                if (i27 != 0) {
                                    if (i27 != 1) {
                                        if (i27 != 2) {
                                            if (i27 == 3) {
                                                sb4.append(LocaleController.getString(R.string.AutoDownloadChannels));
                                            }
                                        } else {
                                            sb4.append(LocaleController.getString(R.string.AutoDownloadGroups));
                                        }
                                    } else {
                                        sb4.append(LocaleController.getString(R.string.AutoDownloadPm));
                                    }
                                } else {
                                    sb4.append(LocaleController.getString(R.string.AutoDownloadContacts));
                                }
                                i25++;
                            }
                            i27++;
                        }
                        if (i25 == 4) {
                            sb4.setLength(0);
                            i20 = dataAutoDownloadActivity.photosRow;
                            if (i9 == i20) {
                                sb4.append(LocaleController.getString(R.string.AutoDownloadOnAllChats));
                            } else {
                                sb4.append(LocaleController.formatString("AutoDownloadUpToOnAllChats", R.string.AutoDownloadUpToOnAllChats, AndroidUtilities.formatFileSize(j10)));
                            }
                        } else if (i25 != 0) {
                            i19 = dataAutoDownloadActivity.photosRow;
                            if (i9 == i19) {
                                sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOnFor", R.string.AutoDownloadOnFor, sb4.toString()));
                            } else {
                                sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOnUpToFor", R.string.AutoDownloadOnUpToFor, AndroidUtilities.formatFileSize(j10), sb4.toString()));
                            }
                            sb3 = sb2;
                        } else {
                            sb4.append(LocaleController.getString(R.string.AutoDownloadOff));
                        }
                        sb3 = sb4;
                    }
                    if (dataAutoDownloadActivity.h) {
                        if (i25 != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        j5Var.setChecked(z12);
                    }
                    if (i25 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i21 = dataAutoDownloadActivity.storiesRow;
                    if (i9 != i21) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j5Var.b(string, sb3, 0, z10, 0, true, z11, false);
                    return;
                }
                dataAutoDownloadActivity.l0((org.telegram.ui.Components.bv0) view);
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 == dataAutoDownloadActivity.f35449r) {
                m4Var.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                return;
            } else if (i9 == dataAutoDownloadActivity.v) {
                m4Var.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
        i10 = dataAutoDownloadActivity.autoDownloadRow;
        if (i9 == i10) {
            t8Var.setDrawCheckRipple(true);
            t8Var.f(LocaleController.getString(R.string.AutoDownloadMedia), preset.enabled, false);
            if (preset.enabled) {
                i11 = org.telegram.ui.ActionBar.f6.f23037f6;
            } else {
                i11 = org.telegram.ui.ActionBar.f6.f23019e6;
            }
            t8Var.setTag(Integer.valueOf(i11));
            if (preset.enabled) {
                i12 = org.telegram.ui.ActionBar.f6.f23037f6;
            } else {
                i12 = org.telegram.ui.ActionBar.f6.f23019e6;
            }
            t8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Components.bv0 bv0Var;
        Context context = this.f44586c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            bv0Var = new org.telegram.ui.Cells.b9(context);
                        } else {
                            bv0Var = new org.telegram.ui.Cells.j5(context);
                        }
                    } else {
                        org.telegram.ui.Components.bv0 bv0Var2 = new org.telegram.ui.Components.bv0(context, null);
                        bv0Var2.setCallback(new wt(this, 0));
                        bv0Var = bv0Var2;
                    }
                } else {
                    bv0Var = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                bv0Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
            }
        } else {
            org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.d(org.telegram.ui.ActionBar.f6.f23055g6, org.telegram.ui.ActionBar.f6.O6, org.telegram.ui.ActionBar.f6.P6, org.telegram.ui.ActionBar.f6.Q6, org.telegram.ui.ActionBar.f6.R6);
            t8Var.setTypeface(AndroidUtilities.bold());
            t8Var.setHeight(56);
            bv0Var = t8Var;
        }
        return j3.r0.s(bv0Var, bv0Var, -1, -2);
    }
}
