package z;

import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public abstract class a {
    public static int a() {
        ClassLoader classLoader = a.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
        if (resourceAsStream != null) {
            try {
                String readLine = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
                int parseInt = Integer.parseInt(readLine);
                if (parseInt >= 1 && parseInt <= 7) {
                    return parseInt;
                }
                throw new IllegalStateException("Unrecognized Car API level: " + readLine);
            } catch (IOException unused) {
                throw new IllegalStateException("Unable to read Car API level file");
            }
        }
        throw new IllegalStateException("Car API level file car-app-api.level not found");
    }
}
