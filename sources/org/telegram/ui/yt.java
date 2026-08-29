package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yt extends org.telegram.ui.Components.il0 {
    public final Context f44966c;
    public final DataAutoDownloadActivity d;

    public yt(DataAutoDownloadActivity dataAutoDownloadActivity, Context context) {
        this.d = dataAutoDownloadActivity;
        this.f44966c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = n1Var.b();
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i10 = dataAutoDownloadActivity.photosRow;
        if (b10 != i10) {
            i11 = dataAutoDownloadActivity.videosRow;
            if (b10 != i11) {
                i12 = dataAutoDownloadActivity.filesRow;
                if (b10 != i12) {
                    i13 = dataAutoDownloadActivity.storiesRow;
                    if (b10 != i13) {
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
        return this.d.f35519x;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i11 = dataAutoDownloadActivity.autoDownloadRow;
        if (i10 == i11) {
            return 0;
        }
        if (i10 == dataAutoDownloadActivity.f35517s) {
            return 1;
        }
        if (i10 != dataAutoDownloadActivity.f35516r && i10 != dataAutoDownloadActivity.v) {
            i12 = dataAutoDownloadActivity.usageProgressRow;
            if (i10 != i12) {
                i13 = dataAutoDownloadActivity.photosRow;
                if (i10 != i13) {
                    i14 = dataAutoDownloadActivity.videosRow;
                    if (i10 != i14) {
                        i15 = dataAutoDownloadActivity.filesRow;
                        if (i10 != i15) {
                            i16 = dataAutoDownloadActivity.storiesRow;
                            if (i10 != i16) {
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String string;
        int i17;
        DownloadController.Preset currentRoamingPreset;
        int i18;
        int i19;
        int i20;
        StringBuilder sb2;
        StringBuilder sb3;
        int i21;
        boolean z10;
        int i22;
        boolean z11;
        boolean z12;
        int i23;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        int i24 = dataAutoDownloadActivity.f35514f;
        DownloadController.Preset preset = dataAutoDownloadActivity.C;
        int i25 = n1Var.f6436f;
        View view = n1Var.f6432a;
        int i26 = 0;
        if (i25 != 0) {
            if (i25 != 2) {
                if (i25 != 3) {
                    int i27 = -1;
                    if (i25 != 4) {
                        if (i25 == 5) {
                            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                            if (i10 == dataAutoDownloadActivity.f35518w) {
                                y8Var.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                                y8Var.setFixedSize(0);
                                y8Var.setImportantForAccessibility(1);
                                return;
                            } else if (i10 == dataAutoDownloadActivity.f35515n) {
                                if (dataAutoDownloadActivity.f35516r == -1) {
                                    if (i24 == 0) {
                                        y8Var.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                                    } else if (i24 == 1) {
                                        y8Var.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                                    } else if (i24 == 2) {
                                        y8Var.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                                    }
                                    y8Var.setImportantForAccessibility(1);
                                    return;
                                }
                                y8Var.setText(null);
                                y8Var.setFixedSize(12);
                                y8Var.setImportantForAccessibility(4);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                    h5Var.setDrawLine(true);
                    i14 = dataAutoDownloadActivity.photosRow;
                    if (i10 != i14) {
                        i15 = dataAutoDownloadActivity.videosRow;
                        if (i10 != i15) {
                            i16 = dataAutoDownloadActivity.storiesRow;
                            if (i10 == i16) {
                                string = LocaleController.getString(R.string.AutoDownloadStories);
                                h5Var.setDrawLine(false);
                            } else {
                                string = LocaleController.getString(R.string.AutoDownloadFiles);
                                i27 = 8;
                            }
                        } else {
                            string = LocaleController.getString(R.string.AutoDownloadVideos);
                            i27 = 4;
                        }
                    } else {
                        string = LocaleController.getString(R.string.AutoDownloadPhotos);
                        i27 = 1;
                    }
                    if (i24 == 0) {
                        i23 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
                        currentRoamingPreset = DownloadController.getInstance(i23).getCurrentMobilePreset();
                    } else if (i24 == 1) {
                        i18 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
                        currentRoamingPreset = DownloadController.getInstance(i18).getCurrentWiFiPreset();
                    } else {
                        i17 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
                        currentRoamingPreset = DownloadController.getInstance(i17).getCurrentRoamingPreset();
                    }
                    long j10 = currentRoamingPreset.sizes[DownloadController.typeToIndex(i27)];
                    StringBuilder sb4 = new StringBuilder();
                    i19 = dataAutoDownloadActivity.storiesRow;
                    if (i10 == i19) {
                        if (currentRoamingPreset.preloadStories) {
                            sb3 = new StringBuilder(LocaleController.formatString("AutoDownloadOn", R.string.AutoDownloadOn, sb4.toString()));
                            i26 = 1;
                        } else {
                            sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOff", R.string.AutoDownloadOff, sb4.toString()));
                            sb3 = sb2;
                        }
                    } else {
                        int i28 = 0;
                        while (true) {
                            int[] iArr = currentRoamingPreset.mask;
                            if (i28 >= iArr.length) {
                                break;
                            }
                            if ((iArr[i28] & i27) != 0) {
                                if (sb4.length() != 0) {
                                    sb4.append(", ");
                                }
                                if (i28 != 0) {
                                    if (i28 != 1) {
                                        if (i28 != 2) {
                                            if (i28 == 3) {
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
                                i26++;
                            }
                            i28++;
                        }
                        if (i26 == 4) {
                            sb4.setLength(0);
                            i21 = dataAutoDownloadActivity.photosRow;
                            if (i10 == i21) {
                                sb4.append(LocaleController.getString(R.string.AutoDownloadOnAllChats));
                            } else {
                                sb4.append(LocaleController.formatString("AutoDownloadUpToOnAllChats", R.string.AutoDownloadUpToOnAllChats, AndroidUtilities.formatFileSize(j10)));
                            }
                        } else if (i26 != 0) {
                            i20 = dataAutoDownloadActivity.photosRow;
                            if (i10 == i20) {
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
                        if (i26 != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        h5Var.setChecked(z12);
                    }
                    if (i26 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i22 = dataAutoDownloadActivity.storiesRow;
                    if (i10 != i22) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h5Var.b(string, sb3, 0, z10, 0, true, z11, false);
                    return;
                }
                dataAutoDownloadActivity.m0((org.telegram.ui.Components.lv0) view);
                return;
            }
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (i10 == dataAutoDownloadActivity.f35516r) {
                k4Var.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                return;
            } else if (i10 == dataAutoDownloadActivity.v) {
                k4Var.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
        i11 = dataAutoDownloadActivity.autoDownloadRow;
        if (i10 == i11) {
            q8Var.setDrawCheckRipple(true);
            q8Var.f(LocaleController.getString(R.string.AutoDownloadMedia), preset.enabled, false);
            if (preset.enabled) {
                i12 = org.telegram.ui.ActionBar.g6.f23099f6;
            } else {
                i12 = org.telegram.ui.ActionBar.g6.f23080e6;
            }
            q8Var.setTag(Integer.valueOf(i12));
            if (preset.enabled) {
                i13 = org.telegram.ui.ActionBar.g6.f23099f6;
            } else {
                i13 = org.telegram.ui.ActionBar.g6.f23080e6;
            }
            q8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.lv0 lv0Var;
        Context context = this.f44966c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            lv0Var = new org.telegram.ui.Cells.y8(context);
                        } else {
                            lv0Var = new org.telegram.ui.Cells.h5(context);
                        }
                    } else {
                        org.telegram.ui.Components.lv0 lv0Var2 = new org.telegram.ui.Components.lv0(context, null);
                        lv0Var2.setCallback(new xt(this, 0));
                        lv0Var = lv0Var2;
                    }
                } else {
                    lv0Var = new org.telegram.ui.Cells.k4(context);
                }
            } else {
                lv0Var = new org.telegram.ui.Cells.x6(context, (b) null);
            }
        } else {
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            q8Var.d(org.telegram.ui.ActionBar.g6.f23117g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
            q8Var.setTypeface(AndroidUtilities.bold());
            q8Var.setHeight(56);
            lv0Var = q8Var;
        }
        return th.m(lv0Var, lv0Var, -1, -2);
    }
}
