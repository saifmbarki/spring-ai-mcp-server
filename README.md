# Spring AI MCP Server

A simple **Java Spring Boot server** integrated with **Spring AI** to provide an **MCP (Model Context Protocol) server**.  

MCP servers allow tools like **AI inspectors** or applications like **Claude Desktop** to connect and interact with your backend, making it easy to test AI-driven features or manage data.

## Use Case

This server can be used to:  

- Test AI models locally via MCP  
- Integrate with AI tools like **MCP Inspector** or **Claude Desktop**  
- Quickly explore AI responses or backend data in a standard interface  

## Getting Started

### Prerequisites

- Java 17+  
- Maven or Gradle (for building)  
- Node.js (for MCP Inspector or integration)  

### Installation & Run

1. Clone the repository:
```bash
git clone https://github.com/yourusername/your-repo.git
cd your-repo

Run the server and visit this endpoint and see what it respond
http://localhost:8080/mcp

### Testing with MCP Inspector

## Run the following command to inspect your server:

npx @modelcontextprotocol/inspector node build/index.js

### Integrate with Claude Desktop

## Add this configuration to connect your server:

{
  "mcpServers": {
    "my-mcp-server": {
      "command": "npx",
      "args": ["mcp-remote", "http://localhost:8080/mcp"]
    }
  }
}
