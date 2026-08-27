package rh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;

public final class v4 implements u9 {

    public final int f47520a;

    public final Layout f47521b;

    public final int f47522c;
    public final int d;

    public v4(Layout layout, int i10, int i11, int i12) {
        this.f47520a = i12;
        this.f47521b = layout;
        this.f47522c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f47520a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f47521b;
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f47520a) {
        }
        return null;
    }

    @Override
    public final int getRow() {
        switch (this.f47520a) {
            case 0:
                return 0;
            case 1:
                return 0;
            default:
                return 1;
        }
    }

    @Override
    public final Rect getSelectionBounds() {
        switch (this.f47520a) {
        }
        return null;
    }

    @Override
    public final CharSequence getText() {
        switch (this.f47520a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f47521b.getText();
    }

    @Override
    public final int getX() {
        switch (this.f47520a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f47522c;
    }

    @Override
    public final int getY() {
        switch (this.f47520a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }
}
