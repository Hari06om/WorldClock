# 🌍 World Clock

An interactive Java Swing application that displays real-time clocks for different time zones around the world. Simply hover your mouse over different regions on the world map to see the current time and date for that location.

## ✨ Features




- **Interactive World Map**: Hover over different countries to see their local time
- **Real-time Updates**: Time and date update dynamically as you move your mouse
- **Multiple Time Zones**: Currently supports:
  - 🇦🇺 Australia (Sydney)
  - 🇨🇦 Canada (Chicago timezone)
  - 🌐 System Default (your local timezone)
- **Clean UI**: Simple and intuitive graphical interface
- **Responsive Design**: 1000x700 pixel window with fixed dimensions

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A world map image file named `World1.jpg`

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/world-clock.git
   cd world-clock
   ```

2. **Add the world map image**
   - Place your world map image in the project directory
   - Ensure it's named `World1.jpg`

3. **Compile the Java file**
   ```bash
   javac WorldClock.java
   ```

4. **Run the application**
   ```bash
   java WorldClock
   ```

## 🎮 How to Use

1. **Launch the application** - A window will open displaying the world map
2. **Hover over regions** - Move your mouse over different areas of the map
3. **View time zones** - The header will display the current time zone, time, and date
4. **Explore different regions** - Currently supports Australia and Canada regions

### Interactive Regions

| Region | Coordinates | Time Zone |
|--------|-------------|-----------|
| Australia | (800-900, 520-580) | Australia/Sydney |
| Canada | (100-270, 180-310) | America/Chicago |
| Other areas | - | System Default |

## 🛠️ Technical Details

- **Language**: Java
- **GUI Framework**: Swing
- **Time Handling**: Java Time API (LocalDate, LocalTime, ZoneId)
- **Event Handling**: MouseMotionListener for interactive hover effects
- **Image Loading**: ImageIcon for map display

## 📁 Project Structure

```
world-clock/
├── WorldClock.java     # Main application file
├── World1.jpg          # World map image (required)
└── README.md          # This file
```

## 🎯 Future Enhancements

- [ ] Add more countries and time zones
- [ ] Implement click-to-pin functionality
- [ ] Add digital clock display options
- [ ] Include country flags and names
- [ ] Add time zone conversion features
- [ ] Implement different map projections
- [ ] Add keyboard shortcuts

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Ideas for Contributions

- Add more time zones and countries
- Improve the UI/UX design
- Add unit tests
- Optimize coordinate detection
- Add configuration files for easy customization

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Your Name**
- GitHub: [Hari06om](https://github.com/Hari06om)


## 🙏 Acknowledgments

- Thanks to the Java community for excellent documentation
- World map image source: [Add your source here]
- Inspiration from various world clock applications

## 📞 Support

If you encounter any issues or have questions:

1. Check the [Issues](https://github.com/HAri06om/world-clock/issues) page
2. Create a new issue if your problem isn't already reported
3. Provide detailed information about your system and the issue

---

⭐ **Star this repository if you found it helpful!** ⭐
