package ru.noties.jlatexmath;

import android.content.Context;
import android.graphics.Typeface;
import java.io.IOException;
import java.io.InputStream;

public abstract class JLatexMathAndroid {
    private static final String BASE = "org/scilab/forge/jlatexmath/";
    private static Context sContext;

    public static void init(Context context) {
        sContext = context.getApplicationContext();
    }

    public static InputStream getResourceAsStream(String str) {
        try {
            return context().getAssets().open("org/scilab/forge/jlatexmath/" + str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Typeface loadTypeface(String str) {
        return Typeface.createFromAsset(context().getAssets(), "org/scilab/forge/jlatexmath/" + str);
    }

    private JLatexMathAndroid() {
    }

    private static Context context() {
        Context context = sContext;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Please call `#init(Context)` method to initialize jLatexMath");
    }
}
