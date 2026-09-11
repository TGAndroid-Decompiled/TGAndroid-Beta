package r0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class k {
    public ViewParent f44704a;
    public ViewParent f44705b;
    public final ViewGroup f44706c;
    public boolean d;
    public int[] f44707e;

    public k(ViewGroup viewGroup) {
        this.f44706c = viewGroup;
    }

    public final boolean a(float f7, float f10, boolean z10) {
        ViewParent e7;
        if (this.d && (e7 = e(0)) != null) {
            try {
                return e7.onNestedFling(this.f44706c, f7, f10, z10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f7, float f10) {
        ViewParent e7;
        if (this.d && (e7 = e(0)) != null) {
            try {
                return e7.onNestedPreFling(this.f44706c, f7, f10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent e7;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.d || (e7 = e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f44706c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f44707e == null) {
                this.f44707e = new int[2];
            }
            iArr3 = this.f44707e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e7 instanceof l) {
            ((l) e7).E(viewGroup, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                e7.onNestedPreScroll(viewGroup, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent e7;
        int i15;
        int i16;
        int[] iArr3;
        if (this.d && (e7 = e(i14)) != null) {
            if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    return false;
                }
            } else {
                ViewGroup viewGroup = this.f44706c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (this.f44707e == null) {
                        this.f44707e = new int[2];
                    }
                    int[] iArr4 = this.f44707e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e7 instanceof m) {
                    ((m) e7).i(viewGroup, i10, i11, i12, i13, i14, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i12;
                    iArr3[1] = iArr3[1] + i13;
                    if (e7 instanceof l) {
                        ((l) e7).b(viewGroup, i10, i11, i12, i13, i14);
                    } else if (i14 == 0) {
                        try {
                            e7.onNestedScroll(viewGroup, i10, i11, i12, i13);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedScroll", e10);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i15;
                    iArr[1] = iArr[1] - i16;
                }
                return true;
            }
        }
        return false;
    }

    public final ViewParent e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f44705b;
        }
        return this.f44704a;
    }

    public final boolean f(int i10) {
        if (e(i10) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i10, int i11) {
        boolean onStartNestedScroll;
        if (!f(i11)) {
            if (this.d) {
                View view = this.f44706c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z10 = parent instanceof l;
                    if (z10) {
                        onStartNestedScroll = ((l) parent).p(view2, view, i10, i11);
                    } else {
                        if (i11 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                            } catch (AbstractMethodError e7) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e7);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i11 != 0) {
                            if (i11 == 1) {
                                this.f44705b = parent;
                            }
                        } else {
                            this.f44704a = parent;
                        }
                        if (z10) {
                            ((l) parent).s(view2, view, i10, i11);
                        } else if (i11 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i10);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i10) {
        ViewParent e7 = e(i10);
        if (e7 != null) {
            boolean z10 = e7 instanceof l;
            ViewGroup viewGroup = this.f44706c;
            if (z10) {
                ((l) e7).n(i10, viewGroup);
            } else if (i10 == 0) {
                try {
                    e7.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f44705b = null;
                    return;
                }
                return;
            }
            this.f44704a = null;
        }
    }
}
